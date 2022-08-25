Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to Luma
    Then Click to Sign In Link
    And Fill the email as "grup300@deneme.com"
    And Fill the Password as "123456789Grup"
    When Click to Sign In button
    Then Verification of successfully login