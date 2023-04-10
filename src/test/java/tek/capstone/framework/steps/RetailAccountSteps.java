package tek.capstone.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory=new POMFactory();
	
@When("User click on Account option")
public void userClickOnAccountOption() {
click(factory.homePage().accountOption);
	}
	

@When("User update Name {string} and Phone {string}")
public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
	clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
	  sendText(factory.accountPage().profileNameInputField, nameValue);
	 clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
	  sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
	  logger.info("user entered new name and phone value");
}
	

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	    click(factory.accountPage().profileUpdateButton);
	    logger.info("user clicked on the update button");
	}
	
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	   waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
	   logger.info("user profile info updtaed");
		
	}
	
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
	   
		  List <Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
			sendText(factory.accountPage().previousPassword, signUpInformation.get(0).get("previousPassword"));
			sendText(factory.accountPage().newPassword, signUpInformation.get(0).get("newPassword"));
			sendText(factory.accountPage().confirmPassword, signUpInformation.get(0).get("confirmPassword"));
			logger.info("user entered new password information");
		
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		
		click(factory.accountPage().changePasswordButton);
		logger.info("user clicked on the change password button");
	  
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().passwordUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdateSuccessMessage));
		logger.info("password updated successfully");
	   
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	   click(factory.accountPage().addPaymentMethodLink);
	   logger.info("user clicked on the add payment method link");
	}
	
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		
	List <Map<String, String>> addPaymentMethod = dataTable.asMaps(String.class, String.class);
	sendText(factory.accountPage().cardNumber, addPaymentMethod.get(0).get("cardNumber"));
	sendText(factory.accountPage().nameOnCard, addPaymentMethod.get(0).get("nameOnCard"));
	sendText(factory.accountPage().expirationMonth, addPaymentMethod.get(0).get("expirationMonth"));
	sendText(factory.accountPage().expirationYear, addPaymentMethod.get(0).get("expirationYear"));
	sendText(factory.accountPage().securityCode, addPaymentMethod.get(0).get("securityCode"));
	logger.info("user added new card info");
		
		
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	   click(factory.accountPage().submitNewCardBtn);
	   logger.info("user clicked on the add your card button");
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
	 waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullMessage);
	 Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfullMessage));
	 
	 logger.info("user addedd payment method successfully");
	}
	
	
	// edit payment method
	
	@When("User click on card")
	public void userClickOnCard() {
	    click(factory.accountPage().clickOnCard);
	    logger.info("user clicked on the card");
	}
	
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().editPaymentMethod);
	    logger.info("user clicked on the edit payment method link");
	}
	
	
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
	    List <Map<String, String>> editPaymentMethod =dataTable.asMaps(String.class, String.class);
	    clearTextUsingSendKeys(factory.accountPage().cardNumber);
	    sendText(factory.accountPage().cardNumber, editPaymentMethod.get(0).get("cardNumber"));
	    clearTextUsingSendKeys(factory.accountPage().nameOnCard);
	    sendText(factory.accountPage().nameOnCard, editPaymentMethod.get(0).get("nameOnCard"));
	    clearTextUsingSendKeys(factory.accountPage().expirationMonth);
	    sendText(factory.accountPage().expirationMonth, editPaymentMethod.get(0).get("expirationMonth"));
	    clearTextUsingSendKeys(factory.accountPage().expirationYear);
	    sendText(factory.accountPage().expirationYear, editPaymentMethod.get(0).get("expirationYear"));
	    clearTextUsingSendKeys(factory.accountPage().securityCode);
	    sendText(factory.accountPage().securityCode, editPaymentMethod.get(0).get("securityCode"));
	    logger.info("user entered edit payment method info");
	    
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().submitNewCardBtn);
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	   waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullMessage);
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccessfullMessage));
	   logger.info("user updated payment method successfully");
	}


	
	//remove card
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	    click(factory.accountPage().removePaymentMethod);
	    logger.info("user clicked on the remove payment method link");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		
	}
	
// address
@When("User click on Add address option")
public void userClickOnAddAddressOption() {
    click(factory.accountPage().addAddressBtn);
    logger.info("user clicked on the add address option");
}
@When("user fill address form with below information")
public void userFillAddressFormWithBelowInformation(DataTable dataTable) {
	
	List<Map<String, String>> addAddressInfo = dataTable.asMaps(String.class, String.class);
   
	
	sendText(factory.accountPage().fullName, addAddressInfo.get(0).get("fullName"));
	sendText(factory.accountPage().addressPhoneNumber, addAddressInfo.get(0).get("phoneNumber"));
	sendText(factory.accountPage().streetAddressOption, addAddressInfo.get(0).get("streetAddress"));
	sendText(factory.accountPage().apartmentAddressInput, addAddressInfo.get(0).get("apt"));
	sendText(factory.accountPage().addressCityInput, addAddressInfo.get(0).get("city"));
	sendText(factory.accountPage().stateAddressInput, addAddressInfo.get(0).get("state"));
	sendText(factory.accountPage().addressZipCodeInput, addAddressInfo.get(0).get("zipCode"));
	logger.info("user entered address info");
}
@When("User click Add Your Address button")
public void userClickAddYourAddressButton() {
    click(factory.accountPage().addressSubmitButton);
    logger.info("user clicked on the submit address button");
}

@Then("a message should be displayed ‘Address Added Successfully’")
public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
  waitTillPresence(factory.accountPage().addressMessageSuccessfull);
  Assert.assertTrue(isElementDisplayed(factory.accountPage().addressMessageSuccessfull));
  logger.info("address added successfully");
		
}

@When("User click on edit address option")
public void userClickOnEditAddressOption() {
   click(factory.accountPage().editPaymentMethod);
   logger.info("user clicked on the edit address button");
}

@When("user fill new address form with below information")
public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	
	List<Map<String, String>> addAddressInfo = dataTable.asMaps(String.class, String.class);
   
	clearTextUsingSendKeys(factory.accountPage().fullName);
	sendText(factory.accountPage().fullName, addAddressInfo.get(0).get("fullName"));
	clearTextUsingSendKeys(factory.accountPage().addressPhoneNumber);
	sendText(factory.accountPage().addressPhoneNumber, addAddressInfo.get(0).get("phoneNumber"));
	clearTextUsingSendKeys(factory.accountPage().streetAddressOption);
	sendText(factory.accountPage().streetAddressOption, addAddressInfo.get(0).get("streetAddress"));
	clearTextUsingSendKeys(factory.accountPage().apartmentAddressInput);
	sendText(factory.accountPage().apartmentAddressInput, addAddressInfo.get(0).get("apt"));
	clearTextUsingSendKeys(factory.accountPage().addressCityInput);
	sendText(factory.accountPage().addressCityInput, addAddressInfo.get(0).get("city"));
	clearTextUsingSendKeys(factory.accountPage().stateAddressInput);
	sendText(factory.accountPage().stateAddressInput, addAddressInfo.get(0).get("state"));
	clearTextUsingSendKeys(factory.accountPage().addressZipCodeInput);
	sendText(factory.accountPage().addressZipCodeInput, addAddressInfo.get(0).get("zipCode"));
	logger.info("user entered address info");
}



@When("User click update Your Address button")
public void userClickUpdateYourAddressButton() {
   click(factory.accountPage().addressSubmitButton);
   logger.info("user clicked on the update address button");
}


@Then("a message should be displayed ‘Address Updated Successfully’")
public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
   waitTillPresence(factory.accountPage().addressUpdateSuccessfull);
   Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdateSuccessfull));
	logger.info("user uodated address info successfully");
}


	
@When("User click on remove option of Address section")
public void userClickOnRemoveOptionOfAddressSection()  {
	
    click(factory.accountPage().removeAddress);
    logger.info("user clicked on remove address button");
}
@Then("Address details should be removed")
public void addressDetailsShouldBeRemoved() {
  logger.info("address is removed");
}	
	
	
	
}
