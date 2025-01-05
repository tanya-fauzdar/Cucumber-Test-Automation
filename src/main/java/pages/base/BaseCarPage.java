package pages.base;

public class BaseCarPage {

	public String getCarTitle() {
		
		//System.out.println("Tanya---- inside method getCarTitle() ");
		return BasePage.getText("carTitle_XPATH");
	}
}
