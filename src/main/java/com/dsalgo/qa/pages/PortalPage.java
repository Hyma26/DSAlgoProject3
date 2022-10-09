package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.Base.TestBase;

public class PortalPage extends TestBase
{
	//Page Factory
	
	@FindBy(xpath="//button[@class='btn']")
	WebElement GetStartedBtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div/h1")
	WebElement banner;
	
	@FindBy(xpath="//div[1]/nav/a")
	WebElement HomePageTitle;
	
	public PortalPage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	}
	
	public String bannercontent() 
	{
		return banner.getText();
	}
	public HomePage clickonGetStartedBtn () 
	{
		GetStartedBtn.click();
		return new HomePage();
	}
	public String HomePageTitle()
	{
		return driver.getTitle();
		
	}
}
