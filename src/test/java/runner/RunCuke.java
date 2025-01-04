package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/resources/Features/", glue = {"steps"},
				 plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} /*, tags = "@dataTable" */)
public class RunCuke extends AbstractTestNGCucumberTests{

}
