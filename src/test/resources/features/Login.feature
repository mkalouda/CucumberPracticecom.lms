##author: munz@luda.com

@login
Feature: Login

  @smoke
  Scenario: Teacher user login
    When user enters valid usernam and password
    And user clicks on login in button
    Then user is successfully logged in

  @regression
  Scenario: Logo and login text validation
    Then logo and login text "Dear user, log in to access the admin area!" is displayed