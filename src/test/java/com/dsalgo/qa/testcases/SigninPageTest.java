package com.dsalgo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;
import com.dsalgo.qa.pages.SigninPage;

public class SigninPageTest extends TestBase 
{
	PortalPage portalpage;
    HomePage homepage;
    SigninPage signinpage;
    
	public SigninPageTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
	    portalpage = new PortalPage();	
	    homepage = portalpage.clickonGetStartedBtn();
	    signinpage = homepage.clickonSigninBtn();
	}
	@Test(priority=1)
	public void clickonSignin() 
	{
		homepage.clickonSigninBtn();
	}
	@Test(priority=2)
	public void loginTest() 
	{
		homepage=signinpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		Assert.assertEquals(homepage.AlertMessage(),"You are logged in");
		
		
	}
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	

}
