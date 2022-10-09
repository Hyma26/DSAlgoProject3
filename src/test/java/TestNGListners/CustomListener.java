package TestNGListners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.dsalgo.qa.Base.TestBase;

public class CustomListener extends TestBase implements ITestListener 
{
	 @Override
	  public void onTestFailure(ITestResult result ) 
	 {
		 System.out.println("Failes Test");
		 failed();
		 
	    
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult result  ) {
	   
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult result) {
	    
	  }


}
