@signInComplete @smoke
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signin
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'ukas15@gmail.com' and password 'Tek@505051'
    And User click on login button
    Then User should be logged in into Account

  @createAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name      | email                  | password   | confirmPassword |
      | LiverKhan | khanliver@tekschool.us | Tek@098765 | Tek@098765      |
    And User click on SignUp button
    Then User should be logged into account page
