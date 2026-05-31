package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsListPage {

	@FindBy(xpath = "//div[@class='product-item']") private WebElement firstProduct;
	
	public GiftCardsListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnFirstProduct() {
		firstProduct.click();
	}
}
