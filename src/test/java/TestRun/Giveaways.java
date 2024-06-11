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
		    
		    Thread.sleep(2000);
		    obj.entertelephone().sendKeys(ConstantMethod.mobile);
		    Thread.sleep(2000);
		    
		    WebElement  we  =  obj.clickcontinue1();
		     
		    JavascriptExecutor jse = (JavascriptExecutor) driver;
   		    jse.executeScript("arguments[0].click()", we);
		    Thread.sleep(2000);
		    
		    try {
		    
	        obj.entercode().sendKeys(testSendingRequestBody());
		    Thread.sleep(1000);
		    obj.clickconsent().click();
		    
		    }
		    catch (Exception e) {
			
		    	System.out.println("add successfully");
			} 
		    
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
	    	  
	    	  resq.body("{\"action\":\"get_verify_code\",\"phone_number\":\"(982)624-2978\",\"sub_id\":\"3547b2aa-113f-48ec-be0e-d1a686b01728\",\"phone_verification_auth\":\"7eba828e811d76dfa393226ba23ffe43\"}");
	     
	          Response apiresq = resq.post("https://yobpenou45.execute-api.us-east-1.amazonaws.com/dev/developerAutomationPhonenumber");
		  
	          String responsebody =  apiresq.body().asString();
	          
	          System.out.println(responsebody);
	          
	          String store = responsebody.substring(65, 71);
	          
			  int otp = Integer.parseInt(store);
			   
			  System.out.println(otp);
	          
			  return store;
	          
	    }
	
	
	
	}
	
	


