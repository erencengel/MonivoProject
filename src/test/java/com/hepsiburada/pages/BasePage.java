package com.hepsiburada.pages;

import com.hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "span#shoppingCart")
    public WebElement shoppingCart;

    @FindBy(css = "input.desktopOldAutosuggestTheme-input")
    public WebElement searchBar;

    @FindBy(xpath = "//span[.='Giriş Yap']")
    public WebElement loginBar;

}
