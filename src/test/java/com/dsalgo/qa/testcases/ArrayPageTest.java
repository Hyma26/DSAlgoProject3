package com.dsalgo.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dsalgo.qa.Base.TestBase;
import com.dsalgo.qa.pages.ArrayPage;
import com.dsalgo.qa.pages.HomePage;
import com.dsalgo.qa.pages.PortalPage;
import com.dsalgo.qa.pages.SigninPage;

public class ArrayPageTest extends TestBase
{
	PortalPage portalpage;
    HomePage homepage;
    SigninPage signinpage;
    ArrayPage arraypage;
    
	 public ArrayPageTest() 
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
		    arraypage= new ArrayPage();
		    //homepage.clickonGetStarted("Array");
		    
		}
		@Test(priority=1)
		public void clickonArrayGetStartedBtn() 
		{
			homepage.clickonArrayGetStartedBtn();
			
		}
		@Test(priority=2)
		public void clickArraysinPython() 
		{
			arraypage.clickArraysinPython();			
		}
		@Test(priority = 3)
		public void loadTryHere2() throws InterruptedException
		{
		   arraypage.loadTryHere();
		   Thread.sleep(2000);
		   driver.navigate().back();
		}			
		@Test(priority=4)
		public void clickArraysUsingList() 
		{
			arraypage.clickArraysUsingList();
		}
		@Test(priority=5)
		public void loadTryHere3() throws InterruptedException
		{
			 arraypage.loadTryHere();
			
			 driver.navigate().back();
		}			
		@Test(priority = 6)
		public void clickBasicOperationList() 
		{
			arraypage.clickBasicOperationList();
		}
		@Test(priority = 7)
		public void loadTryHere4() throws InterruptedException
		{
		   arraypage.loadTryHere();
		  
		   driver.navigate().back();
		}			
		
		
		@Test(priority=8)
		public void clickApplicationsOfArray() 
		{
			arraypage.clickApplicationsOfArray();			
		}
		@Test(priority=9)
		public void loadTryHere5() throws InterruptedException
		{
		   arraypage.loadTryHere();
		  
		   driver.navigate().back();
		}	
		
		@Test(priority=10)
		public void clickPracticeQuestions() 
		{
			arraypage.clickPracticeQuestions();			
			driver.navigate().back();
		}
		@AfterClass		
		public void teardown() 
		{
			driver.close();
		}
		

			
}
