package tek.capstone.framework.steps;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();


    @Given("User is on retail website")
    public void userIsOnRetailWebsite() {
    	String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
    }
	
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	   click(factory.homePage().signInButton);
	   logger.info("User clicked on the sign in option");
	}
	
	
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("user entered sign in values");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	    click(factory.signInPage().loginPageButton);
	    logger.info("user clicke don the log in button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	}
	
}
