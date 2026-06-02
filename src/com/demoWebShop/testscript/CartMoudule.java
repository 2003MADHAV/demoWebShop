package com.demoWebShop.testscript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoWebShop.generic.BaseClass;
import com.demoWebShop.pom.CheckoutPage;
import com.demoWebShop.pom.HomePage;
import com.demoWebShop.pom.ProductDiscriptionPage;
import com.demoWebShop.pom.ProductListPage;
import com.demoWebShop.pom.ProductOrderCompletationPage;
import com.demoWebShop.pom.ShoppingCartPage;



@Listeners(com.demoWebShop.generic.ListenerImplementation.class)
public class CartMoudule extends BaseClass {

	@Test
	public void addToCart() throws IOException {
		
		HomePage h=new HomePage(driver);
		h.enterItemNameIn(f.readDataFromProperty("productName"));
		h.clickOnSearchButton();
		ProductListPage p=new ProductListPage(driver);
		p.clicFirstProduct();
		ProductDiscriptionPage pd=new ProductDiscriptionPage(driver);
		pd.clickOnAddToCartButton();
		String resultText =pd.getProductAddedMessage();
		Reporter.log(resultText, true);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-100)");
		pd.clickOnShoppingCart();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.selectCountry("India");
		scp.selectState(0);
		scp.enterZipCode(f.readDataFromProperty("pincode"));
		scp.clickTermsOfService();
		scp.clickCheckout();
		
		CheckoutPage cp = new CheckoutPage(driver);

		cp.selectBillingAddress(0);
		cp.clickBillingContinue();

		cp.selectShippingAddress(0);
		cp.clickShippingAddressContinue();

		cp.selectShippingMethod();
		cp.clickShippingMethodContinue();

		cp.selectPaymentMethod();
		cp.clickPaymentMethodContinue();
		cp.selectCreditCardType("Master card");
		
		cp.enterCardHolderName(f.readDataFromProperty("cardHolderName"));
		cp.enterCardNumber(f.readDataFromProperty("cardNumber"));
		
		cp.selectExpireMonth(5);
		cp.selectExpireYear(5);
		
		cp.enterCardCode(f.readDataFromProperty("cv"));
		cp.clickPaymentInfoContinue();
		cp.clickConfirmOrder();
		
		ProductOrderCompletationPage poc = new ProductOrderCompletationPage(driver);
		SoftAssert sf = new SoftAssert();

		Reporter.log(poc.getOrderConfirmationText(), true);

		sf.assertTrue(
		        poc.isOrderConfirmationDisplayed(),
		        "Order confirmation message is not displayed"
		);

		poc.clickContinue();
		sf.assertAll();
		
	}
}