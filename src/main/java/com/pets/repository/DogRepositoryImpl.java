package com.pets.repository;

import com.pets.models.Dog;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class DogRepositoryImpl implements DogRepository{

    private static final String getAllString = "https://dog.ceo/api/breeds/list/all";

        //public List<Dog> getAllBreeds() throws IOException {
        public Dog getAllBreeds() throws IOException {

            URL url = new URL(getAllString);
            HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            //connection.setRequestProperty("User-Agent", USER_AGENT);
            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {

                return null;
            }
            else {
                return null;
            }
    }
}
