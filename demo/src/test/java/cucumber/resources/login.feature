Feature: Login
    Scenario: Successful login
    Given User is on Homepage
    When User enters a valid username on username field
    And User enters a valid password on password field
    And User clicks on the login button
    Then User should be redirected to the account page

    Scenario: Login with empty password
    Given User is on Homepage
    When User enters a valid username on username field
    And User doesn't fill the password on password field
    And User clicks on the login button
    Then User should get an error message

    Scenario: Login with invalid password
    Given User is on Homepage
    When User enters a valid username on username field
    And User enters an invalid password on password field
    And User clicks on the login button
    Then User should get a password error message
    
    Scenario: Login with empty username and password
    Given User is on Homepage
    When User doesn't fill the username on username field
    And User doesn't fill the password on password field
    And User clicks on the login button
    Then User should get an username error message
        
    Scenario: Successful logout
    Given User is on Homepage
    When User enters a valid username on username field
    And User enters a valid password on password field
    And User clicks on the login button
    And User should be redirected to the account page
    And User clicks on the logout button
    Then User should be redirected to Homepage
    