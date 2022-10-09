package com.dsalgo.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	//parent class
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() 
	{
		try {
		prop = new Properties();
		
			FileInputStream ip = new FileInputStream("C:\\Users\\Gunagnya\\eclipse-workspace\\DSAlgoProject3\\src\\main\\java\\com\\dsalgo\\qa\\config\\config.properties");
				
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		 
 }
	public static void initialization() 
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunagnya\\eclipse-workspace\\Hello-World\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gunagnya\\eclipse-workspace\\Hello-World\\src\\test\\resources\\drivers\\gecko");
			driver = new FirefoxDriver();
				
	    }
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));

	
}
	public void failed() 
	{
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Gunagnya\\eclipse-workspace\\DSAlgoProject3\\screenshots\\testFailure.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
