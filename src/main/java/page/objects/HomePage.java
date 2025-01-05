package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pages.base.BasePage;

public class HomePage extends BasePage{
	/*
	 * All the features/functions of the home page
	 * will be defined here in this HomePage class
	 * in form of method for each feature/functionality.
	 */

	public HomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void mouseHoverNewCars() {
		
		/* Calling the key-word method for mouse hover action from Base Class*/
		mouseHover("newCarmenu_XPATH");
		
	}
	
	public void clickFindNewCars() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click("findNewCars_XPATH");
		System.out.println("Tanya-----HomePage class-> Page Title now is: "+ driver.getTitle());
	}
	
	public void searchCars() {
		
	}
	
	public void goToMap() {
		
	}
	
}
