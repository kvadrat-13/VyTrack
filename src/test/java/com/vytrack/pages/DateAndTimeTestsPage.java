package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateAndTimeTestsPage {
    public DateAndTimeTestsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "(//div[@class='fields-row'])[1]/input[1]")
    public WebElement startDate;
}
