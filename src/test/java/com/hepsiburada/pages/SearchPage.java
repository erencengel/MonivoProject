package com.hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(css = "p.hb-pl-cn span")
    public List<WebElement> allListedProducts;

}
