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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".new_address_link_1fEiD.has_no_address_1uAWQ\"}\n  (Session info: chrome\u003d94.0.4606.81)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-G90N9B6\u0027, ip: \u0027192.168.1.48\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.81, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Eren\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52460}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 55240c2eec91c30f204f4efc7d06bf2d\n*** Element info: {Using\u003dcss selector, value\u003d.new_address_link_1fEiD.has_no_address_1uAWQ}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.hepsiburada.stepDefinitions.Hepsiburada_defs.proceedToProgressAndProvideAnAddress(Hepsiburada_defs.java:80)\r\n\tat ✽.Proceed to progress and provide an address(file:///C:/Users/Eren/IdeaProjects/MonivoProject/src/test/resources/features/hepsiburada.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the Anında Havale",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.selectTheAnındaHavale()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the VakıfBank with the Anında Havale Option",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.selectTheVakıfBankWithTheAnındaHavaleOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click continue bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.clickContinueBar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that payment page is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hepsiburada.stepDefinitions.Hepsiburada_defs.verifyThatPaymentPageIsOpened()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});