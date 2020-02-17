package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class DogRepositoryImpl implements DogRepository{

    private static final String getAllString = "https://dog.ceo/api/breeds/list/all";

    private static final String getRandomImageString = "https://dog.ceo/api/breeds/image/random";

    private static final String getAllImagesString = "https://dog.ceo/api/breed/hound/images";

    private static final String getSomeImagesString = "https://dog.ceo/api/breeds/image/random/";

    private Connections connect = new Connections();

        public DogBreeds getAllBreeds() throws IOException {

           /* URL url = new URL(getAllString);
            HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");*/
            HttpURLConnection connection = connect.getConnection(getAllString);

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
            HttpURLConnection connection = connect.getConnection(getRandomImageString);

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

        public DogLists getAllImages() throws IOException {
            HttpURLConnection connection = connect.getConnection(getAllImagesString);
            int responseCode = connection.getResponseCode();
            if(responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String output;
                DogLists images = new DogLists();

                while((output = reader.readLine()) != null) {
                    images = new ObjectMapper().readValue(output, DogLists.class);
                }
                return images;
            }
            else {
                return null;
            }

        }

        public DogLists getSomeImages(int number) throws IOException {
            String someString = getSomeImagesString + number;
            HttpURLConnection connection = connect.getConnection(someString);
            int responseCode = connection.getResponseCode();
            if(responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String output;
                DogLists images = new DogLists();
                while((output = reader.readLine()) != null) {
                    images = new ObjectMapper().readValue(output, DogLists.class);
                }
                return images;
            }
            else {
                return null;
            }
        }
}
