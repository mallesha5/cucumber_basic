Feature: Test Facebook smoke scenario

  Scenario: Test login with valid credentials
    Given Open Chrome and start application
    When I enter username as "abc@gmail.com" and password as "abc123"
    Then User should be able to login successfully

