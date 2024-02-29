package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
											features = "src/test/resources/features", 
											glue = "tests", 
											monochrome = true,
											plugin={"junit:target/cucumber-report/cucumber.xml"})
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
