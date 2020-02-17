package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogImages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DogRepositoryImpl implements DogRepository{

    private static final String getAllString = "https://dog.ceo/api/breeds/list/all";

    private static final String getRandomImageString = "https://dog.ceo/api/breeds/image/random";

    private static final String getAllImagesString = "https://dog.ceo/api/breed/hound/images";

        public DogBreeds getAllBreeds() throws IOException {

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

        public DogImages getAllImages() throws IOException {
            URL url =new URL(getAllImagesString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(("GET"));

            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String output;
                DogImages images = new DogImages();

                while((output = reader.readLine()) != null) {
                    images = new ObjectMapper().readValue(output, DogImages.class);
                }
                return images;
            }
            else {
                return null;
            }

        }
}
