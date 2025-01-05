package pages.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.SeleniumDriver;

public class BasePage {
	
	/*
	 * This class contains sommon driver reference which will be shared among
	 * all other page classes that will extend this Base Class.
	 */
	
	public static WebDriver driver;
	public WebElement mouseHoverElement;
	
	public static WebElement title ;
	
	//public Logger log = Logger.getLogger(BasePage.class);
	
	/* Creating constructor of the base page class */
	public  BasePage(WebDriver driver) {
		
		this.driver = SeleniumDriver.getDriver();
		
	}
	
	/*
	 * We will be creating key-words [methods] for general actions like
	 * we did earlier ex: click(), type(), isElementPresent(), scroll(), mouseHover() etc
	 */
	public void mouseHover(String locator) {
		
		if(locator.endsWith("_XPATH")) {
			
			mouseHoverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty("newCarmenu_XPATH")));
			
		}else if(locator.endsWith("_ID")) {
			
			mouseHoverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty("newCarmenu_ID")));
			
		}else if(locator.endsWith("_CLASS")) {
			
			mouseHoverElement = driver.findElement(By.className(SeleniumDriver.OR.getProperty("newCarmenu_CLASS")));
			
		}else if(locator.endsWith("_CSS")) {
			
			mouseHoverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty("newCarmenu_CSS")));
			
		}else if(locator.endsWith("_TAG")) {
			
			mouseHoverElement = driver.findElement(By.tagName(SeleniumDriver.OR.getProperty("newCarmenu_XPATH")));
			
		}else if(locator.endsWith("_LINK")) {
			
			mouseHoverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty("newCarmenu_LINK")));
			
		}else if(locator.endsWith("_PARTIALLINK")) {
			
			mouseHoverElement = driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty("newCarmenu_PARTIALLINK")));
			
		}else if(locator.endsWith("_NAME")) {
			
			mouseHoverElement = driver.findElement(By.name(SeleniumDriver.OR.getProperty("newCarmenu_NAME")));
			
		}
		
		new Actions(driver).moveToElement(mouseHoverElement).perform();
	}
	
	public static void click(String locatorKey) {
		
		if(locatorKey.endsWith("_XPATH")) {
			System.out.println("Tanya-----BasePage -> locating 'Find new cars' Web element now");
			SeleniumDriver.waitDriver.until(ExpectedConditions.presenceOfElementLocated((By.xpath((SeleniumDriver.OR.getProperty(locatorKey)))))).click();
			System.out.println("Tanya-----BasePage class -> Title now is: "+driver.getTitle());
		}else if(locatorKey.endsWith("_id")) {
			
			driver.findElement((By.id((SeleniumDriver.OR.getProperty(locatorKey))))).click();
			
		}else if(locatorKey.endsWith("_cssSelector")) {
			
			driver.findElement((By.cssSelector((SeleniumDriver.OR.getProperty(locatorKey))))).click();
			
		}else if(locatorKey.endsWith("_className")) {
			
			driver.findElement((By.className((SeleniumDriver.OR.getProperty(locatorKey))))).click();
			
		}else if(locatorKey.endsWith("_name")) {
			
			driver.findElement((By.name((SeleniumDriver.OR.getProperty(locatorKey))))).click();
			
		}else if(locatorKey.endsWith("_tagName")) {
			
			driver.findElement((By.tagName((SeleniumDriver.OR.getProperty(locatorKey))))).click();
			
		}else if(locatorKey.endsWith("_LINK")) {
			
			System.out.println("Tanya---- inside BasePage-> click() for Toyota.");
			System.out.println("Tanya-----Page Title now is: "+ driver.getTitle());
			
			SeleniumDriver.waitDriver.until(ExpectedConditions.presenceOfElementLocated((By.linkText((SeleniumDriver.OR.getProperty(locatorKey)))))).click();
			
		}else if(locatorKey.endsWith("_partialLinkText")) {
			
			driver.findElement((By.partialLinkText((SeleniumDriver.OR.getProperty(locatorKey))))).click();
		}
		
		//log.info("--Clicking the: "+ locatorKey +" button.");
	}
	
	public static void type(String locatorKey, String value) {
		if(locatorKey.endsWith("_xpath")) {
			
			driver.findElement((By.xpath((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_id")) {
			
			driver.findElement((By.id((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_cssSelector")) {
			
			driver.findElement((By.cssSelector((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_className")) {
			
			driver.findElement((By.className((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_name")) {
			
			driver.findElement((By.name((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_tagName")) {
			
			driver.findElement((By.tagName((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_linkText")) {
			
			driver.findElement((By.linkText((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}else if(locatorKey.endsWith("_partialLinkText")) {
			
			driver.findElement((By.partialLinkText((SeleniumDriver.OR.getProperty(locatorKey))))).sendKeys(value);
			
		}
		
		//log.info("--Typing in input: "+ locatorKey +" value as: " + value);
	}
	
	public static boolean isElementPresent(String locatorKey) {
		try {
			
			if(locatorKey.endsWith("_ID")) {
				
				driver.findElement(By.id(SeleniumDriver.OR.getProperty(locatorKey)));
				
			}else if(locatorKey.endsWith("_XPATH")) {
				
				System.out.println("Looking for the xpath of ele");
				
				driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locatorKey)));
				
			}else if(locatorKey.endsWith("_CSS")) {
				
				driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locatorKey)));
				
			}else if(locatorKey.endsWith("_TAG")) {
				
				driver.findElement(By.tagName(SeleniumDriver.OR.getProperty(locatorKey)));
				
			}else if(locatorKey.endsWith("_CLASS")) {
				
				driver.findElement(By.className(SeleniumDriver.OR.getProperty(locatorKey)));
				
			}else if(locatorKey.endsWith("_NAME")) {
				
				driver.findElement(By.name(SeleniumDriver.OR.getProperty(locatorKey)));
			}
			
		}catch(NoSuchElementException e) {
			
			//System.out.println("Exception caught: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public static String getText(String locatorKey) {
		System.out.println("Tanya---- inside BasePage-> getText() and Locator key is: " + locatorKey);
		
		if(locatorKey.endsWith("_XPATH")) {
			
			System.out.println("Tanya---- inside BasePage-> for Toyota page's carTitle()-> getText() XPATH");
			title = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/section/header/h1"));
			//WebElement locator = driver.findElement((By.xpath((SeleniumDriver.OR.getProperty(locatorKey)))));
			//locator.getText();
			System.out.println("Tanya------ taking out title text form TOyota Page: " + title.getText());
			
			
		}else if(locatorKey.endsWith("_id")) {
			
			locatorKey = driver.findElement((By.id((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_cssSelector")) {
			
			locatorKey = driver.findElement((By.cssSelector((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_className")) {
			
			locatorKey = driver.findElement((By.className((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_name")) {
			
			locatorKey = driver.findElement((By.name((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_tagName")) {
			
			locatorKey = driver.findElement((By.tagName((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_linkText")) {
			
			locatorKey = driver.findElement((By.linkText((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
			
		}else if(locatorKey.endsWith("_partialLinkText")) {
			
			locatorKey = driver.findElement((By.partialLinkText((SeleniumDriver.OR.getProperty(locatorKey))))).getText();
		}
		System.out.println("Tanya---- exiting getText()");
		return title.getText() ;
		//log.info("--Clicking the: "+ locatorKey +" button.");
	}

}
