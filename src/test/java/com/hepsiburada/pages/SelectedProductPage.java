package com.hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedProductPage extends BasePage{

    @FindBy(css = "#product-name")
    public WebElement productName;

    @FindBy(css = ".button.effective.icon.icon-plus")
    public WebElement increaseBar;

    @FindBy(css = "#addToCart")
    public WebElement addToCartBar;

}
