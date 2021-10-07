@regression
Feature: Shopping Functionality
  @wip
  Scenario: User should be able to purchase whatever they want from hepsiburada
    Given Navigate to hepsiburada.com
    When Search for "Cin Ali"
    And Show all results
    Then select the 2th item displayed and see if the page displayed as expected
    And Increase the preferred quantity by two and add to card
    And Navigate to Shopping Cart
    And Proceed to progress and provide an address
    And Select the Anında Havale
    And Select the VakıfBank with the Anında Havale Option
    And Click continue bar
    Then Verify that payment page is opened