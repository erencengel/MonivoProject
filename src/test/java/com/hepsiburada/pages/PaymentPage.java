package com.hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

    @FindBy(xpath = "(//div[@class='sardesPaymentPage-Accordion-close_button'])[2]")
    public WebElement quickMoneyTranser;

    @FindBy(xpath = "(//input[@class='sc-AxirZ hogBDP'])[3]")
    public WebElement radioButton1;

    @FindBy(xpath = "(//input[@class='sc-AxirZ bZsSjQ'])[3]")
    public WebElement radioButton2;

    @FindBy(css = "#continue_step_btn")
    public WebElement continueBar;

}
