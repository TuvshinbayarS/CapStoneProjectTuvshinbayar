@updateUserProfile @smoke
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ukas15@gmail.com' and password 'Tek@567899'
    And User click on login button
    And User should be logged in into Account

  
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Uranus' and Phone '2023337788'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@567899       | Tek@50005   | Tek@50005       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
