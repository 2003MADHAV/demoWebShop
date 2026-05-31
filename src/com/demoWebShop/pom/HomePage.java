package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(xpath ="//a[text()='Log out']" ) private WebElement logoutLink;
@FindBy(xpath = "//div[@class='header-menu']/descendant::a[contains(text(),'Gift Cards')]")
private WebElement giftCardsLinkText;

@FindBy(xpath = "//input[@id='small-searchterms']") private WebElement productSearchBox;
@FindBy(xpath = "//input[@value='Search']") private WebElement SearchButton;

@FindBy(xpath = "//div[@class='header-links']/descendant::a[@class='account']") 
private WebElement userAccount;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickGiftCards() {
		giftCardsLinkText.click();
	}
	public void clickLogout() {
		logoutLink.click();
	}
	
	public void enterItemNameIn(String value) {
		productSearchBox.sendKeys(value);
		//productSearchBox.sendKeys(value,Keys.ENTER);
		
	}
	public void clickOnSearchButton() {
		SearchButton.click();
	}
	public void clickOnUserAccount() {
		userAccount.click();
	}
	
}
