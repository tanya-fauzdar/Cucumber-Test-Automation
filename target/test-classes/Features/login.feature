@bvt
Feature: Login Feature
  	In order to perform login 
  	As a user
  	I have to enter username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title

  Scenario Outline: Login to the Facebook Website
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signin button

    # This will test 4 scenarios in one go
    Examples: 
      | username | password |
      | valid    | valid    |
      | invalid  | invalid  |
      | invalid  | valid    |
      | valid    | invalid  |
