package com.pets.repository;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connections {

    public HttpURLConnection getConnection(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        return connection;
    }

}
