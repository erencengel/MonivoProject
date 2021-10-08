package com.hepsiburada.stepDefinitions;

import com.hepsiburada.pages.*;
import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.ConfigurationReader;
import com.hepsiburada.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Hepsiburada_defs {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    //
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    SelectedProductPage selectedProductPage = new SelectedProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    DeliveryPage deliveryPage = new DeliveryPage();
    PaymentPage paymentPage = new PaymentPage();

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
        String actual = selectedProductPage.productName.getText();
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
    public void proceedToProgressAndProvideAnAddress() throws InterruptedException {
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
        //some javascript methods
        jse.executeScript("document.querySelectorAll('input.fake_input_12C-D')[0].click()");
        deliveryPage.provideCity.sendKeys("Ordu" + Keys.ENTER);
        Thread.sleep(500);
        jse.executeScript("document.querySelector('div[data-test-class=town] input.fake_input_12C-D').click()");
        deliveryPage.provideTown.sendKeys("Ünye" + Keys.ENTER);
        Thread.sleep(500);
        jse.executeScript("document.querySelectorAll('div[data-test-class=district] input.fake_input_12C-D')[0].click()");
        deliveryPage.provideDistrict.sendKeys("Atatürk" + Keys.ENTER);
        //proceed as normal
        jse.executeScript("arguments[0].scrollIntoView(true);", deliveryPage.address);
        deliveryPage.address.click();
        deliveryPage.address.sendKeys("Yıldız Mahallesi No:10/7");
        deliveryPage.giveAddressAName.click();
        deliveryPage.giveAddressAName.sendKeys("Ev");
        deliveryPage.setBillingAddress.click();
        deliveryPage.saveAddress.click();
        BrowserUtils.waitForClickability(deliveryPage.proceedButton,7);
        deliveryPage.proceedButton.click();
    }


    @And("Select the Anında Havale")
    public void selectTheAnındaHavale() {
        paymentPage.quickMoneyTranser.click();
    }

    @And("Select the VakıfBank with the Anında Havale Option")
    public void selectTheVakıfBankWithTheAnındaHavaleOption() throws InterruptedException {
        paymentPage.radioButton1.click();
        Thread.sleep(100);
        paymentPage.radioButton2.click();
    }

    @And("Click continue bar")
    public void clickContinueBar() {
        paymentPage.continueBar.click();
    }

    @Then("Verify that payment page is opened")
    public void verifyThatPaymentPageIsOpened() {
        String expectedUrl = "https://checkout.hepsiburada.com/odeme";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
