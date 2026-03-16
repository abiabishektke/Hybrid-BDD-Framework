
Feature: Add product to cart functionality

  Scenario Outline: User adds product to cart from different departments

    Given User is on the home page

    When User handles initial popup if present

    And User clicks on Today's Deals

    And User clicks on See More

    And User selects "<Department>" department

    And User selects the first product

    And User clicks on Add to Cart button

    Then Product should be added successfully to cart


    Examples:
      | Department      |
      | Fashion         | 
      | electronics     |
      | computers       |
      | carandmotorbike |