Feature: Login functionality
  Scenario: Valid login
    Given Navigate to Login page
    When Enter email "sssfgs@gmail.com"
    And  Enter password "ssssssd"
    And   Click on Login Button
    Then  user is Logged in Successfully
    When  Click on Logout Button

  Scenario: In Valid login
    Given Navigate to login page
    When  Enter email "sssfgjfgs@gmail.com"
    And   Enter password "ssssfsrhjssd"
    And   Click on Login Button
    Then  Error message will appear with text "error message"