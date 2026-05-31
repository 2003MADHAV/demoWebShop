package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {

	@FindBy(xpath = "//div[@class='header-links']/descendant::a[@class='account']")
	private WebElement accountLink;

	@FindBy(xpath = "//div[@class='listbox']/descendant::a[text()='Addresses']")
	private WebElement addressesLink;

	@FindBy(xpath = "//input[@value='Edit']")
	private WebElement editButton;

	@FindBy(xpath = "//input[@id='Address_FirstName']")
	private WebElement firstNameTextField;

	@FindBy(xpath = "//input[@id='Address_LastName']")
	private WebElement lastNameTextField;

	@FindBy(xpath = "//input[@id='Address_Email']")
	private WebElement emailTextField;

	@FindBy(xpath = "//input[@id='Address_Company']")
	private WebElement companyTextField;

	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement countryDropdown;

	@FindBy(xpath = "//select[@id='Address_StateProvinceId']")
	private WebElement stateDropdown;

	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement cityTextField;

	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement address1TextField;

	@FindBy(xpath = "//input[@id='Address_Address2']")
	private WebElement address2TextField;

	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement zipCodeTextField;

	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement phoneNumberTextField;

	@FindBy(xpath = "//input[@id='Address_FaxNumber']")
	private WebElement faxNumberTextField;

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewButton;

	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAccountLink() {
		accountLink.click();
	}

	public void clickAddressesLink() {
		addressesLink.click();
	}

	public void clickEditButton() {
		editButton.click();
	}

	public void setFirstName(String firstName) {
		firstNameTextField.clear();
		firstNameTextField.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		lastNameTextField.clear();
		lastNameTextField.sendKeys(lastName);
	}

	public void setEmail(String email) {
		emailTextField.clear();
		emailTextField.sendKeys(email);
	}

	public void setCompany(String company) {
		companyTextField.clear();
		companyTextField.sendKeys(company);
	}

	public void selectCountry(String country) {
		Select s = new Select(countryDropdown);
		s.selectByVisibleText(country);
	}

	public void selectState(int index) {
		Select s = new Select(stateDropdown);
		s.selectByIndex(index);
	}

	public void setCity(String city) {
		cityTextField.clear();
		cityTextField.sendKeys(city);
	}

	public void setAddress1(String address1) {
		address1TextField.clear();
		address1TextField.sendKeys(address1);
	}

	public void setAddress2(String address2) {
		address2TextField.clear();
		address2TextField.sendKeys(address2);
	}

	public void setZipCode(String zipCode) {
		zipCodeTextField.clear();
		zipCodeTextField.sendKeys(zipCode);
	}

	public void setPhoneNumber(String phoneNumber) {
		phoneNumberTextField.clear();
		phoneNumberTextField.sendKeys(phoneNumber);
	}

	public void setFaxNumber(String faxNumber) {
		faxNumberTextField.clear();
		faxNumberTextField.sendKeys(faxNumber);
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public boolean isAddressUpdated() {
		return addNewButton.isDisplayed();
	}
}