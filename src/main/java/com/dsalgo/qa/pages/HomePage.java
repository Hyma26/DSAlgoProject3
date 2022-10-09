package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.dsalgo.qa.Base.TestBase;

public class HomePage extends TestBase 
{
	@FindBy(xpath="//div[1]/nav/a")
	WebElement HomePagetitle;
	
	@FindBy(xpath="//div[@id='navbarCollapse']/div/div/a")
	WebElement dropdownBtn;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div")
	WebElement DropdownSize;
	
	@FindBy(xpath="//div[2]/div[1]/div/div/a")
	WebElement GetStartedBtn;	
	@FindBy(xpath="/html/body/div[2]")
	WebElement AlertMessage;
	
	@FindBy(xpath="//div[3]/div[1]/div/div/a")
	WebElement DataStructureBtn;
	
	@FindBy(xpath="//div[3]/div[2]/div/div/a")
	WebElement ArrayGetStarted;	
	
	@FindBy(xpath="//div[@class='navbar-nav']/ul/a[2]")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//div[@class='navbar-nav']/ul/a[3]")
	WebElement SigninBtn;
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	}
	
	public String HomePagetitle()
	{
		return driver.getTitle();
	}
	public void clickondropdownBtn()
	{
		dropdownBtn.click();		
	}
	public void getDropdownSize()
	{
			//int dropdowncount = driver.findElement(DropdownSize).size();
			//System.out.println("count of dropdown" + dropdowncount);
			//return dropdowncount;
		DropdownSize.getSize();
	}
	public void clickonGetStarted()
	{
		GetStartedBtn.click();			
				
	}
	public String AlertMessage()
	{
		return AlertMessage.getText();
		
	}
	public void clickonDataStructureBtn() 
	{
		DataStructureBtn.click();
	}
	public void clickonArrayGetStartedBtn() 
	{
		ArrayGetStarted.click();
	}
	
	public RegisterPage clickRegisterBtn()
	{
		RegisterBtn.click();
		return new RegisterPage();
		
	}
	public SigninPage clickonSigninBtn()
	{
		SigninBtn.click();
		return new SigninPage();
		
	}

	
	

}

