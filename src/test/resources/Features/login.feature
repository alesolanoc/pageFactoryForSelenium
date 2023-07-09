Feature: feature to test login functionality
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is in login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Raghav   | 12345    |
      | Ele      | 12345    |

