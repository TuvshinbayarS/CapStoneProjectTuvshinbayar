package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class CreateAccountSteps extends CommonUtility{

	private POMFactory factory=new POMFactory();
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	click(factory.signInPage().createNewAccountButton);
	logger.info("user clicked on the create new account button");
	}
	
	
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	    List <Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField, signUpInformation.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailField, signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordField,signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassField, signUpInformation.get(0).get("confirmPassword"));
		logger.info("user entered sign up information");
		
	}
	
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	   click(factory.signInPage().signUpFormButton);
	   logger.info("user clicked on the sign up button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
	   logger.info("user logged into the account page");
	}
	
}
