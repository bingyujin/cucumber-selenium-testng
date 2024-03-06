package tests;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    @Before
    public void beforeTest() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.switchTo();
    }

	// @Given("^User is on the login screen$")
	// public void userOnLoginScreen() {
	// 	System.out.println("User is On the Login Screen");
	// }

	// @When("^User inputs the credentials$")
	// public void userInputsCredential() {
	// 	System.out.println("User Inputs the Credential");
	// }

	// @Then("^System should let him login into it$")
	// public void systemLetsHimLogin() {
	// 	System.out.println("System validates and let him login into it");
	// }

}
