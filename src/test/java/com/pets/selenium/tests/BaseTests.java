package com.pets.selenium.tests;

import com.pets.selenium.browsers.Chrome;
import com.pets.selenium.pages.Home;
import com.pets.selenium.pages.Pages;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseTests {

    @BeforeClass
    public static void openBrowser() {
        Pages.home().goTo("http://localhost:3000");
    }

    @AfterClass
    public static void closeBrowser() {
        Chrome.close();
    }

    @Test
    public void assertHomePageTitle() {
        assertThat(Chrome.title(), is("React App"));
    }

    @Test
    public void clickingNewAppointmentOpensModalContainingScheduleButton() {
        Chrome.clickNewAppointment();
        assertThat(Chrome.scheduleButtonText(), is("Schedule"));
    }

    @Test
    public void clickingNewAppointmentOpensModalContainingCloseButton() {
        Chrome.clickNewAppointment();
        assertThat(Chrome.closeButtonText(), is("Close"));
    }

    @Test
    public void clickingNewAppointmentOpensModalTitledAppointmentScheduler() {
        Chrome.clickNewAppointment();
        assertThat(Chrome.modalTitleText(), is("Appointment Scheduler"));
    }
}
