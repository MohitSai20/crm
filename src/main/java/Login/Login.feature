
Feature: Login Functionality
  @tag
  Scenario: Login Functionality successful
    Given when user navigates to site
    When user logs in using Username as “MohitSai20” and Password “Mohith.freecrm@20”
    Then login should be successful

  Scenario: Login Functionality unsuccessful
    Given user navigates to site
    When user logs in using Username as “MohitSai20” and Password “PASSWORD1”
    Then It should display error message

