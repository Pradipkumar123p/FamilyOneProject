package ListenerPackage;

import java.awt.event.ItemListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Resources.BaseClass;
import Resources.ExtendManager;

public class ListenerClass extends ExtendManager implements ITestListener{
	
	 public void onTestStart(ITestResult result) {
	     test=exent.createTest(result.getName());
	    
	   }
	public void onTestSuccess(ITestResult result) {
		
	if(result.getStatus() == ITestResult.SUCCESS);
	
	     test.log(Status.PASS, "Test case passed is - " + result.getName());
	   }
	public void onTestFailure(ITestResult result) {
		
	  if (result.getStatus() == ITestResult.FAILURE) {

	       test.log(Status.FAIL, "Test CASE Failed is - " + result.getName()); 

	       test.log(Status.FAIL, "Test CASE Failed is - " + result.getThrowable()); 

	       String screenshotPath = "";  
	    
	        try {
	        	
	          screenshotPath = BaseClass.getScreenshot(BaseClass.driver, screenshotPath);
	          
	          test.addScreenCaptureFromPath(screenshotPath);
	          
	        } 
	        catch (Exception e) {
	        
	          e.printStackTrace();
	        }
	     }
	  }
	
	public void onTestSkipped(ITestResult result) {
		
	if (result.getStatus() == ITestResult.SKIP) {
		
	     test.log(Status.SKIP, "test case skipped is - " + result.getName());
	     
	    }

	 }
	

}
