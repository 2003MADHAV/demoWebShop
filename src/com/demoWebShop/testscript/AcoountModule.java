package com.demoWebShop.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoWebShop.generic.BaseClass;
import com.demoWebShop.pom.HomePage;
import com.demoWebShop.pom.MyAccountPage;

@Listeners(com.demoWebShop.generic.ListenerImplementation.class)
public class AcoountModule extends BaseClass{
	
	@Test
	public void changeAddress() throws EncryptedDocumentException, IOException {
		
		HomePage h=new HomePage(driver);
		h.clickOnUserAccount();
		
		MyAccountPage myAcc = new MyAccountPage(driver);
		myAcc.clickAccountLink();
		myAcc.clickAddressesLink();
		myAcc.clickEditButton();
		myAcc.setFirstName(f.readDataFromExcel("Address", 1, 0));
		myAcc.setLastName(f.readDataFromExcel("Address", 1, 1));
		myAcc.setEmail(f.readDataFromExcel("Address", 1, 2));
		myAcc.setCompany(f.readDataFromExcel("Address", 1, 3));
		myAcc.selectCountry(f.readDataFromExcel("Address", 1, 4));
		myAcc.selectState(Integer.parseInt(f.readDataFromExcel("Address", 1, 5)));
		myAcc.setCity(f.readDataFromExcel("Address", 1, 6));
		myAcc.setAddress1(f.readDataFromExcel("Address", 1, 7));
		myAcc.setAddress2(f.readDataFromExcel("Address", 1, 8));
		myAcc.setZipCode(f.readDataFromExcel("Address", 1, 9));
		myAcc.setPhoneNumber(f.readDataFromExcel("Address", 1, 10));
		myAcc.setFaxNumber(f.readDataFromExcel("Address", 1, 11));
		myAcc.clickSaveButton();
		Assert.assertTrue(
				myAcc.isAddressUpdated(),
				"Address update failed");

		Reporter.log("Address updated successfully", true);
		
	}

}
