package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		System.out.println("@Given--- user navigates to the facebook website");
		
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("@When--- validates the homepage title");
		
	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
		System.out.println("@Then--- user enters  "+ username +" username");
		
	}

	@And("user enters {string} password")
	public void user_enters_password(String password) {
		System.out.println("@And--- user enters " +password+" password");
		
	}
	

	@And("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("@And--- user clicks on the signin button");
		
	}

}
