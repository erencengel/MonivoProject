package com.hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(css = "#continue_step_btn")
    public WebElement completeButton;

    @FindBy(css = "._16qmsXw10rJ7J6Kq05pWFW")
    public WebElement continueWithoutaMembership;

    @FindBy(css = "input#txtEmail")
    public WebElement emailBox;

    @FindBy(css = "#btnWithoutMemberShip")
    public WebElement proceedButton;


}
