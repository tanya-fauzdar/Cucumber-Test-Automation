package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarPage;
import utils.SeleniumDriver;

public class CarWaleSteps {
	
	HomePage home = new HomePage();
	NewCarsPage newcar = new NewCarsPage();
	ToyotaCarPage toyota = new ToyotaCarPage();
	
	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
	    SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}
	@When("user mouse hover on NewCars icon")
	public void user_mouse_hover_on_new_cars_icon() {
		
		System.out.println("Tanya--- Mouse hover on New Cars");
	    home.mouseHoverNewCars();
		
	}
	@Then("user clicks on FindNewCars option")
	public void user_clicks_on_find_new_cars_option() {
		
		System.out.println("Tanya--- Clicking on Find New Car");
		home.clickFindNewCars();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@And("user clicks on Toyota Car")
	public void user_clicks_on_toyota_car() {
		System.out.println("Tanya--- Clicking on Toyota Car ");
		newcar.goToToyota();
	}
	
	@And("user validates carTitle as Toyota Cars")
	public void user_validates_car_title_as_toyota_cars() {
		
		String car_title = toyota.getCarTitle();
		//System.out.println("Tanya----- Car title of current page is: "+ car_title);
		Assert.assertTrue(toyota.getCarTitle().equals("Toyota Cars"));

	}

}
