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

    @FindBy(css = "input#city")
    public WebElement provideCity;

    @FindBy(css = "input#town")
    public WebElement provideTown;

    @FindBy(css = "input#district")
    public WebElement provideDistrict;

    @FindBy(css = "textarea[name='detail']")
    public WebElement address;

    @FindBy(css = "input[placeholder='Örnek: Evim, İş yerim vb.']")
    public WebElement giveAddressAName;

    @FindBy(css = ".sc-AxgMl.iEtUpl")
    public WebElement setBillingAddress;

    @FindBy(css = ".button_QwrsX.min_padding_12wCn:nth-of-type(1)")
    public WebElement saveAddress;

    @FindBy(css = "#continue_step_btn")
    public WebElement proceedButton;





}
