package com.dsalgo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.Base.TestBase;

public class DSPage extends TestBase
{
	//DSPage dspage=new DSPage();
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/a")
	WebElement DataStructureBtn;
	
	@FindBy(xpath="//a[@class='list-group-item']")
	WebElement TimeComplexity;
	
	@FindBy(xpath="//*[@id=\"content\"]/li/a")
	WebElement DataStructureTimeComplexity;	
	
	@FindBy(xpath="//div[2]/div/div[2]/a")
	WebElement Tryhere;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement PracticeQuestions;		
	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement Signout;
	
	public DSPage() 
	{
		PageFactory.initElements(driver,this); //this means current class
	} 
	
	public DSPage clickonGetStarted() 
	{
		DataStructureBtn.click();
		return new DSPage();
	}
	public void clickTimeComplexity() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeComplexity.click();
	}
	public void clickPracticeQuestions()	{
		
		PracticeQuestions.click();
	}
	public void clickDataStructureTimeComplexity() 
	{
		DataStructureTimeComplexity.click();
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
	
	public void clickSignout() 
	{
		Signout.click();
	}
	

}
