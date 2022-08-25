Feature: Register Functionality

  Scenario: Register with valid username and password
    Given Navigate to Luma
    Then Click on the element in the main page
      | createAnAccount |
    And User sending the keys in Dialog Content

      | firstname            | Grup3              |
      | lastname             | TechnoStudy        |
      | emailAddress         | grup300@deneme.com |
      | password             | 123456789Grup      |
      | passwordConfirmation | 123456789Grup      |

    When Click to Create an Account button
      | submitButton |
    Then Verification of successfully registering

    #Thank you for registering with Fake Online Clothing Store.