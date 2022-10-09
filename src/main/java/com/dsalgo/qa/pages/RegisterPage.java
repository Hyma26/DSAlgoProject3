package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.Base.TestBase;

public class RegisterPage extends TestBase
{
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement Register;
	
	@FindBy(id="id_username")
	WebElement Username;
	
	@FindBy(id="id_password1")
	WebElement Password;
	
	@FindBy(id="id_password2")
	WebElement PasswordConfirm;
	
	@FindBy(xpath="//div[@class='col-sm']/form/input[5]")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement Alertmessage;	
			
	
	public RegisterPage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	} 
	public void clickRegister()
	{
		Register.click();
	}
	public void enterData(String name,String pwd,String pwdCfrm) 
	{
		Username.sendKeys(name);
		Password.sendKeys(pwd);
		PasswordConfirm.sendKeys(pwdCfrm);
	}
	public String Alertmessage() 
	{
			return Alertmessage.getText();
	}
	public void clickonRegisterBtn() 
	{
		RegisterBtn.click();
	}

}
