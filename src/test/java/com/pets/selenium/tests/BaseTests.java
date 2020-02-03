package com.pets.selenium.tests;

import com.pets.selenium.browsers.Chrome;
import com.pets.selenium.pages.Home;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseTests {

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
