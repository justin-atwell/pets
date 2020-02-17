package com.pets.repository;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.Breed;
import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DogRepositoryImpl implements DogRepository{

    private static final String getAllString = "https://dog.ceo/api/breeds/list/all";

    private static final String getRandomImageString = "https://dog.ceo/api/breeds/image/random";

        public DogBreeds getAllBreeds() throws IOException {
        //public Dog getAllBreeds() throws IOException {

            URL url = new URL(getAllString);
            HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

           if(responseCode == HttpURLConnection.HTTP_OK) {
               DogBreeds breeds = new DogBreeds();
               BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
               String output;
               while((output = reader.readLine()) != null) {
                   breeds = new ObjectMapper().readValue(output, DogBreeds.class);
               }
               return breeds;
           }
            else {
                return null;
            }
    }

        public Dog getRandomImage() throws IOException {
            URL url = new URL(getRandomImageString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {
                //return null;
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String output;
                Dog response = new Dog();
                while((output = reader.readLine()) != null) {
                    response = new ObjectMapper().readValue(output, Dog.class);

                }
                return response;
            }
            else {
                return null;
            }
        }
}
