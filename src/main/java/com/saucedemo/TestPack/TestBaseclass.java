package com.saucedemo.TestPack;

import java.io.IOException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.PomLogin;
import com.saucedemo.UtilityPack.UtilityClass;

public class TestBaseclass 

{
	 WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException, InterruptedException
	{
		if(browserName.equals("chrome"))
		{
			//google chrome
			System.setProperty("webdriver.chrome.driver", 
					"F:\\Selenium\\Chromdriver win32\\Updated Chrome\\chromedriver_win32 (1)\\chromedriver.exe");			
			driver = new ChromeDriver();
		}
		else
		{
			//else firefox
			System.setProperty("webdriver.gecko.driver", 
					"F:\\Selenium\\Firefoxdriver win32\\Gecko win 64\\geckodriver-v0.32.0-win64\\geckodriver.exe");			
			driver = new FirefoxDriver();			
		}

		System.out.println("Browser is opened");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		Thread.sleep(3000);

	driver.get("https://www.saucedemo.com/");
	System.out.println("Url is opened");

	//take screenshot
		UtilityClass.screenshotMethod(driver, "TC01_loginPageScreenshot");
			System.out.println("Screenshot is taken");


			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	//loginActivity
		//username +action
		//password +action
		//loginBtn +action
		
	PomLogin plogin = new PomLogin(driver);   
		
	        plogin.sendUsername();
		    System.out.println("Username is entered");
		    Thread.sleep(3000);
		
		    plogin.sendPassword();
		System.out.println("Password is entered");
		Thread.sleep(3000);
		
		plogin.clickLoginBtn();
		System.out.println("Clicked on login button");
		Thread.sleep(3000);
		
		//homePage
			System.out.println("Went on homePage");
			Thread.sleep(3000);
			
			//take screenshot
			UtilityClass.screenshotMethod(driver, "TC01_homePageScreenshot");
				System.out.println("Screenshot is taken");		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
	//	System.out.println("End of Program");
			
	}	
}
