Feature: Validating Login functionality of the application


    @smoke
  Scenario: User able to login into the application successfully
    Given User navigates to the application page
    When User provides Login details
    And  User clicks on Login
    Then User is navigated to the Dashboard page


    @exam
  Scenario Outline: User login functionality with mmultiple test data
    Given User navigates to the application page
    When User provides Login details "<Userid>","<pwd>"
    And  User clicks on Login
    Then User is navigated to the Dashboard page

    Examples:
    |Userid|pwd|
    |admin  |1234|
    |admin  |23456|
    |12355  |dhdifhd|

