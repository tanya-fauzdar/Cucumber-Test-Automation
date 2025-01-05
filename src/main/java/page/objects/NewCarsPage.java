package page.objects;

import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.base.BasePage;
import utils.SeleniumDriver;

public class NewCarsPage extends BasePage{

	public NewCarsPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ToyotaCarPage goToToyota() {
		//System.out.println("Tanya-------- inside NewCarsPage-> goToToyota()");
		click("toyota_LINK");
		//System.out.println("Tanya-----Page Toyota page Title now is: "+ driver.getTitle());
		
		return new ToyotaCarPage();
	}
	
	public BMWCarPage goToBMW() {
		
		click("BMW_LINK");
		
		return new BMWCarPage();
	}
	
	public HyundaiCarPage goToHyundai() {
		
		click("hyundai_LINK");
		
		return new HyundaiCarPage();
	}
	
	public KiaCarPage goToKia() {
		
		click("kia_LINK");
		
		return new KiaCarPage();
	}
	

}
