package com.dsalgo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.Base.TestBase;

public class ArrayPage extends TestBase
{
	@FindBy(xpath="//div[3]/div[2]/div/div/a")
	WebElement ArrayGetStartedBtn;
	
	@FindBy(xpath="/html/body/div[2]/ul[1]/a")
	WebElement ArraysinPython;
	
	@FindBy(xpath="//a[@ href=\"/array/arrays-using-list/\"]")
	WebElement ArraysUsingList;
	
	@FindBy(xpath="//a[@href=\"/array/basic-operations-in-lists/\"]")
	WebElement BasicOperationList;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[4]/a")
	WebElement ApplicationsOfArray; 
	
	@FindBy(id="output")
	WebElement Output;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement PracticeQuestions;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement Signout;
	
	
	public ArrayPage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	} 
	public ArrayPage clickonGetStarted() 
	{
		ArrayGetStartedBtn.click();
		return new ArrayPage();
	}
	public void clickArraysinPython() 
	{
		ArraysinPython.click();		
	}
	public void clickArraysUsingList() 
	{
		ArraysUsingList.click();		
	}
	public void clickBasicOperationList() 
	{
		BasicOperationList.click();		
	}
	public void clickApplicationsOfArray() 
	{
		ApplicationsOfArray.click();
	}
	public void loadTryHere() throws InterruptedException 
	{
		WebElement tryherelink = driver.findElement(By.xpath("//a[@href='/tryEditor']"));
		tryherelink.click();
		WebElement codeTextArea = driver.findElement(By.xpath("//textarea[@tabindex='0']"));
		codeTextArea.sendKeys("print('Hello Ninja')");
		Thread.sleep(2000);
		WebElement runButton = driver.findElement(By.xpath("//button"));
		runButton.click();
	}
	
	public void clickPracticeQuestions()
	{		
		PracticeQuestions.click();
	}
	public void clickSignout() 
	{
		Signout.click();
	}
	
	

}
