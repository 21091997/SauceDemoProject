package com.saucedemo.TestPack;

import java.io.IOException;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.PomAddToCart;
import com.saucedemo.UtilityPack.UtilityClass;



public class TestClassAddToCart extends TestBaseclass
{
	
	@Test
	public void verifyBagProductAddToCartFunctionality() throws InterruptedException, IOException

{
	
			
			PomAddToCart hp = new PomAddToCart(driver);
			hp.ClickPrdctName();
			System.out.println("Product is clicked");
			Thread.sleep(3000);
			
			hp.ClickAddToCartBtn();
			Thread.sleep(3000);
			System.out.println("Add to cart button is clicked");
			
			UtilityClass.screenshotMethod(driver, "TC02_addToCartPageScreenshot");
			System.out.println("Screenshot is taken");
			
			System.out.println("Apply the validation");
			
			String expectedProductSelected = "1";
			
			String actualProductSelected = hp.getTextFromCart();
			
			Assert.assertEquals(actualProductSelected, expectedProductSelected);

			
			

			
}
}








