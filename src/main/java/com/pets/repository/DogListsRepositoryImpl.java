package com.pets.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pets.models.DogLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class DogListsRepositoryImpl implements DogListsRepository{



    private Connections connect = new Connections();

    public DogLists getSomeImages(int number) throws IOException {
        String getSomeRandomImagesString = "https://dog.ceo/api/breeds/image/random/";
        String someString = getSomeRandomImagesString + number;
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

    public DogLists getImagesByBreed(String breed) throws IOException {
        String imageByBreedString = "https://dog.ceo/api/breed/" + breed + "/images";

        HttpURLConnection connection = connect.getConnection(imageByBreedString);
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

    public DogLists getAllImages() throws IOException {

        //TODO: Update this method and route to return a random image of any breed
        //TODO: Needs updated url to accept any breed in place of hound
        String getAllImagesString = "https://dog.ceo/api/breed/hound/images";
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
}
