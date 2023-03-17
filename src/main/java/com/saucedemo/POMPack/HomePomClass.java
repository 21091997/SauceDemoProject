package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomClass 
{
WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/"
			+ "div[1]/div/div[1]/div/button")
	WebElement SettingBtn;
	

	public void clickSettingBtn()
	{
		SettingBtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement LogOutBtn;
	
	public void clickLogOutBtn()
	{
		LogOutBtn.click();
	}

	public HomePomClass (WebDriver driver)
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}



}
