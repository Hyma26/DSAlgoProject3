package com.dsalgo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;

public class PortalPageTest extends TestBase 
{
	Logger logger = Logger.getLogger(PortalPageTest.class);
	PortalPage portalpage;
	HomePage homepage;
	
	public PortalPageTest() 
	{
		super();
	}
	@BeforeMethod
	public void setup() 
	{
		initialization();
	    portalpage = new PortalPage();	
	    homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void bannercontentTest()
	{
		String banner=portalpage.bannercontent();
		Assert.assertEquals(banner,"Preparing for the Interviews");
	}
	
	@Test(priority=2)
	public void clickonGetStartedBtn()
	{
		homepage=portalpage.clickonGetStartedBtn();		
	}
	
	@Test(priority=3)
	public void HomePageTitle() 
	{
		String hometitle=portalpage.HomePageTitle();
		Assert.assertEquals(hometitle,"Numpy Ninja");
		logger.info("hometitle success");
	}	
		
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	

}
