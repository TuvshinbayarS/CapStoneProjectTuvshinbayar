@addAddress
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tate@tekschool.us' and password 'Tek@8888'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill address form with below information
      | fullName    | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | Andy Galpin |  2021112233 | 101 This St   | 111 | Arlington | Virginia |   22202 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | fullName | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | Huberman |  2023036969 | Galpin St NW  |  22 | This City | Maryland |   20902 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
