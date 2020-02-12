package com.pets.selenium.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    ChromeDriver chromeDriver = new ChromeDriver();

    @Test
    public void openBrowser() {
        chromeDriver.get("http://www.google.com");
        //chromeDriver.get("http://localhost:8080");
    }
}
