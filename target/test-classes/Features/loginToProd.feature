@prod
Feature: Login Feature - Production
  	In order to perform login 
  	As a user
  	I have to enter username and password


  Scenario Outline: Login to the Facebook Website as a user on Production 

    Then user enters "<username>" username
    And user enters "<password>" password
    And user validates captcha image
    And user clicks on the signin button

    # This will test 4 scenarios in one go
    Examples: 
      | username | password |
      | valid    | valid    |
      | invalid  | invalid  |
      | invalid  | valid    |
      | valid    | invalid  |
