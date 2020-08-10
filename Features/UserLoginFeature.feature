Feature: User Login
  Scenario: Logo presence on Search Page
    Given I launch browser
    When I open OurProject Search Page
    When I input keyword in the search field
    Then I verify search results
    And I close Search Page

