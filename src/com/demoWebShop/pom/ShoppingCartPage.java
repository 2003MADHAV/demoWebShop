package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	
	@FindBy(id = "CountryId")
	private WebElement countryDropdown;

	@FindBy(id = "StateProvinceId")
	private WebElement stateDropdown;

	@FindBy(id = "ZipPostalCode")
	private WebElement zipCodeTextField;

	@FindBy(id = "termsofservice")
	private WebElement termsOfServiceCheckBox;

	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectCountry(String countryName) {
		Select s = new Select(countryDropdown);
		s.selectByVisibleText(countryName);
	}

	public void selectState(int index) {
		Select s = new Select(stateDropdown);
		s.selectByIndex(index);
	}

	public void enterZipCode(String zipCode) {
		zipCodeTextField.sendKeys(zipCode);
	}

	public void clickTermsOfService() {
		termsOfServiceCheckBox.click();
	}

	public void clickCheckout() {
		checkoutButton.click();
	}
	

}
