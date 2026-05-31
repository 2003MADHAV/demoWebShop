package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOrderCompletationPage {

	@FindBy(xpath = "//div[@class='title']/child::strong")
	private WebElement orderConfirmationText;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	public ProductOrderCompletationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isOrderConfirmationDisplayed() {
		return orderConfirmationText.isDisplayed();
	}

	public String getOrderConfirmationText() {
		return orderConfirmationText.getText();
	}

	public void clickContinue() {
		continueButton.click();
	}
}