package page.objects;

import org.openqa.selenium.WebDriver;

import pages.base.BasePage;
import utils.SeleniumDriver;

public class ToyotaCarPage extends BasePage {

	public ToyotaCarPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getCarTitle() {
		System.out.println("Tanya---- inside ToyotaCarPagegetCarTitle() method");
		return getText("carTitle_XPATH");
	}
}
