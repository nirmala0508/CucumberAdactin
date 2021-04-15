Feature: To validate login functionality

@sanity
Scenario: To validate login functionality with username and password

Given User name is in facebook login page
When User enter invalid uername and password
And User click login button
Then User should be in invalid credentials page