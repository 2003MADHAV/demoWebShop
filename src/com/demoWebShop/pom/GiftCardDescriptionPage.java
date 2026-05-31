package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardDescriptionPage {

	@FindBy(xpath = "//input[@class='recipient-name']") private WebElement recipientNameTextBox;
	@FindBy(xpath = "//input[@class='recipient-email']") private WebElement recipientEmailTextBox;
	@FindBy(xpath = "//*[@class='message']") private WebElement messageTextArea;
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-1']") private WebElement addToWishlistutton;
	@FindBy(xpath = "//p[@class='content']") private WebElement verificationMesg;
	@FindBy(xpath = "//span[text()='Wishlist']") private WebElement wishlistLinkText;
	
	public GiftCardDescriptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRecipientNameTextBox() {
		return recipientNameTextBox;
	}

	public WebElement getRecipientEmailTextBox() {
		return recipientEmailTextBox;
	}

	public WebElement getMessageTextArea() {
		return messageTextArea;
	}

	public WebElement getAddToWishlistutton() {
		return addToWishlistutton;
	}

	public String getVerificationMesg() {
		return verificationMesg.getText();
	}

	public WebElement getWishlistLinkText() {
		return wishlistLinkText;
	}
	
}
