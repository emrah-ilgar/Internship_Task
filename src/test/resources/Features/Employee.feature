Feature: Internship Login Tests
  @admin
  Scenario: Login As Admin
    Given The user is on the home page
    When The user click to login
    And The user logs in using "admin" and "password"
    And The user click to Log in button
    Then the user should be able to login successfully and "Hello admin!" should be able to see
    Then The user click to Employee List button
    Then The user fills in the required blank fields
    And The user click to Create button
    And The user should be able to see new Employee information
      | Alex               |
      | 3000               |
      | 36                 |
      | 2                  |
      | alex2024@gmail.com |
    And The user delete new Employee and verify the new employee deleted in Employee List page

