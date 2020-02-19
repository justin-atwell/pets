package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.Dog;
import com.pets.models.DogObjects;
import com.pets.models.DogLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class DogRepositoryImpl implements DogRepository{

    private static final String getRandomImageString = "https://dog.ceo/api/breeds/image/random";

    private Connections connect = new Connections();

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


}
