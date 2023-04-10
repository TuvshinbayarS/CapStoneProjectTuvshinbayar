@signInComplete
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signin
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'tate@tekschool.us' and password 'Tek@8888'
    And User click on login button
    Then User should be logged in into Account

  @createAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name       | email             | password  | confirmPassword |
      | TristanTate | tristate@tekschool.us | Tek@56789 | Tek@56789       |
    And User click on SignUp button
    Then User should be logged into account page
