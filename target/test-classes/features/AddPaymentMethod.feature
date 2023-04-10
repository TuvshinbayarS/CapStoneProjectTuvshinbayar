@paymentMethod
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tate@tekschool.us' and password 'Tek@8888'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1122334455668888 | Ponzi      |              01 |           2025 |          999 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1111222233339999 | Sarasafari |              10 |           2026 |          777 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on card
    And User click on remove option of card section
    Then payment details should be removed
