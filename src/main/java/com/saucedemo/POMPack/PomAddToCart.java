package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAddToCart 
{
    WebDriver driver;
    
    @FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement PrdctName;
    public void ClickPrdctName()
    {
    	PrdctName.click();
    }
    
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div[2]/button")
	WebElement AddToCartBtn;
    public void ClickAddToCartBtn()
    {
    	AddToCartBtn.click();
    }
    
    @FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	WebElement CartBtn;
    public void ClickToCartBtn()
    {
    	CartBtn.click();
    }
    public String getTextFromCart()
	{
		String actualProductSelected = CartBtn.getText();
	return actualProductSelected;   //=1
	}

    
    public PomAddToCart (WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
}
