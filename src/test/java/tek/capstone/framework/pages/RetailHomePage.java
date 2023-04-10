package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath = "//option[text()='Electronics']")
	public WebElement electronicsDropDown;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	@FindBy(xpath ="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlug;
	
	@FindBy(xpath ="//select[@class='product__select']")
	public WebElement productQuantity;
	
	//@FindBy(xpath ="//span[text()='Add to Cart']")
	//public WebElement addToCartButton;
	
	//@FindBy(xpath ="//button[@class ='product__btn']")
	//public WebElement addToCartButton;
	
	@FindBy(id ="addToCartBtn")
	public WebElement addToCartButton;
	
	@FindBy(id ="orderLink")
	public WebElement ordersButton;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id = "cartBtn")
	public WebElement cartIcon;
	
	@FindBy(xpath="//span[@class='cart__item-delete']")
	public WebElement cartItemDelete;
	
	@FindBy(id="proceedBtn")
	public WebElement checkOutBtn;
	
	@FindBy(id="addAddressBtn")
	public WebElement shippingAddressBtn;
	
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanksMessage;
	
	@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement itemApexLegend;
	
	
	@FindBy(xpath= "(//*[@class='order__header-btn'])[1]")
	public WebElement showDetails;
	
	@FindBy(xpath= "(//p[contains(text(),'Show Details')])")

	public List<WebElement> showDetailList;
	
	@FindBy(xpath="//button[text()='Cancel The Order']")
	public WebElement cancelOrderBtn;
	
	@FindBy(id="reasonInput")
	public WebElement cancelReason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderSubmitBtn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelledMessage;
	
	@FindBy(id="returnBtn")
	public WebElement returnBtn;
	
	@FindBy(id="dropOffInput")
	public WebElement dropOffInput;
	
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnOrderSubmit;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnSuccessfullMessage;
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewButton;
	
	@FindBy(xpath="//*[@placeholder='what is most important to know?']")
	public WebElement reviewHeadLine;
	
	@FindBy(xpath="//*[@placeholder='what did you like or dislike? what did you use this product for?']")
	public WebElement reviewText;
	
	@FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement addReviewButton;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessfullMessage;
	
}


