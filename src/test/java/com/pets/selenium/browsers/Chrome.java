package com.pets.selenium.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    static WebDriver driver = new ChromeDriver();

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void clickNewAppointment() { driver.findElement(By.cssSelector(".btn")).click(); }

    public static String scheduleButtonText() { return driver.findElement(By.cssSelector(".btn:nth-child(2)")).getText(); }

    public static String closeButtonText() {return driver.findElement(By.cssSelector(".btn-secondary")).getText();}

    public static String modalTitleText() { return driver.findElement(By.cssSelector(".modal-title")).getText(); }

    public static void close() {
        driver.close();
    }
}
