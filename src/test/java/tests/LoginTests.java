package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTests {

	 @Given("^User is on the login screen$")
	 public void userOnLoginScreen() {
         throw new RuntimeException("aaa");
	 //	System.out.println("User is On the Login Screen");
	 }

	// @When("^User inputs the credentials$")
	// public void userInputsCredential() {
	// 	System.out.println("User Inputs the Credential");
	// }

	// @Then("^System should let him login into it$")
	// public void systemLetsHimLogin() {
	// 	System.out.println("System validates and let him login into it");
	// }

}
