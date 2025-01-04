package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import utils.SeleniumDriver;

public class Hooks {
	
	@Before
	public void setUpDriver() {
		SeleniumDriver.setUpDriver();
	}

	@After
	public void tearDown() {
		//capturing screenshot before quitting the browser
		SeleniumDriver.tearDown();
	}
	/*
	 * The DB connections will happen only once before the tets suit starts. So,
	 * this method will be kept under @BeforeAll annotation as it is required before
	 * any test scenario executes. And it is made a 'static' method as it will be
	 * executed befre the suite.
	 */
	/*
	 * @BeforeAll public static void db_sconn() {
	 * System.out.println("@BeforeAll ---- Create DB Connection"); }
	 * 
	 * 
	 * The DB disconnection will happen only once after the tets suit ends. So, this
	 * method will be kept under @AfterAll annotation as it is required after having
	 * all the tests scenario executed already or test suit execution completed. And
	 * it is made a 'static' method as it will be executed befre the suite.
	 * 
	 * @AfterAll public static void db_disconn() {
	 * System.out.println("@AfterAll ---- Close DB connection"); }
	 */

	/*
	 * The browser launch is required in every test method before executing it. So,
	 * browser launch method is kept under @Before (each test) annotation.
	 */
	/*
	 * @Before(order = 0) // order is given for giving the priority to run multilple
	 * method under same annotation sequencially public void setup1() {
	 * System.out.println("@Before ---- Browser Launch-1"); }
	 * 
	 * 
	 * @Before(order = 1) // Zero is the highest priority for @Before and opposite
	 * in @After public void setup2() {
	 * System.out.println("@Before ---- Browser Launch-2"); }
	 * 
	 * 
	 * Provide tags in Hooks annotations too to apply those method only to that
	 * particular tagged feature file/BDD
	 * 
	 * @Before("@staging") public void setup3() {
	 * System.out.println("@Before ---- Browser Launch-3"); }
	 */

	/*
	 * The browser quit is required in every test method after having it executed.
	 * So, browser quit method is kept under @After (each test) annotation.
	 */
	/*
	 * @After(order = 1) // 1 is the Highest priority for @After annotation public
	 * void teardown1() { System.out.println("@After ---- Browser Quit-1"); }
	 * 
	 * @After (order = 0) public void teardown2() {
	 * System.out.println("@After ---- Browser Quit-2"); }
	 */
	/*
	 * Similarly have more hooks annotations. for ex performing any action before or
	 * after any step
	 */
	/*
	 * @BeforeStep public void before_step() {
	 * System.out.println("@BeforeStep ---- Printing a log"); }
	 * 
	 * @AfterStep public void after_step() {
	 * System.out.println("@AfterStep ---- Deleting the log"); }
	 */
}
