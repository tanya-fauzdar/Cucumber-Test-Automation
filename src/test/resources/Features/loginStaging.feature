@staging
Feature: Login Feature - Staging
  	In order to perform login 
  	As a user
  	I have to enter username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title

  @staging
  Scenario Outline: Login to the Facebook Website as s user on Staging
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the signin button

  Scenario Outline: Login to the Facebook Website as s user on Staging
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the signin button
