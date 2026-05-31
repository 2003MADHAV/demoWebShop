package com.demoWebShop.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoWebShop.generic.BaseClass;
import com.demoWebShop.pom.GiftCardDescriptionPage;
import com.demoWebShop.pom.GiftCardsListPage;
import com.demoWebShop.pom.HomePage;
import com.demoWebShop.pom.WishListPage;

@Listeners(com.demoWebShop.generic.ListenerImplementation.class)
public class WishlistMoudle extends BaseClass{
	@Test
	public void moveToWishlist() throws EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		h.clickGiftCards();
		GiftCardsListPage l=new GiftCardsListPage(driver);
		l.clickOnFirstProduct();
		GiftCardDescriptionPage d=new GiftCardDescriptionPage(driver);	
		String rName = f.readDataFromExcel("moveToWishlist", 1, 1);
		String rEmail = f.readDataFromExcel("moveToWishlist", 1, 2);
		String rMessage = f.readDataFromExcel("moveToWishlist", 1, 3);
		d.getRecipientNameTextBox().sendKeys(rName);
		d.getRecipientEmailTextBox().sendKeys(rEmail);
		d.getMessageTextArea().sendKeys(rMessage);
		d.getAddToWishlistutton().click();
		String resultText=	d.getVerificationMesg();
		System.out.println(resultText);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-100)");
		d.getWishlistLinkText().click();
		WishListPage w=new WishListPage(driver);
		boolean res =w.getProductPicture();
		if(res==true) {
			System.out.println("Product is dispalyed in wishlist Module");
		}else {
			System.out.println("Product is Not dispalyed in wishlist Module");
			
		}
	}
	
}
