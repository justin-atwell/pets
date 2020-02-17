package com.pets.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DogBreeds {

    private Object message;
    private String status;

    /*@SuppressWarnings("unchecked")
    @JsonProperty("message")
    private void unpackNested(Map<String, Object> message) {
        this.breedList = (ArrayList<Breed>)message.get("message");
        //this.breedList = new ArrayList<Breed>();
        //for()
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    /*public Breed getMessage() {
        return message;
    }

    public void setMessage(Breed message) {
        this.message = message;
    }*/

    /*public Breed getBreeds() {
        return breeds;
    }

    public void setBreeds(Breed breeds) {
        this.breeds = breeds;
    }*/
}
