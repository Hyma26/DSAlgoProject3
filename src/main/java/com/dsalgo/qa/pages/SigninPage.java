package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.Base.TestBase;

public class SigninPage extends TestBase
{
	@FindBy(xpath="//div[@class='navbar-nav']/ul/a[3]")
	WebElement Signin;
	@FindBy(id="id_username")
	WebElement Username;
	@FindBy(id="id_password")
	WebElement Password;
	@FindBy(xpath="//div[@class='col-sm']/form/input[4]")
	WebElement Login;
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement AlertMessage;
	
	public SigninPage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	} 
	public void clickonSignin()
	{
		Signin.click();
	}
	public HomePage login(String userName,String PassWord) 
	{
		Username.sendKeys(userName);
		Password.sendKeys(PassWord);
		Login.click();
		
		return new HomePage();
	}
	public String AlertMessage() 
	{
		return AlertMessage.getText();
	}

}
