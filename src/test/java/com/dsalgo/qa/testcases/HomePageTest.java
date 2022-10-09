package com.dsalgo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.DSPage;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;
import com.dsalgo.qa.pages.RegisterPage;

import TestNGListners.CustomListener;
@Listeners(CustomListener.class)
public class HomePageTest extends TestBase
{
	PortalPage portalpage;
    HomePage homepage;
    RegisterPage registerpage;
    DSPage dspage;
    
	
	public HomePageTest() 
	{
		super();
	}
	@BeforeMethod
	public void setup() 
	{
		initialization();
	    portalpage = new PortalPage();	
	    homepage = portalpage.clickonGetStartedBtn();
	}
	
	@Test(priority=1)
	public void HomePagetitle() 
	{
		String title=homepage.HomePagetitle();
		Assert.assertEquals(title,"NumpyNinja");
	}
	@Test(priority=2)
	public void failedHomePageTitle() 
	{
		String hometitle=portalpage.HomePageTitle();
		Assert.assertEquals(hometitle,"Numpy Ninjas");
		
	}
	//@Attachment(value="Page screenshot",type="image/png")
	//public byte[]saveScreenshotPNG(WebDriver driver){
		//return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	//}
	@Test(priority=3)
	public void clickondropdownBtn()
	{
		homepage.clickondropdownBtn();	
		
	}
	@Test(priority=4)
	public void clickonGetStarted() 
	{
		homepage.clickonGetStarted();
		homepage.AlertMessage();
	}
	//@Test(priority=5)
	//public void AlertMessage()
	{
	    // homepage.AlertMessage();
		
	}
	@Test(priority=5)
	public void clickRegisterBtn()
	{
		homepage.clickRegisterBtn();
		homepage.clickonSigninBtn();
	}
	//@Test(priority=7)
	//public void clickonSigninBtn()
	{
		//homepage.clickonSigninBtn();		
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}

}
