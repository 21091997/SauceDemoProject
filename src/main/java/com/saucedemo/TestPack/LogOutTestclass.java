package com.saucedemo.TestPack;

import java.io.IOException;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePomClass;
import com.saucedemo.UtilityPack.UtilityClass;



public class LogOutTestclass extends TestBaseclass
{
	
	@Test
	public void verifyLogOutFunctionality() throws IOException, InterruptedException
	{
	
	 //logOutActivity
		HomePomClass hp = new HomePomClass(driver);
		
		hp.clickSettingBtn();
		System.out.println("Clicked on setting button");
		Thread.sleep(3000);
		
		hp.clickLogOutBtn();
		System.out.println("Clicked on logOut Button");
		Thread.sleep(3000);
		
		System.out.println("Went on loginPage");
		Thread.sleep(3000);
		
		UtilityClass.screenshotMethod(driver, "TC03_loginpage_Screenshot");
		System.out.println("Screenshot is taken");
		
		System.out.println("Apply verification");
		
		  //BA/PO/Dev->acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		
		String actualTitle   = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);

		
	
		
		
		
		
	}

}