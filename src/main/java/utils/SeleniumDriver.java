package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	/* 
	 * We are creating a private static Object/Variable of the Data-type as this class itself i.e SeleniumDriver
	 * This class is used to Initialiaze the selenium WebDriver.
	*/
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	
	private static Properties config = new Properties();
	
	public static Properties OR = new Properties();
	
	private FileInputStream fis;
	
	/* 
	 * Now we are creating the constructor of this class keeping it Private.
	 * So, we can not create an object of this class (Because Private Constructor).
	 * Hence, some method (Getter-Setter method) will be provided to return/create this class's object.
	 * This is something like Singleton class pattern where we want ONLY ONE OBJECT to be created and
	 * can be SHARED among all classes (the SAME OBJEST Reference)
	*/
	private SeleniumDriver() {
		
		/*
		 * Firts of all we will load the config and OR properties files as the broweser information/URL 
		 * are there (int key-value pairs inside these properties files).
		 */
		
		try {
			fis = new FileInputStream("./src/main/resources/properties/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis = new FileInputStream("./src/main/resources/properties/OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(config.getProperty("browser").equals("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(config.getProperty("browser").equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		/*
		 * Till here, the Browser is Launched.
		 * The navigation to the test site web page happens in step definition
		 * file which is following the feature files's Gherkin statements (to
		 * navigate to the test site, Facebook/leBloom web page for example.)
		*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		waitDriver	= new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
	}
	
	/*
	 * Creating Getter method for returning the driver which is initialized here.
	 * Hence making this method 'public'and 'static' so that the driver's object  
	 * can be obtained from anywhere once available [Singleton class concept].
	 */
	public static WebDriver getDriver() {
		
		/*
		 * As soon as the constructor is called, the WebDriver will be initialized
		 * because we are initializing the WebDriver inside it's private constructor.
		*/
		return driver;
		
	}
	
	/* Creating method to create an object of this class. 
	 * As previously mentioned, we can not create the object 
	 * of the class with a private constructor. 
	 * So this method we will be calling in @Before Hook so that it initialize everything.
	 * 
	 */
	public static void setUpDriver() {
		
		/* This class's instance will be created only when there is no existing object already
		 * i.e Singleton class concept.
		 * */
		if(seleniumDriver == null /* meaning: there is NO Instance/Object of this class or the WebDriver already*/) {
			
			/* Create an Instance/Object of this class or say the WebDriver */
			seleniumDriver = new SeleniumDriver(); /* Calling the constructor of the class */
			
			/* So in order to create the instance of this class with a private constructor
			 * we will have to call this method ex: SeleniumDriver.setUpDriver();
			 */
			
		}
		
	}
	
	/*
	 * Method for navigating to the test url
	 */
	public static void openPage(String url) {
		
		driver.get(url);
	}
	
	
	/*
	 * Method to Quit the WebDriver instance.
	 * So this method we will be calling in @After Hook
	 */
	public static void tearDown() {
		
		if(driver != null) {
			
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
