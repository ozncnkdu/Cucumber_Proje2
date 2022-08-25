Feature: Add Addres Functionality

  Background:
    Given Navigate to Luma
    Then Click to Sign In Link
    And Fill the email as "grup300@deneme.com"
    And Fill the Password as "123456789Grup"
    When Click to Sign In button
    Then Verification of successfully login

    When Click to my account page
    And Click to manage address
    And Click to add new address button

  Scenario Outline:
    And Fill the company as "<Company>"
    And Fill the PhoneNumber as "<PhoneNumber>"
    And Fill the StreetAddress as "<StreetAddress>"
    And Fill the City as "<City>"
    And Select the country
    And Fill the State as "<State>"
    And Fill the ZipCode as "<ZipCode>"
    And Click to save address button
    And Verify to adding address successfully

    Examples:
      | Company | PhoneNumber | StreetAddress | City     | State     | ZipCode |
      | Techno  | 1354845974  | Street12      | Istanbul | Fikirtepe | 34000   |
      | Study   | 1354845974  | Street22      | Giresun  | Gorele    | 28000   |
      | Grup3   | 1354845974  | Street32      | Izmir    | Urla      | 35000   |


