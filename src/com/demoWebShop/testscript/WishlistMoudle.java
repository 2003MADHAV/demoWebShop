package com.demoWebShop.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		String verificationMssge = f.readDataFromExcel("moveToWishlist", 1, 4);
		d.getRecipientNameTextBox().sendKeys(rName);
		d.getRecipientEmailTextBox().sendKeys(rEmail);
		d.getMessageTextArea().sendKeys(rMessage);
		d.getAddToWishlistutton().click();
		String resultText=	d.getVerificationMesg();
		Reporter.log(resultText,true);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(resultText,verificationMssge);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-100)");
		d.getWishlistLinkText().click();
		WishListPage w=new WishListPage(driver);
		boolean res =w.getProductPicture();
		Assert.assertTrue(res);
		sf.assertAll();
	}
	
}
