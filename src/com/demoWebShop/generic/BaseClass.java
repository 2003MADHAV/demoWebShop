package com.demoWebShop.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		ChromeOptions option =new ChromeOptions();
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("madhav23@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mkchy@#2025");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();	
	}

}
