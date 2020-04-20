package com.vytrack.base;

import com.vytrack.pages.*;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected DriverPage driverPage;
    protected Actions actions;
    protected StoreManagerPage storeManagerPage;
    protected LoginTestPage loginTestPage;
    protected AccessPage accessPage;
    protected DateAndTimeTestsPage dateAndTimeTestsPage;

    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 15);
        driver.get(ConfigurationReader.getProperty("url"));
        loginPage = new LoginPage();
        driverPage = new DriverPage();
        actions = new Actions(driver);
        storeManagerPage = new StoreManagerPage();
        loginTestPage = new LoginTestPage();
        accessPage = new AccessPage();
        dateAndTimeTestsPage = new DateAndTimeTestsPage();


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }

    public void changeMenu(String menu1, String menu2) {
        //menu1 -> Fleet
        //menu1 -> Vehicles
        // locate the menu1

        String menu1Xpath = "//span[contains(text(), '" + menu1 + "')][@class='title title-level-1']";
        WebElement menu1Element = Driver.getDriver().findElement(By.xpath(menu1Xpath));  // --> Or we can use the driver it self

        String menu2Xpath = "//span[.='" + menu2 + "'][@class='title title-level-2']";
        WebElement menu2Element = Driver.getDriver().findElement(By.xpath(menu2Xpath));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(menu1Element));
        menu1Element.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(menu2Element));
        menu2Element.click();
    }
}
