package com.pets.selenium.pages;

import com.pets.selenium.browsers.Chrome;

public class Home {

    public void goTo(String s) {
        Chrome.goTo("http://localhost:3000");
    }

}
