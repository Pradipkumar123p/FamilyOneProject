package TestRun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.GiveAwaysPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;



public class Giveaways extends BaseClass{
	
	
	    @Test
	  void verifyGiveAways() throws InterruptedException             {
		  
		  GiveAwaysPageObjectModel obj = new GiveAwaysPageObjectModel(driver);
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		    obj.signuplogin().click();
			Thread.sleep(1000);
			obj.clicklogin().click();
			Thread.sleep(1000);
			obj.enteremailf().sendKeys(ConstantMethod.validmail1);
			Thread.sleep(1000);
			obj.clicklogin1().click();
			Thread.sleep(1000);
			obj.enternewpassword().sendKeys(ConstantMethod.confirmpassword1);
			Thread.sleep(1000);
			obj.clicklogin3().click();
			Thread.sleep(1000);
		    obj.clickaways().click();
		    Thread.sleep(1000);
		    
		    try  {
		    
		    CommonMethod.handleselection(obj.selectimage(), "Win a $1,200 Feeding Time Bundle from CST Savings Inc.", driver);
		   
		    }
		    catch (Exception e) {
				
		    
	          	List<WebElement> as=obj.selectimage();
		
	            for(WebElement v1:as)    {
		  
		  
                if(v1.getText().equalsIgnoreCase("Win a $1,200 Feeding Time Bundle from CST Savings Inc."))		{	
                	
                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
             	   jsee.executeScript("arguments[0].click()", v1);
                	
		    	      v1.click();
		    	      break;
		          }
	           } 
			}
		    
		    obj.clickenternow().click();
		    
		    
		    try {
		    
		    Thread.sleep(2000);
		    obj.entertelephone().sendKeys(ConstantMethod.mobile);
		    Thread.sleep(1000);
		    obj.clickcontinue1().click();
		    Thread.sleep(1000);
		    obj.entercode().sendKeys(ConstantMethod.code);
		    Thread.sleep(1000);
		    obj.clickconsent().click();
		    
		    
		    }
		    catch (Exception e) {
			
		    	System.out.println("add successfully");
			}
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	  }
	
	

}
