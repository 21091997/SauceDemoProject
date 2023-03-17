package com.saucedemo.TestPack;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassLogin extends TestBaseclass
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{

System.out.println("Apply verification");
		
		//BA/PO/Dev->acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		
		String actualTitle   = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);	

}
}

