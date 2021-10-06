package com.hepsiburada.stepDefinitions;

import com.hepsiburada.pages.*;
import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.ConfigurationReader;
import com.hepsiburada.utilities.Driver;
import com.sun.javafx.scene.KeyboardShortcutsHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hepsiburada_defs {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    //
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    SelectedProductPage selectedProductPage = new SelectedProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    DeliveryPage deliveryPage = new DeliveryPage();

    @Given("Navigate to hepsiburada.com")
    public void navigateToHepsiburadaCom() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickability(homePage.shoppingCart,7);
    }

    @When("Search for {string}")
    public void searchFor(String target) {
        homePage.searchBar.sendKeys(target + Keys.ENTER);
    }

    @And("Show all results")
    public void showAllResults() throws InterruptedException {
        Thread.sleep(2000);
        for (WebElement allListedProduct : searchPage.allListedProducts) {
            System.out.println("allListedProduct.getText() = " + allListedProduct.getText());
        }
    }


    @Then("select the {int}th item displayed and see if the page displayed as expected")
    public void selectTheThItemDisplayedAndSeeIfThePageDisplayedAsExpected(int itemNumber) {
        String expected = searchPage.allListedProducts.get(itemNumber).getText();
        searchPage.allListedProducts.get(itemNumber).click();
        BrowserUtils.waitForClickability(homePage.shoppingCart,7);
        String actual = selectedProductPage.productName.getText().trim();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        Assert.assertEquals(expected,actual);
    }

    @And("Increase the preferred quantity by two and add to card")
    public void increaseThePreferredQuantityByTwoAndAddToCard() throws InterruptedException {
        BrowserUtils.waitForClickability(selectedProductPage.increaseBar,7);
        selectedProductPage.increaseBar.click();
        selectedProductPage.addToCartBar.click();
        Thread.sleep(3000);
    }

    @And("Navigate to Shopping Cart")
    public void navigateToShoppingCart() {
        homePage.shoppingCart.click();
    }

    @And("Proceed to progress and provide an address")
    public void proceedToProgressAndProvideAnAddress() {
        BrowserUtils.waitForClickability(shoppingCartPage.completeButton,7);
        shoppingCartPage.completeButton.click();
        shoppingCartPage.continueWithoutaMembership.click();
        shoppingCartPage.emailBox.sendKeys("erencengel1@outlook.com");
        shoppingCartPage.proceedButton.click();
        BrowserUtils.waitForClickability(shoppingCartPage.completeButton,7);
        shoppingCartPage.completeButton.click();
        //
        deliveryPage.addNewAdressLink.click();
        deliveryPage.firstName.sendKeys("Eren");
        deliveryPage.surName.sendKeys("ÇENGEL");
        deliveryPage.phoneNumber.sendKeys("5537421384");
    }
}
