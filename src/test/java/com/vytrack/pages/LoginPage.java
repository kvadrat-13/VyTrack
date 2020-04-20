package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "_username")
    public WebElement username;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement login;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.login.click();

    }

    public void login(String user) {
        String username;
        String password;
        switch (user) {
            case "driver":
                username = ConfigurationReader.getProperty("driver_username");
                password = ConfigurationReader.getProperty("driver_password");
                this.username.sendKeys(username);
                this.password.sendKeys(password);
                login.click();
                break;
            case "sales manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                password = ConfigurationReader.getProperty("sales_manager_password");
                this.username.sendKeys(username);
                this.password.sendKeys(password);
                login.click();
                break;
            case "store manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                password = ConfigurationReader.getProperty("store_manager_password");
                this.username.sendKeys(username);
                this.password.sendKeys(password);
                login.click();
                break;
            default:
                System.out.println("ERROR: Invalid user type provided!");
        }
    }


}
