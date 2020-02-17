package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.DogObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class DogObjectsRepositoryImpl implements DogObjectsRepository{
    private static final String getAllString = "https://dog.ceo/api/breeds/list/all";
    private Connections connect = new Connections();

    public DogObjects getAllBreeds() throws IOException {

        HttpURLConnection connection = connect.getConnection(getAllString);

        int responseCode = connection.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            DogObjects breeds = new DogObjects();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String output;
            while((output = reader.readLine()) != null) {
                breeds = new ObjectMapper().readValue(output, DogObjects.class);
            }
            return breeds;
        }
        else {
            return null;
        }
    }
}
