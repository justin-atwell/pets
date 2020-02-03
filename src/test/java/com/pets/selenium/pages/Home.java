package com.pets.selenium.pages;

import com.pets.selenium.browsers.Chrome;

public class Home {

    public Chrome chrome;

    public void Home () {
        Chrome chrome = new Chrome();
    }

    public void goTo(String s) {
        Chrome.goTo("http://localhost:3000");
    }

/*
    public String title() {
        return chrome.title();
    }

*/
}
