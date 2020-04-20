package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessPage {
    public AccessPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Fleet")
    public WebElement fleet;

    @FindBy(linkText = "Vehicle Contracts")
    public WebElement vehicleContracts;

    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;



}
