Feature: Product Test
  As user I want to remove the lowest price item from the cart
  @smoke
  Scenario: User should remove lowest price item from the cart successfully
    Given I add four items to the cart
    When  I view the cart
    Then  I find total four items listed in my cart
    When  I search for lowest price item
    And   I am able to remove lowest price item from the cart
    Then  I am able to verify three items in my cart





