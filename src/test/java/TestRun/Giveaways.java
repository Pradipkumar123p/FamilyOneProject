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
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Giveaways extends BaseClass{
	
	
	    @Test(priority = 1)
	  void verifyGiveAways() throws InterruptedException             {
		  
		  GiveAwaysPageObjectModel obj = new GiveAwaysPageObjectModel(driver);
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		    obj.signuplogin().click();
			Thread.sleep(1000);
			obj.clicklogin().click();
			Thread.sleep(1000);
			obj.enteremailf().sendKeys(ConstantMethod.validemail1);
			Thread.sleep(1000);
			obj.clicklogin1().click();
			Thread.sleep(1000);
			obj.enternewpassword().sendKeys(ConstantMethod.confirmpassword1);
			Thread.sleep(1000);
			obj.clicklogin3().click();
			Thread.sleep(1000);
			
		    WebElement wel = obj.clickaways();
			
			JavascriptExecutor jseet = (JavascriptExecutor) driver;
      	    jseet.executeScript("arguments[0].click()", wel);	
      	    Thread.sleep(1000);
		    
		    try  {
		    
		    CommonMethod.handleselection(obj.selectimage(), "Win a $500 Registry from family.one", driver);
		   
		    }
		    catch (Exception e) {
				
		    
	          	List<WebElement> as=obj.selectimage();
		
	            for(WebElement v1:as)    {
		  
                if(v1.getText().equalsIgnoreCase("Win a $500 Registry from family.one"))		{	
                	
                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
             	   jsee.executeScript("arguments[0].click()", v1);
                	
		    	      v1.click();
		    	      break;
		          }
	           } 
			}
		    
		    obj.clickenternow().click();
		    
		    try   {
		    
		    Thread.sleep(2000);
		    obj.entertelephone().sendKeys(ConstantMethod.mobile);
		    Thread.sleep(2000);
		    
		    WebElement  we  =  obj.clickcontinue1();
		     
		    JavascriptExecutor jse = (JavascriptExecutor) driver;
   		    jse.executeScript("arguments[0].click()", we);
		    Thread.sleep(4000);
		    
	        obj.entercode().sendKeys(testSendingRequestBody());
		    Thread.sleep(1000);
		    
		    obj.clickconsent().click();
		    
		    }
		    catch (Exception e) {
			
		    	System.out.println("Verification Code Not Found");
			} 
		    
		    Thread.sleep(1000);
		    obj.clickfirst().click();
		    
		    Thread.sleep(1000);
		    obj.clickaways().click();
		    
		    try {
		    	
		    Thread.sleep(1000);
		    CommonMethod.handleselection(obj.selectimage(), "Win a $500 musical bundle from CST Savings Inc.", driver);
		    
		    }
		    catch (Exception e) {
				
		     	List<WebElement> as=obj.selectimage();
				
	            for(WebElement v1:as)    {
		  
		  
                if(v1.getText().equalsIgnoreCase("Win a $500 musical bundle from CST Savings Inc."))		{	
                	
                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
             	   jsee.executeScript("arguments[0].click()", v1);
                	
		    	      v1.click();
		    	      break;
		          }
	           } 
			}
		    
		    Thread.sleep(1000);
		    obj.clickenternow().click();
		    
		    Thread.sleep(1000);
		    obj.clickfirst().click();
		    
		    Thread.sleep(1000);
		    obj.clickaways().click();
		    
		    try {
		    	
			    Thread.sleep(1000);
			    CommonMethod.handleselection(obj.selectimage(), "Win a $5,000 RESP from CST Savings Inc.", driver);
			    
			    }
			    catch (Exception e) {
					
			     	List<WebElement> as=obj.selectimage();
					
		            for(WebElement v1:as)    {
			  
			  
	                if(v1.getText().equalsIgnoreCase("Win a $5,000 RESP from CST Savings Inc."))		{	
	                	
	                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
	             	   jsee.executeScript("arguments[0].click()", v1);
	                	
			    	      v1.click();
			    	      break;
			          }
		           } 
				}
		    
		    
		    Thread.sleep(1000);
		    obj.clickenternow().click();
		    
		    Thread.sleep(1000);
		    obj.clickfirst().click();
		    
		    Thread.sleep(1000);
		    obj.clickaways().click();
		    
		    try {
		    	
			    Thread.sleep(1000);
			    CommonMethod.handleselection(obj.selectimage(), "Win a $2500 Must-have bundle from CST Savings Inc.", driver);
			    
			    }
			    catch (Exception e) {
					
			     	List<WebElement> as=obj.selectimage();
					
		            for(WebElement v1:as)    {
			  
			  
	                if(v1.getText().equalsIgnoreCase("Win a $2500 Must-have bundle from CST Savings Inc."))		{	
	                	
	                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
	             	   jsee.executeScript("arguments[0].click()", v1);
	                	
			    	      v1.click();
			    	      break;
			          }
		           } 
				}
		    
		    Thread.sleep(1000);
		    obj.clickenternow().click();
	  }
	    
	      
	    
	    
	    @Test(priority = 2)
	static String  testSendingRequestBody() {
	     
	/*    HashMap data = new HashMap();
	    
	    data.put("phone_number","(982)624-2978");
	    data.put("sub_id", "b279eb25-e6fe-4fb0-a4c1-799835d49929");
	    data.put("phone_verification_auth", "7eba828e811d76dfa393226ba23ffe43");
	    data.put("action", "get_verify_code");
	    */
	    	  
	    	  
	    	  RequestSpecification resq = RestAssured.given();
	    	  
	    	  resq.header("Content-Type", "application/json");
	    	  
	    	  resq.body("{\"action\":\"get_verify_code\",\"phone_number\":\"(982)624-2978\",\"sub_id\":\"eb3ba37e-a29e-42e4-9ac2-0b349a9db638\",\"phone_verification_auth\":\"33228d4bc5fb4a76851672e0af2214cb\"}");
	     
	          Response apiresq = resq.post("https://xwsbwrc070.execute-api.us-east-1.amazonaws.com/prod/developerAutomationPhonenumber");                                               //"https://yobpenou45.execute-api.us-east-1.amazonaws.com/dev/developerAutomationPhonenumber");
		  
	          String responsebody =  apiresq.body().asString();
	          
	          System.out.println(responsebody);
	          
	          String store = responsebody.substring(168, 174);
	          
			  int otp = Integer.parseInt(store);
			   
			  System.out.println(store);
	          
			  return store;
	          
	    }
	
	
	
	}
	
	


