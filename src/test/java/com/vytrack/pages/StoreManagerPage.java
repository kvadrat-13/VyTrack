package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPage {

    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // (//span[@class='title title-level-1'])[1]
    @FindBy(xpath = "//span[contains(text(), 'Dashboards')][@class='title title-level-1']")
    public WebElement dashboards;

    @FindBy(xpath = "//li[@data-route='oro_dashboard_view']/a/span")
    public WebElement dashboard;

    @FindBy(xpath = "//div[@class='pull-left']/h1")
    public WebElement pageHeader;

    @FindBy(linkText = "Fleet")
    public WebElement fleet;

    @FindBy(linkText = "Vehicles")
    public WebElement vehicles;

    // Page Header "All Cars"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader2;

    @FindBy(linkText = "Customers")
    public WebElement customers;

    @FindBy(linkText = "Accounts")
    public WebElement accounts;

    // Page Header "All Accounts"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader3;

    @FindBy(xpath = "//span[contains (text(),'Contacts')]")
    public WebElement contacts;

    // Page Header "Contacts"
    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader4;

    @FindBy(linkText = "Sales")
    public WebElement sales;

    @FindBy(linkText = "Opportunities")
    public WebElement opportunities;

    // Page Header "Open Opportunities"
    @FindBy(xpath = "//div[@data-toggle='dropdown']/h1")
    public WebElement pageHeader5;

    @FindBy(linkText = "Activities")
    public WebElement activities;

    @FindBy(linkText = "Calls")
    public WebElement calls;

    // Page Header "All Calls"
    @FindBy(xpath = "//div[@class='grid-views']/div/div/div/h1")
    public WebElement pageHeader6;

    @FindBy(xpath = "//span[contains(text(), 'Calendar Events')]")
    public WebElement calendarEvents;

    // Page Header "Open Opportunities"
    @FindBy(xpath = "//h1[ @ class= 'oro-subtitle']")
    public WebElement pageHeader7;


}
