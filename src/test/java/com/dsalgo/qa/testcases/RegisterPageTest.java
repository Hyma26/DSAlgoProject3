package com.dsalgo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;
import com.dsalgo.qa.pages.RegisterPage;
import com.qa.dsalgo.util.TestUtil;

public class RegisterPageTest extends TestBase
{
	PortalPage portalpage;
    HomePage homepage;
    RegisterPage registerpage;
    
    String sheetName="loginDetails";
	
	public RegisterPageTest() 
	{
		super();
	}
	@BeforeMethod
	public void setup() 
	{
		initialization();
	    portalpage = new PortalPage();	
	    homepage = portalpage.clickonGetStartedBtn();
	    registerpage=homepage.clickRegisterBtn();
	}
	
	@Test(priority=1)
	public void clickRegister() 
	{
		registerpage.clickRegister();
	}
	@Test(priority=2)
	public void testRegisterPagewithPasswordMismatch() 
	{
		registerpage.enterData("xyz","12345abc", "12345mno");
		registerpage.clickonRegisterBtn();
		Assert.assertEquals(registerpage.Alertmessage(),"password_mismatch:The two password fields didn’t match." );
		
	}
	@DataProvider
	public Object[][] getRegisterData() 
	{
		Object data[][] = TestUtil.getTestData("loginDetails");
		return data;
	}
	
	@Test(priority=3,dataProvider="getRegisterData")
	public void testRegistrationSuccess(String Username,String Password,String Passwordconfirmation)
	{
		registerpage=homepage.clickRegisterBtn();
		registerpage.enterData(Username, Password, Passwordconfirmation);
		registerpage.clickonRegisterBtn();
	}
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}

	

		
}
