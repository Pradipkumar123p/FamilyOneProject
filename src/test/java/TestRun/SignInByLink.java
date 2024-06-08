package TestRun;

import java.time.Duration;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjectModel;
import PageObjectModel.SignInByLinkpageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class SignInByLink extends BaseClass{
	
	@Test
	void VerifysignIn() throws InterruptedException   {
		
		SignInByLinkpageObjectModel obj = new SignInByLinkpageObjectModel(driver);
		
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
		
		byte[] decode = Base64.getDecoder().decode(new String("dGVzdGluZ0BkZXYuZmFtaWx5b25lLmlv"));
		obj.enteruser().sendKeys(new String(decode));
		
		byte[] decode1 = Base64.getDecoder().decode(new String("NnJkNnJ4cjk="));
		obj.enterpassword().sendKeys(new String(decode1));
		
		Thread.sleep(1000);
		obj.clickcheckbox().click();
		obj.clicklogin3().click();

		try {
		
		 Thread.sleep(20000);
	     CommonMethod.handleselection3(obj.clickmatching(), ConstantMethod.matching, driver);
	     
		}
		catch (Exception e) {
			
     
          	List<WebElement> as= obj.clickmatching();
	
            for(WebElement v1:as)    {
	  
            	Thread.sleep(15000);
            if(v1.getText().equalsIgnoreCase(ConstantMethod.matching))		{	
            	
           // 	  JavascriptExecutor jse = (JavascriptExecutor) driver;
         	//	  jse.executeScript("arguments[0].click()", v1);
	 
         		 Thread.sleep(4000);
	    	      v1.click();
	    	      break;
	    	      
	            }
            
            }                
	    }
		
	      Thread.sleep(2000);
		  if(obj.emailvalidation().getText().equalsIgnoreCase("3junpp1@dev.familyone.io")) {
		    	   
		  obj.emailvalidation().click();
		  
		    }
		    else {
		    	
		     Thread.sleep(2000);
		     driver.navigate().back();
		     
		    }
		  
		   Thread.sleep(2000);
		   obj.emailvalidation1().click();
		  
		    Thread.sleep(1000);
		    WebElement we =  obj.clickemaillogin();
		    
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].scrollIntoView(true);", we);
		
		    obj.clickemaillogin().click();
		
		    Thread.sleep(3000);
		
	}
	
	

}
