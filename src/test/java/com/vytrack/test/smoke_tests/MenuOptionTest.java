package com.vytrack.test.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MenuOptionTest extends TestBase {

    @Test
    public void Driver() {
        driver.manage().window().maximize();




        // Logged in as a Driver
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);


        // Clicking on Fleet -> Vehicles  (using Actions)
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.fleet));
        actions.moveToElement(driverPage.fleet).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.vehicles));
        driverPage.vehicles.click();

        // Verifying page Title "Car - Entities - System - Car - Entities - System"
        wait.until(ExpectedConditions.titleIs("Car - Entities - System - Car - Entities - System"));
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, "Car - Entities - System - Car - Entities - System");

        // Verifying page Header "Cars"
        wait.until(ExpectedConditions.textToBePresentInElement(driverPage.pageHeader, "Car"));
        String actualHeader = driverPage.pageHeader.getText();
        assertEquals(actualHeader, "Cars");

        //Clicking on Customers -> Accounts using (Actions)
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.customers));
        actions.moveToElement(driverPage.customers).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.accounts));
        driverPage.accounts.click();

        // Verifying page Title "Accounts - Customers"
        wait.until(ExpectedConditions.titleIs("Accounts - Customers"));
        String actualTitle2 = driver.getTitle();
        assertEquals(actualTitle2, "Accounts - Customers");

        // Verifying page Header (Accounts)
        wait.until(ExpectedConditions.textToBePresentInElement(driverPage.pageHeader2, "Accounts"));
        String actualHeader2 = driverPage.pageHeader.getText();
        assertEquals(actualHeader2, "Accounts");

        // Clicking on Customers -> Contacts (using Actions)
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.customers));
        actions.moveToElement(driverPage.customers).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.contacts));
        driverPage.contacts.click();

        // Verifying page Title "Contacts - Customers"
        wait.until(ExpectedConditions.titleIs("Contacts - Customers"));
        String actualTitle3 = driver.getTitle();
        assertEquals(actualTitle3, "Contacts - Customers");

        // Verifying page Header (Contacts)
        wait.until(ExpectedConditions.textToBePresentInElement(driverPage.pageHeader3, "Contacts"));
        String actualHeader3 = driverPage.pageHeader3.getText();
        assertEquals(actualHeader3, "Contacts");

        //Clicking on Activities -> Calendar Events (using Actions)
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.activities));
        actions.moveToElement(driverPage.activities).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driverPage.calendarEvents));
        driverPage.calendarEvents.click();

        // Verifying page Title "Calendar Events - Activities"
        wait.until(ExpectedConditions.titleIs("Calendar Events - Activities"));
        String actualTitle4 = driver.getTitle();
        assertEquals(actualTitle4, "Calendar Events - Activities");

        // Verifying page Header (Calendar Events)
        wait.until(ExpectedConditions.textToBePresentInElement(driverPage.pageHeader4, "Calendar Events"));
        String actualHeader4 = driverPage.pageHeader4.getText();
        assertEquals(actualHeader4, "Calendar Events");
    }

    @Test
    public void storeManager() {

        // Logged in as Store Manager
        String username = ConfigurationReader.getProperty("store_manager_username");
        String password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(username, password);

        // Clicking Dashboards -> Dashboard
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.dashboards));
        actions.moveToElement(storeManagerPage.dashboards).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.dashboard));
        storeManagerPage.dashboard.click();

        // Verifying Page Title
        wait.until(ExpectedConditions.titleIs("Dashboard - Dashboards"));
        String title = driver.getTitle();
        assertEquals(title, "Dashboard - Dashboards");

        // Verify Page Header Dashboard
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader, "Dashboard"));
        String actualHeader = storeManagerPage.pageHeader.getText();
        assertEquals(actualHeader, "Dashboard");

        // Click on Fleet -> Vehicles
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.fleet));
        actions.moveToElement(storeManagerPage.fleet).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.vehicles));
        storeManagerPage.vehicles.click();

        //Verify Page Title - "All - Car - Entities - System - Car - Entities - System"
        wait.until(ExpectedConditions.titleIs("All - Car - Entities - System - Car - Entities - System"));
        String title2 = driver.getTitle();
        assertEquals(title2, "All - Car - Entities - System - Car - Entities - System");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader2, "All Cars"));
        String actualHeader2 = storeManagerPage.pageHeader2.getText();
        assertEquals(actualHeader2, "All Cars");

        //Click on Customers -> Accounts
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.customers));
        actions.moveToElement(storeManagerPage.customers).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.accounts));
        storeManagerPage.accounts.click();

        //Verify Page Title - "All - Accounts - Customers"
        wait.until(ExpectedConditions.titleIs("All - Accounts - Customers"));
        String title3 = driver.getTitle();
        assertEquals(title3, "All - Accounts - Customers");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader3, "All Accounts"));
        String actualHeader3 = storeManagerPage.pageHeader3.getText();
        assertEquals(actualHeader3, "All Accounts");

        //Click on Customers -> Accounts
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.customers));
        actions.moveToElement(storeManagerPage.customers).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.contacts));
        storeManagerPage.contacts.click();

        //Verify Page Title - "All - Contacts - Customers"
        wait.until(ExpectedConditions.titleIs("All - Contacts - Customers"));
        String title4 = driver.getTitle();
        assertEquals(title4, "All - Contacts - Customers");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader4, "All Contacts"));
        String actualHeader4 = storeManagerPage.pageHeader4.getText();
        assertEquals(actualHeader4, "All Contacts");

        //Click on Sales -> Opportunities
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.sales));
        actions.moveToElement(storeManagerPage.sales).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.opportunities));
        storeManagerPage.opportunities.click();

        //Verify Page Title - "Open Opportunities - Opportunities - Sales"
        wait.until(ExpectedConditions.titleIs("Open Opportunities - Opportunities - Sales"));
        wait.until(ExpectedConditions.titleIs("Open Opportunities - Opportunities - Sales"));
        String title5 = driver.getTitle();
        assertEquals(title5, "Open Opportunities - Opportunities - Sales");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader5, "Open Opportunities"));
        String actualHeader5 = storeManagerPage.pageHeader5.getText();
        assertEquals(actualHeader5, "Open Opportunities");

        //Click on Activities -> Calls
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.activities));
        actions.moveToElement(storeManagerPage.activities).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.calls));
        storeManagerPage.calls.click();

        //Verify Page Title - "All - Calls - Activities"
        wait.until(ExpectedConditions.titleIs("All - Calls - Activities"));
        String title6 = driver.getTitle();
        assertEquals(title6, "All - Calls - Activities");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader6, "All Calls"));
        String actualHeader6 = storeManagerPage.pageHeader6.getText();
        assertEquals(actualHeader6, "All Calls");

        //Click on Activities -> Calendar Events
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.activities));
        actions.moveToElement(storeManagerPage.activities).pause(2000).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storeManagerPage.calendarEvents));
        storeManagerPage.calendarEvents.click();

        //Verify Page Title - "All - Calendar Events - Activities"
        wait.until(ExpectedConditions.titleIs("All - Calendar Events - Activities"));
        String title7 = driver.getTitle();
        assertEquals(title7, "All - Calendar Events - Activities");

        //Verify Page Header
        wait.until(ExpectedConditions.textToBePresentInElement(storeManagerPage.pageHeader7, "All Calendar Events"));
        String actualHeader7 = storeManagerPage.pageHeader7.getText();
        assertEquals(actualHeader7, "All Calendar Events");
    }
}
