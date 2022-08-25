Feature: Product Purchase

  Scenario: Purchase the backpack
    Given Navigate to Luma
    Then Click to Sign In Link
    And Fill the email as "grup300@deneme.com"
    And Fill the Password as "123456789Grup"
    When Click to Sign In button
    Then Verification of successfully login

    When Click to item
    And Click to add to cart button
    And Verify to adding item
    And Click to basket
    And Click to proceed to checkout
    And Click to Next Button
    And Click to Place Order Button
    Then Verify to purchasing successfully

