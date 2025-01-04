@dataTable
Feature: Login Feature - Production
  	In order to perform login 
  	As a user
  	I have to enter username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title

  Scenario Outline: Login to the Facebook Website as a user on Production
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters first name and lastname
      | Firstname | Lastname |
      | Tanya     | Fauzdar  |
      | Mayank    | Sejwal   |
      | Urfi      | Khan     |
    And user clicks on the signin button
