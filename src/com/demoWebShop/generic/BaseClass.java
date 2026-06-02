package com.demoWebShop.generic;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.demoWebShop.pom.DashBoardPage;
import com.demoWebShop.pom.HomePage;
import com.demoWebShop.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public  FileLib f=new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readDataFromProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException {
		DashBoardPage d=new DashBoardPage(driver);
		d.clickOnLogin();
		LoginPage l=new LoginPage(driver);
		String email = f.readDataFromProperty("username");
		String pwd = f.readDataFromProperty("pwd");
		l.login(email, pwd);
			
	}
	@AfterMethod
	public void logout() {
		HomePage h=new HomePage(driver);
		h.clickLogout();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();	
	}

}
