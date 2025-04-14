@wip
Feature: Webtable app login
  User Story: User should be able to login webtable application

  Background:
    Given user is on the login page of webtable app


  Scenario: Login scenario with valid credentials
    When user enters username Test
    And user enters password Tester
    And user clicks to login button
    Then user should see url contains orders


  Scenario: Login scenario with invalid credentials
    When user enters username incorrect
    And user enters password incorrect
    And user clicks to login button
    Then user should see url contains login