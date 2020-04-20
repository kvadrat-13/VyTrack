package com.vytrack.test.component_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class DateAndTimeTests extends TestBase {

    @Test
    public void test1() throws InterruptedException {
//        String driver_username = ConfigurationReader.getProperty("driver_username");
//        String driver_password = ConfigurationReader.getProperty("driver_password");
//        loginPage.login(driver_username, driver_password);

        // Here I have created a method to login faster. Shorter
        loginPage.login("driver");
        loginPage.login("driver");

        // Clicked from Activities -> Calendar Events
        changeMenu("Activities", "Calendar Events");

        wait.until(ExpectedConditions.elementToBeClickable(dateAndTimeTestsPage.createCalendarEvent));

        // Clicked on creating button
        dateAndTimeTestsPage.createCalendarEvent.click();

//        wait.until(ExpectedConditions.elementToBeSelected(dateAndTimeTestsPage.startDate));

        Thread.sleep(3000);

        Thread.sleep(1000);

        dateAndTimeTestsPage.startDate.clear();
        Thread.sleep(1000);

        dateAndTimeTestsPage.startDate.sendKeys("Apr 22, 2020");

actions.click();

    }

}
