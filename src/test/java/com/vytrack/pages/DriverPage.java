package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriverPage {
    public DriverPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Fleet")
    public WebElement fleet;

    @FindBy(linkText = "Vehicles")
    public WebElement vehicles;

    //Page Header "Car"
    @FindBy(xpath = "//div[@class='pull-left']/h1")
    public WebElement pageHeader;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement customers;

    @FindBy(linkText = "Accounts")
    public WebElement accounts;

    // Page Header "Accounts"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader2;

    @FindBy(xpath = "//span[contains (text(),'Contacts')]")
    public WebElement contacts;

    // Page Header "Contacts"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader3;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activities;

    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item last'])[2]/a/span")
    public WebElement calendarEvents;

    // Page Header "Calendar Events"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader4;
}
