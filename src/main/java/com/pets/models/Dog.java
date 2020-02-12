package com.pets.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dog {

    private List<Breed> message;
    private String status;

    public Dog() {

    }

    public List<Breed> getMessage() {
        return message;
    }

    public void setMessage(List<Breed> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
