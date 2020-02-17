package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.DogLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class DogListsRepositoryImpl implements DogListsRepository{

    private static final String getAllImagesString = "https://dog.ceo/api/breed/hound/images";

    private static final String getSomeImagesString = "https://dog.ceo/api/breeds/image/random/";

    private Connections connect = new Connections();

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
