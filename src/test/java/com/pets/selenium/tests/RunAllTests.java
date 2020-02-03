package com.pets.selenium.tests;

import com.pets.selenium.browsers.Chrome;
import com.pets.selenium.pages.Home;
import com.pets.selenium.pages.Pages;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunAllTests {

    @BeforeClass
    public static void openBrowser() {
        Pages.home().goTo("http://localhost:3000");
    }

    @AfterClass
    public static void closeBrowser() {
        Chrome.close();
    }

    @Test
    public void RunAllTestsMethod() {
        BaseTests baseTests = new BaseTests();
        baseTests.assertHomePageTitle();
        baseTests.clickingNewAppointmentOpensModalContainingCloseButton();
        baseTests.clickingNewAppointmentOpensModalContainingScheduleButton();
        baseTests.clickingNewAppointmentOpensModalTitledAppointmentScheduler();
    }
}
