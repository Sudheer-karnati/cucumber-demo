Feature: login functionality
Scenario: check login with invalid data

Given user is on browser 
And user on Home page
When user enter credentials
Then user should not navigate to Login page