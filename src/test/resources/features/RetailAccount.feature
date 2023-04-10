@updateUserProfile
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tuvshinbayar.surenkhorloo@tekschool.us' and password 'Tek@9999'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'UbsKun' and Phone '2021110000'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@9999         | Tek@8888    | Tek@8888        |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
