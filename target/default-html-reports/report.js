$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/hepsiburada.feature");
formatter.feature({
  "name": "Shopping Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to purchase whatever they want from hepsiburada",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to hepsiburada.com",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.navigateToHepsiburadaCom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"Cin Ali\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.searchFor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Show all results",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.showAllResults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the 2th item displayed and see if the page displayed as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.selectTheThItemDisplayedAndSeeIfThePageDisplayedAsExpected(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Increase the preferred quantity by two and add to card",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.increaseThePreferredQuantityByTwoAndAddToCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Shopping Cart",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.navigateToShoppingCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proceed to progress and provide an address",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.proceedToProgressAndProvideAnAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Anında Havale",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.selectTheAnındaHavale()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the VakıfBank with the Anında Havale Option",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.selectTheVakıfBankWithTheAnındaHavaleOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click continue bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.clickContinueBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that payment page is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.verifyThatPaymentPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});