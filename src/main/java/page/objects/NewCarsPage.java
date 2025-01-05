package page.objects;

import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.base.BasePage;
import utils.SeleniumDriver;

public class NewCarsPage extends BasePage{

	public NewCarsPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void goToToyota() {
		System.out.println("Tanya-------- inside NewCarsPage-> goToToyota()");
		click("toyota_LINK");
		System.out.println("Tanya-----Page Toyota page Title now is: "+ driver.getTitle());
	}
	
	public void goToBMW() {
		
		click("BMW_LINK");
	}
	
	public void goToHona() {
		
		click("honda_LINK");
	}
	
	public void goToKia() {
		
		click("kia_LINK");
	}
	

}
