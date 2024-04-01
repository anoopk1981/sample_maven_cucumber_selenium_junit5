Feature: Search for Java on Google

  Scenario Outline: Verify Google search results for <searchTerm>

    Given I am on the Google homepage
    When I search for "<searchTerm>"
    Then I should see "<expectedResult>" in the search results title

    Examples:
      | searchTerm | expectedResult |
      | Java       | Java           |
      | Python     | Python         |
      | Selenium   | Selenium       |
