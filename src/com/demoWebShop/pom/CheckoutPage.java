package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	@FindBy(name = "billing_address_id")
	private WebElement billingAddressDropdown;

	@FindBy(xpath = "//div[@id='billing-buttons-container']/child::input")
	private WebElement billingContinueButton;

	@FindBy(id = "shipping-address-select")
	private WebElement shippingAddressDropdown;

	@FindBy(xpath = "(//p[@class='back-link']/following-sibling::input)[1]")
	private WebElement shippingAddressContinueButton;

	@FindBy(id = "shippingoption_1")
	private WebElement shippingMethodRadioButton;

	@FindBy(xpath = "(//p[@class='back-link']/following-sibling::input)[2]")
	private WebElement shippingMethodContinueButton;

	@FindBy(id = "paymentmethod_2")
	private WebElement paymentMethodRadioButton;

	@FindBy(xpath = "(//p[@class='back-link']/following-sibling::input)[3]")
	private WebElement paymentMethodContinueButton;

	@FindBy(id = "CreditCardType")
	private WebElement creditCardTypeDropdown;

	@FindBy(id = "CardholderName")
	private WebElement cardHolderNameTextField;

	@FindBy(id = "CardNumber")
	private WebElement cardNumberTextField;

	@FindBy(id = "ExpireMonth")
	private WebElement expireMonthDropdown;

	@FindBy(id = "ExpireYear")
	private WebElement expireYearDropdown;

	@FindBy(id = "CardCode")
	private WebElement cardCodeTextField;

	@FindBy(xpath = "(//p[@class='back-link']/following-sibling::input)[4]")
	private WebElement paymentInfoContinueButton;

	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmOrderButton;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectBillingAddress(int index) {
		new Select(billingAddressDropdown).selectByIndex(index);
	}

	public void clickBillingContinue() {
		billingContinueButton.click();
	}

	public void selectShippingAddress(int index) {
		new Select(shippingAddressDropdown).selectByIndex(index);
	}

	public void clickShippingAddressContinue() {
		shippingAddressContinueButton.click();
	}

	public void selectShippingMethod() {
		shippingMethodRadioButton.click();
	}

	public void clickShippingMethodContinue() {
		shippingMethodContinueButton.click();
	}

	public void selectPaymentMethod() {
		paymentMethodRadioButton.click();
	}

	public void clickPaymentMethodContinue() {
		paymentMethodContinueButton.click();
	}

	public void selectCreditCardType(String cardType) {
		new Select(creditCardTypeDropdown).selectByVisibleText(cardType);
	}

	public void enterCardHolderName(String cardHolderName) {
		cardHolderNameTextField.sendKeys(cardHolderName);
	}

	public void enterCardNumber(String cardNumber) {
		cardNumberTextField.sendKeys(cardNumber);
	}

	public void selectExpireMonth(int index) {
		new Select(expireMonthDropdown).selectByIndex(index);
	}

	public void selectExpireYear(int index) {
		new Select(expireYearDropdown).selectByIndex(index);
	}

	public void enterCardCode(String cardCode) {
		cardCodeTextField.sendKeys(cardCode);
	}

	public void clickPaymentInfoContinue() {
		paymentInfoContinueButton.click();
	}

	public void clickConfirmOrder() {
		confirmOrderButton.click();
	}
}