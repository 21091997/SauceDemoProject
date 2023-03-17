package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin 
{
	//1.WebDriver globally declared
	WebDriver driver;
	
	//2.Element find with @FindBy (@FindBy is an annotation,annotations 
	//works like method only)
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	//3.Element action perform in a method
	public void sendUsername()
	    {
		username.sendKeys("standard_user");
	    }
	
	//4. Find Password element by @FindBy
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
		
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginBtn;
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	//4.constructor create
	public PomLogin (WebDriver driver)
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}

