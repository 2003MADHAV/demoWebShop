package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

	@FindBy(xpath = "//h2[@class='product-title']/child::a") private WebElement firstProudct;
	
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicFirstProduct() {
		firstProudct.click();
	}
}
