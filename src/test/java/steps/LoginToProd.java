package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;

public class LoginToProd {
	
	@And("user validates captcha image")
	public void user_validates_captcha_image() {
		System.out.println("@And--- user validates captcha image");
	}

	@And("user enters first name and lastname")
	public void user_enters_first_name_and_lastname(io.cucumber.datatable.DataTable dataTable) {
		
		System.out.println("user enters first name and lastname");
		
		/* Reading data table as a List
		 * List<List<String>>
		 * data = dataTable.asLists();
		 * 
		 * //first row and first col System.out.println("First name is: " +
		 * data.get(0).get(0)+ " last name is: " + data.get(0).get(1));
		 * 
		 * //Second row and second col System.out.println("First name is: " +
		 * data.get(1).get(0) + " last name is: " + data.get(1).get(1));
		 */
	
		/*
		 * Reading data table as list of maps
		 * List<Map<String, String>> map = dataTable.asMaps();
		 * System.out.println("First name is: " + map.get(0).get("Firstname")+
		 * ". Last name is: " + map.get(0).get("Lastname"));
		 * System.out.println("First name is: " + map.get(1).get("Firstname")+
		 * ". Last name is: " + map.get(1).get("Lastname"));
		 */	
		
		// Parameterizing data table as a map
		
		for(Map<String, String> data: dataTable.asMaps(String.class, String.class)) {
			System.out.println("First name will be: "+ data.get("Firstname") + " Last name will be: " + data.get("Lastname"));
		}
		
		
	}
	
}
