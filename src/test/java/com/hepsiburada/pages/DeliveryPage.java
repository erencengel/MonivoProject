package com.hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeliveryPage extends BasePage{

    @FindBy(css = ".new_address_link_1fEiD.has_no_address_1uAWQ")
    public WebElement addNewAdressLink;

    @FindBy(css = "input[name='contact.firstName']")
    public WebElement firstName;

    @FindBy(css = "input[name='contact.lastName']")
    public WebElement surName;

    @FindBy(css = "input[name='phoneNumber.gsmNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//div[@style='position: relative; width: 100%;'])[1]")
    public WebElement city;




}
