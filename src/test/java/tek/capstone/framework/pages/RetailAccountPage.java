package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

		
		public RetailAccountPage() {
			PageFactory.initElements(getDriver(), this);
		}
		
		@FindBy(xpath="//img[@id='profileImage']")
		public WebElement profileImage;
		
		@FindBy(id ="nameInput")
		public WebElement profileNameInputField;
		
		@FindBy(id="personalPhoneInput")
		public WebElement profilePhoneNumberField;
		
		@FindBy(xpath ="//button[text()='Update']")
		public WebElement profileUpdateButton;
		
		@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
		public WebElement personalInfoUpdateSuccessMessage;
		
		@FindBy (id="previousPasswordInput")
		public WebElement previousPassword;
		
		@FindBy (id="newPasswordInput")
		public WebElement newPassword;
		
		@FindBy (id="confirmPasswordInput")
		public WebElement confirmPassword;
		
		@FindBy (id="credentialsSubmitBtn")
		public WebElement changePasswordButton;

		@FindBy(xpath="//div[text()='Password Updated Successfully']")
		public WebElement passwordUpdateSuccessMessage;
		
		@FindBy(xpath="//div[@class='account__address-new']")
		public WebElement addAddressBtn;
		 
		@FindBy(xpath="//select[@id='countryDropdown']")
		public WebElement country;
		 
		 
		@FindBy(css=" #fullNameInput")
		public WebElement fullName;
		 
		@FindBy(css="#phoneNumberInput")
		public WebElement addressPhoneNumber;
		 
		@FindBy(xpath="//input[@id='streetInput']")
		public WebElement streetAddressOption;
		 
		@FindBy(xpath="//input[@id='apartmentInput']")
		public WebElement apartmentAddressInput;
		 
		 
		@FindBy(css="#cityInput")
		public WebElement addressCityInput;
		 
		 
		@FindBy(xpath="(//select[@class='account__address-new-dropdown'])[2]")
		public WebElement stateAddressInput;
		 
		@FindBy(id="zipCodeInput")
		public WebElement addressZipCodeInput;
		 
		@FindBy(xpath="//button[@id='addressBtn']")
		public WebElement addressSubmitButton;
		 
		 
		@FindBy(xpath=" //div[contains(text(),'Address Added Successfully')]")
		public WebElement addressMessageSuccessfull;
		
		@FindBy(id="cardNumberInput")
		public WebElement cardNumber;
		
		@FindBy(id="nameOnCardInput")
		public WebElement nameOnCard;
		
		@FindBy(id="expirationMonthInput")
		public WebElement expirationMonth;
		
		@FindBy(id="expirationYearInput")
		public WebElement expirationYear;
		
		@FindBy(id="securityCodeInput")
		public WebElement securityCode;
		
		@FindBy(id="paymentSubmitBtn")
		public WebElement submitNewCardBtn;
		
		@FindBy(xpath="//*[contains(@class, 'text-sm')]")
		public WebElement addPaymentMethodLink;
		
		@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
		public WebElement paymentMethodAddedSuccessfullMessage;
		
		@FindBy(xpath="//button[text()='Edit']")
		public WebElement editPaymentMethod;
		
		@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
		public WebElement paymentMethodUpdatedSuccessfullMessage;
		
		@FindBy(xpath="//p[@class='account__payment-sub-title']")
		public WebElement clickOnCard;
		
		@FindBy(xpath="	//button[text()='remove']")
		public WebElement removePaymentMethod;
		
		@FindBy(xpath="//button[text()='Edit']")
		public WebElement editAddressBtn;
		
		@FindBy(xpath=" //div[contains(text(),'Address Updated Successfully')]")
		public WebElement addressUpdateSuccessfull;
		
		@FindBy(xpath="//button[text()='Remove']")
		public WebElement removeAddress;
	}