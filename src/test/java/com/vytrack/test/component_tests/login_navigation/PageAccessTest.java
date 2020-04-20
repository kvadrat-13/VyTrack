package com.vytrack.test.component_tests.login_navigation;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PageAccessTest extends TestBase {

    @Test
    public void vehicleContractsStoreManager() {

        // Login as Store Manager
        String store_manager_username = ConfigurationReader.getProperty("store_manager_username");
        String store_manager_password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(store_manager_username, store_manager_password);

        // Click Fleet -> Vehicle Contracts
        actions.moveToElement(accessPage.fleet).pause(2000).perform();
        accessPage.vehicleContracts.click();

        // Verify that I have accessed the right page
        wait.until(ExpectedConditions.textToBePresentInElement(accessPage.pageHeader, "All Vehicle Contract"));
        String pageHeaderText = accessPage.pageHeader.getText();
        Assert.assertEquals(pageHeaderText, "All Vehicle Contract");
    }

    @Test
    public void vehicleContractsSalesManager() {

        // Login as Store Manager
        String sales_manager_username = ConfigurationReader.getProperty("sales_manager_username");
        String sales_manager_password = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(sales_manager_username, sales_manager_password);

        // Click Fleet -> Vehicle Contracts
        actions.moveToElement(accessPage.fleet).pause(2000).perform();
        accessPage.vehicleContracts.click();

        // Verify that I have accessed the right page
        wait.until(ExpectedConditions.textToBePresentInElement(accessPage.pageHeader, "All Vehicle Contract"));
        String pageHeaderText = accessPage.pageHeader.getText();
        Assert.assertEquals(pageHeaderText, "All Vehicle Contract");
    }

    @Test
    public void vehicleContractsDriver() {

        // Login as Driver
        String driver_username = ConfigurationReader.getProperty("driver_username");
        String driver_password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(driver_username, driver_password);

        // Click Fleet -> Vehicle Contracts
        actions.moveToElement(accessPage.fleet).pause(2000).perform();
        accessPage.vehicleContracts.click();

        // Verify that I have accessed the right page
        // Message You do not have permission to perform this action. should be displayed
        String expectedError = "You do not have permission to perform this action.";
        wait.until(ExpectedConditions.textToBePresentInElement(accessPage.errorMessage, expectedError));
        assertTrue(accessPage.errorMessage.isDisplayed());
        System.out.println("Error Message: " + accessPage.errorMessage.getText());
    }

}
