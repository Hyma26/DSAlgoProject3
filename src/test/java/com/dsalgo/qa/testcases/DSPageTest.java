package com.dsalgo.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.DSPage;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;
import com.dsalgo.qa.pages.SigninPage;

public class DSPageTest extends TestBase
{
	PortalPage portalpage;
    HomePage homepage;
    SigninPage signinpage;
    DSPage dspage;
    
	 
	 public DSPageTest() 
		{
			super();
		}
		@BeforeClass
		public void setup() 
		{
			initialization();
		    portalpage = new PortalPage();	
		    homepage = portalpage.clickonGetStartedBtn();
		    signinpage = homepage.clickonSigninBtn();
		    homepage=signinpage.login(prop.getProperty("Username"), prop.getProperty("Password"));		   
		    dspage=new DSPage();
		    
		   
		}
		@Test(priority=1)
		public void clickGetStarted() 
		{			
			homepage.clickonDataStructureBtn();
			System.out.println("print DataStructurePage GetStarted");
		}
		@Test(priority=2)
		public void clickTimeComplexity() throws InterruptedException 
		{
			dspage.clickTimeComplexity();			
		}
		@Test(priority=3)
		public void clickDataStructureTimeComplexity() 
		{
			dspage.clickDataStructureTimeComplexity();
		}		
		
		@Test(priority = 4)
		public void loadTryHere1() throws InterruptedException
		{
		   dspage.loadTryHere();
		   Thread.sleep(2000);
		   driver.navigate().back();
		}			
		
		@Test(priority=5)
		public void clickPracticeQuestions() throws InterruptedException 
		{
			dspage.clickPracticeQuestions();			
			driver.navigate().back();			
		}
		
		
		@AfterClass
		public void teardown() 
		{
			driver.close();
		}
		
		
		
}
