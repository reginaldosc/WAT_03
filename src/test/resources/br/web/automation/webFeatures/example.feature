Feature: Web Google Search
  As an user I can:
  -> Go to Google's website
  -> And Do a search

  Scenario: TC-01 - Do a Search
    Given user is in the "http://google.com" Website
    When  user fills a search box with "google" Text
    And   user submits the Search
    Then  user is able to see the result "google - Pesquisa Google" Page