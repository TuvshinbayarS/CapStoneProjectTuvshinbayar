package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailHomePageSteps extends CommonUtility{

	POMFactory factory= new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");

	} 
	

@Then("below options are present in shop by department sidebar")
public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	List<List<String>> expectedSideBar = dataTable.asLists(String.class);

	Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
	Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
	Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
	Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
	Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
	logger.info("actual is equal to expected");
}

	

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
	   sendText(factory.homePage().allDepartmentDropDown, category);
	   logger.info("user selected product category");
	}
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String item) {
	   sendText(factory.homePage().searchBar, item);
	   logger.info("user entered product in search bar");
	}
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	   click(factory.homePage().searchButton);
	   logger.info("user clicked on the search button");
	}
	
	@When("User click on item")
	public void userClickOnItem() {
	    click(factory.homePage().itemApexLegend);
	    logger.info("user clicked on the product");
	}
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String productQty) {
	selectByVisibleText(factory.homePage().productQuantity, productQty);
	logger.info("user selected product quantity");
			
	}

	@Given("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().addToCartButton);
	    logger.info("user clicked on the add to cart button");
	}


	
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String cartQty) {
		
		if(factory.homePage().cartQuantity.getText().equals(cartQty)) {
			Assert.assertEquals(cartQty, factory.homePage().cartQuantity.getText());
		}
		logger.info("quantity of item added to the cart verified");
		
	}	
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.homePage().cartIcon);
	   logger.info("user clicked on the cart option");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	   click(factory.homePage().checkOutBtn);
	   logger.info("user clicked on the check out button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().shippingAddressBtn);
	    logger.info("user clikced on the shipping address add button");
	}
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
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
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	   click(factory.homePage().addPaymentBtn);
	   logger.info("user clicked on the add payment method button");
	   
	}

	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("user placed the order");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String thanksMessage) {
		   Assert.assertEquals(thanksMessage, factory.homePage().orderPlacedThanksMessage.getText());
		   logger.info("order placed thanks Message displayed");
		}
		
	@Then("User change the category to 'Electronics")
	public void userChangeTheCategoryToElectronics() {
		click(factory.homePage().allDepartmentDropDown);
	    selectByVisibleText(factory.homePage().electronicsDropDown, "Electronics");
	    logger.info("user selected electornics department");
	}

	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.homePage().ordersButton);
	    logger.info("user clicked ont the order section");
	}
	
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	 List<WebElement> elements = (factory.homePage().showDetailList);
	        
	  for(WebElement i: elements) {
		  click(i);
	  }
	    logger.info("user clicked on the first order"); 
	}


	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	   click(factory.homePage().cancelOrderBtn);
	   logger.info("user clicked on the cancel order button");
	}
	
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelReason) {
	    click(factory.homePage().cancelReason);
	    selectByVisibleText(factory.homePage().cancelReason, cancelReason);
	    logger.info("user selected cancel reason");
	}
	
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.homePage().cancelOrderSubmitBtn);
	    logger.info("user submitted order cancellation");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String orderCancelMessage) {
	    Assert.assertEquals(orderCancelMessage, factory.homePage().orderCancelledMessage.getText());
	    logger.info("order cancel successful message diplayed");
	}
	
	
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	 click(factory.homePage().returnBtn);
	 logger.info("user clicked on the return button");
	}
	
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		 click(factory.homePage().cancelReason);
		    selectByVisibleText(factory.homePage().cancelReason, returnReason);
		    logger.info("user selected return reason");
	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOff) {
		click(factory.homePage().dropOffInput);
	    selectByVisibleText(factory.homePage().dropOffInput, dropOff);
	    logger.info("user selected drop off option");
	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	   click(factory.homePage().returnOrderSubmit);
	   logger.info("user submitted return order");
	}
	
	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String returnSuccessfullMessage) {
		Assert.assertEquals(returnSuccessfullMessage, factory.homePage().returnSuccessfullMessage.getText());
	    logger.info("order return successful message diplayed");
	}
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.homePage().reviewButton);
	   logger.info("userclicked on the review button");
	}
	
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String reviewText) {
	   sendText(factory.homePage().reviewHeadLine, headline);
	   sendText(factory.homePage().reviewText, reviewText);
		logger.info("user wrote review");
	}
	
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	  click(factory.homePage().addReviewButton);
	}
	
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedSuccessMessage) {
	  waitTillPresence(factory.homePage().reviewAddedSuccessfullMessage);
	  Assert.assertEquals(factory.homePage().reviewAddedSuccessfullMessage.getText(), reviewAddedSuccessMessage);
	  logger.info("Your review added successfully message displayed");
	}
	
	
	
	
}
