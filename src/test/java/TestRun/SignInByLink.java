package TestRun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import PageObjectModel.FamilypageobjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class SignInByLink extends BaseClass{
	
	@Test
	void VerifysignIn() throws InterruptedException   {
		
        FamilypageobjectModel obj = new FamilypageobjectModel(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		obj.signuplogin().click();
		Thread.sleep(1000);
		obj.clicklogin().click();
		Thread.sleep(1000);
		obj.enteremailf().sendKeys(ConstantMethod.email1);
		Thread.sleep(1000);
		obj.clicklogin1().click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		
		driver.get("https://app.fastmail.com/");
		Thread.sleep(1000);
		obj.enteruser().sendKeys(ConstantMethod.username);
		obj.enterpassword().sendKeys(ConstantMethod.password);
		Thread.sleep(1000);
		obj.clickcheckbox().click();
		obj.clicklogin3().click();

		try {
		
		 Thread.sleep(10000);
	     CommonMethod.handleselection(obj.clickmatching(), "🔑Login🔑 - family.one", driver);
	     
		}
		catch (Exception e) {
			
     
          	List<WebElement> as= obj.clickmatching();
	
            for(WebElement v1:as)    {
	  
            	Thread.sleep(10000);
            if(v1.getText().equalsIgnoreCase("🔑Login🔑 - family.one"))		{	
            	
            	  JavascriptExecutor jse = (JavascriptExecutor) driver;
         		  jse.executeScript("arguments[0].click()", v1);
	 
         		 Thread.sleep(8000);
	    	      v1.click();
	    	      break;
	            }
            }                
	    }
		
	      Thread.sleep(8000);
		  if(obj.emailvalidation().getText().equalsIgnoreCase("3junpp1@dev.familyone.io")) {
		    	   
		  obj.emailvalidation().click();
		  
		    }
		    else {
		    	     
		     System.out.println("Unable to match email address");
		     
		    }
		  
		   Thread.sleep(3000);
		   obj.emailvalidation1().click();
		  
		    Thread.sleep(5000);
	//	    WebElement we =  obj.clickemaillogin();
		    
	//	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	    executor.executeScript("arguments[0].scrollIntoView(true);", we);
		
		    obj.clickemaillogin().click();
		
		    Thread.sleep(5000);
		
	}
	
	

}
