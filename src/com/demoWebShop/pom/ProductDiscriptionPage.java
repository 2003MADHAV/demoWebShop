package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDiscriptionPage {
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-31']") private WebElement addToCartButton;
	@FindBy(xpath = "//p[@class='content']") private WebElement productAddedMessage;
	@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoppingCartLinkText;
	
	public ProductDiscriptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public String getProductAddedMessage() {
		return productAddedMessage.getText();
	}
	public void clickOnShoppingCart() {
		shoppingCartLinkText.click();
	}

}
