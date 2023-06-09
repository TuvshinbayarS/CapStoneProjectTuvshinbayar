@orderFeatureCompleteTest @smoke
Feature: Retail order page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tate@tekschool.us' and password 'Tek@8888'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify user can place order with saved card and address
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  Scenario: Verify User can cancel the order
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  Scenario: Verify User can Return the order
    And User click on Orders section
    And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a return message should be displayed 'Return was successfull'

  Scenario: Verify User can write a review on order placed
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline 'Andrew Tate' and 'super duper product for watching movies, good for watching my videos'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
