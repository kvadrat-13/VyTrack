package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPage {
    public LoginTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement name;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement dropdown;

    @FindBy(linkText = "Logout")
    public WebElement logout;

    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement errorMessage;


}
