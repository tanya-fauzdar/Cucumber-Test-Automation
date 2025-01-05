Feature: Searching New Cars
  
  In order to search new cars
  As a user 
  I have to navigate to carwale.com

  Scenario Outline: Finding new cars
    Given user navigates to carwale website
    When user mouse hover on NewCars icon
    Then user clicks on FindNewCars option
    And user clicks on "<CarBrand>" Car
    And user validates carTitle as "<CarTitle>"

    #Now the test should run 4 times with these 4 test data in variable 'CarBrand' [tets case parameterization]
    Examples: 
      | CarBrand | CarTitle     |
      | Toyota   | Toyota Cars  |
      | Kia      | Kia Cars     |
      | BMW      | BMW Cars     |
      | Hyundai  | Hyundai Cars |
#CarBrand is the test data for running test for all these brands and CarTitle here is the expected value for title validation
