package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarPage;
import pages.base.BasePage;
import utils.SeleniumDriver;

public class CarWaleSteps {

	HomePage home = new HomePage();
	NewCarsPage newcar;
	ToyotaCarPage toyota;

	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}

	@When("user mouse hover on NewCars icon")
	public void user_mouse_hover_on_new_cars_icon() {

		// System.out.println("Tanya--- Mouse hover on New Cars");
		home.mouseHoverNewCars();

	}

	@Then("user clicks on FindNewCars option")
	public void user_clicks_on_find_new_cars_option() {

		// System.out.println("Tanya--- Clicking on Find New Car");
		newcar = home.clickFindNewCars();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user clicks on {string} Car")
	public void user_clicks_on_car(String carBrand) {
		// System.out.println("Tanya--- Clicking on Car Brand ");
		if (carBrand.equals("Toyota")) {

			toyota = newcar.goToToyota();

		} else if (carBrand.equals("Kia")) {

			newcar.goToKia();

		} else if (carBrand.equals("Hyundai")) {

			newcar.goToHyundai();

		} else if (carBrand.equals("BMW")) {

			newcar.goToBMW();

		}
	}

	@And("user validates carTitle as {string}")
	public void user_validates_car_title(String carTitle) {

		System.out.println("The Expected Car title is: " + carTitle);
		System.out.println("The Actual Car title is: " + BasePage.baseCar.getCarTitle());

		Assert.assertTrue(BasePage.baseCar.getCarTitle().equals(carTitle));

	}

}
