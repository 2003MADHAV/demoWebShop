package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginLink;
	 
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin() {
		loginLink.click();
	}

}
