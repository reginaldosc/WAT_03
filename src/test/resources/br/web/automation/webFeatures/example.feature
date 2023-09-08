Feature: Swag Labs Login
  As an user I can:
  -> Go to Sauce Demo's website
  -> And Do a login

  Scenario: TC-01 - Do a Login
    Given user is in the "https://www.saucedemo.com/" Website
    When  user fills username and password with "standard_user" and "secret_sauce"
    And   user submits the login
    Then  user is redirected to "inventory" Page