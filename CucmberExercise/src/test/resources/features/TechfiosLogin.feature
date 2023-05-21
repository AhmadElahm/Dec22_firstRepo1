Feature: Techfios billing login page functionality validation

Scenario: User should be able to login valid credentials
Given User is on the techfios login page
When User enters the username as "demo@techfios.com"
When User enters the password as "558566"
When User clicks on sign in button
Then User should land on dashboard page
