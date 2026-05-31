package com.demoWebShop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='Email']") private WebElement emailTextBox;
	@FindBy(xpath = "//input[@id='Password']") private WebElement passwordTextBox;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login(String email,String pwd) {
		emailTextBox.sendKeys(email);
		passwordTextBox.sendKeys(pwd);
		loginButton.click();
	}

}
