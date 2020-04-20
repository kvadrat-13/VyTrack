package com.vytrack.test.component_tests.login_navigation;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends TestBase {

    @Test
    public void loginTestPositive() {

        // Logged in as a Store Manager
        String usernameStoreM = ConfigurationReader.getProperty("store_manager_username");
        String passwordStoreM = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(usernameStoreM, passwordStoreM);

        // Verified that name is displayed
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.name));
        assertTrue(loginTestPage.name.isDisplayed());
        // Got the name of the StoreManager "Geovany Jenkins
        String nameStoreM = loginTestPage.name.getText();

        // Verified that Dashboard page is opened
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String dashboardPage = driver.getTitle();
        assertEquals(dashboardPage, "Dashboard");

        // dropdown (tried to use Select -> didn't work)
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.dropdown));
        loginTestPage.dropdown.click();

        // logout
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.logout));
        loginTestPage.logout.click();

        // Logged in as a Sales Manager
        String usernameSalesM = ConfigurationReader.getProperty("sales_manager_username");
        String passwordSalesM = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(usernameSalesM, passwordSalesM);

        // Verified that Dashboard page is opened
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String dashboardPage2 = driver.getTitle();
        assertEquals(dashboardPage2, "Dashboard");

        // Verified that name is displayed
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.name));
        assertTrue(loginTestPage.name.isDisplayed());

        // Got the name of the StoreManager "Peyton Harber"
        String nameSalesM = loginTestPage.name.getText();

        // compared that they not equal to each other
        // to make sure that there is a different name
        assertNotEquals(nameStoreM, nameSalesM);

        // dropdown (tried to use Select -> didn't work)
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.dropdown));
        loginTestPage.dropdown.click();

        // logout
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.logout));
        loginTestPage.logout.click();

        // Logged in as a Truck Driver
        String usernameTruckD = ConfigurationReader.getProperty("driver_username");
        String passwordTruckD = ConfigurationReader.getProperty("driver_password");
        loginPage.login(usernameTruckD, passwordTruckD);

        // Verified that Dashboard page is opened
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String dashboardPage3 = driver.getTitle();
        assertEquals(dashboardPage3, "Dashboard");

        // Verified that Quick Launchpad header is opened
        String pageHeader = loginTestPage.pageHeader.getText();
        assertTrue(loginTestPage.pageHeader.isDisplayed());
        assertEquals(pageHeader, "Quick Launchpad");

        // Verified that name is displayed
        wait.until(ExpectedConditions.elementToBeClickable(loginTestPage.name));
        assertTrue(loginTestPage.name.isDisplayed());

        // Got the name of the StoreManager "Peyton Harber"
        String nameTruckD = loginTestPage.name.getText();

        // compared that they not equal to each other
        // to make sure that there is a different name
        assertNotEquals(nameSalesM, nameTruckD);
    }

    @Test
    public void loginTestNegative() {
        String driver_username = ConfigurationReader.getProperty("driver_username");
        String driver_password = "Invalid Password";
        loginPage.login(driver_username, driver_password);

        // Verifying does the error message is displayed
        assertTrue(loginTestPage.errorMessage.isDisplayed());

        // Verifying do they match
        String errorMessageText = loginTestPage.errorMessage.getText();
        assertEquals(errorMessageText, "Invalid user name or password.");

        // Verify Title is same
        String title = driver.getTitle();
        assertEquals(title, "Login");

        // Verify that URL is same
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://qa3.vytrack.com/user/login");
    }

}
