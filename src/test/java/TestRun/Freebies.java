package TestRun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjectModel;
import PageObjectModel.FreebiesPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class Freebies extends  BaseClass   {
	
	
	@Test
	void Verifyfreebies() throws InterruptedException  {
		
		FreebiesPageObjectModel obj = new FreebiesPageObjectModel(driver);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			obj.signuplogin().click();
			Thread.sleep(1000);
			obj.clicklogin().click();
			Thread.sleep(1000);
			obj.enteremailf().sendKeys(ConstantMethod.validemail1);        //valid email
			Thread.sleep(1000);
			obj.clicklogin1().click();
			Thread.sleep(1000);
			obj.enternewpassword().sendKeys(ConstantMethod.confirmpassword1);    //new password
			Thread.sleep(1000);
			obj.clicklogin3().click();
			Thread.sleep(1000);
			obj.clickchild().click();
			Thread.sleep(1000);
			obj.clickedit().click();
			Thread.sleep(1000);
			obj.clickcalender().click();
			Thread.sleep(1000);
			obj.clickmnthdate().click();
			
			
			try  {
				
				System.out.println("Date is already mentioned");
				
			}
			
			catch (Exception e) {
				
				String title = "";
				while(!(title.equals("September 2024")))  {
					Thread.sleep(1500);
					CommonMethod.clickablepoint(obj.clicknext(), driver);
					Thread.sleep(1500);
				    obj.matchmonth();
				    Thread.sleep(1500);
					title = obj.matchmonth().getText();
				}
			}
		
			
			Thread.sleep(1000);
			CommonMethod.handleselection(obj.selectdate(), "6", driver);
			Thread.sleep(1000);
			obj.clickok().click();
			Thread.sleep(1000);
			obj.clickcontinue().click();
			
	//		obj.clickconformdate().click();
			Thread.sleep(1000);
			
			if(obj.verifychildname1().getText().equalsIgnoreCase("Child 1"))   {
			
				System.out.println("Added");
			
				}
			    else  {
				

					 WebElement we = obj.clickplus();
						
					    JavascriptExecutor jse = (JavascriptExecutor) driver;
			 		    jse.executeScript("arguments[0].click()", we);
					
						obj.clickaddchild().click();
						Thread.sleep(1000);
						obj.entername2().sendKeys(ConstantMethod.firstname);
						Thread.sleep(1000);
						CommonMethod.handleselection(obj.selectgender2(), "Girl", driver);
						Thread.sleep(1000);
						obj.clickcanlender1().click();
						Thread.sleep(1000);
						obj.clichmonthdate1().click();
							
							String title = "";
							while(!(title.equals("July 2023")))  {
								Thread.sleep(500);
							    CommonMethod.clickablepoint(obj.clickprevious(), driver);
								Thread.sleep(500);
							    obj.matchingmonth1();
							    Thread.sleep(500);
								title = obj.matchingmonth1().getText();
								
							}
							
							CommonMethod.handleselection(obj.selectdate1(), "8", driver);
							
							Thread.sleep(500); 
							obj.clickok().click();
							Thread.sleep(500);
							obj.clickcontinue().click();
							
			}
			
			if(obj.verifychildname3().getText().equalsIgnoreCase("Child 3Pradip"))  {
				
				System.out.println("added3");
			
			
				}
			
			    else  {
			

					Thread.sleep(500);
					obj.clickplus().click();
					obj.clickaddchild().click();
					Thread.sleep(500);
					obj.entername2().sendKeys(ConstantMethod.firstname);
					Thread.sleep(500);
					CommonMethod.handleselection(obj.selectgender2(), "Girl", driver);
					Thread.sleep(500);
					obj.clickcanlender1().click();
					Thread.sleep(500);
					obj.clichmonthdate1().click();
					
					String title = "";
					while(!(title.equals("April 2022")))  {
						Thread.sleep(500);
						obj.clickprevious().click();
						Thread.sleep(500);
					    obj.matchingmonth2();
					    Thread.sleep(500);
						title = obj.matchingmonth2().getText();
						
					}
					
					Thread.sleep(500);
					CommonMethod.handleselection(obj.selectdate1(), "2", driver);
					
					Thread.sleep(500);
					obj.clickok1().click();
					
					Thread.sleep(500);
					obj.clickcontinue().click();
				
			
			      
			
			    }
			
			
			  Thread.sleep(1000);
			  obj.clickfirst().click();
			
			  Thread.sleep(500);
			  obj.clickfreebies().click();
			  
			  
			  try {
				  
				  CommonMethod.handleselection(obj.selectimage(), "Enfamil A+® Welcome Package (Infant)", driver);
			  }
			  
			  catch (Exception e) {
				

		          	List<WebElement> as=obj.selectimage();
			
		            for(WebElement v1:as)    {
			  
			  
	                if(v1.getText().equalsIgnoreCase("Enfamil A+® Welcome Package (Infant)"))		{	
	                	
	                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
	             	   jsee.executeScript("arguments[0].click()", v1);
	                	
			    	      v1.click();
			    	      break;
			          }
	                  else {
	                	
	                	System.out.println("Not found");
	                }
		          } 
			   }
			  
			  if(obj.clickredeem().getText().equalsIgnoreCase("Redeem"))   {
				  
				  Thread.sleep(1000);
			      WebElement a = obj.clickredeem();
				  JavascriptExecutor jse = (JavascriptExecutor) driver;
       		      jse.executeScript("arguments[0].click()", a);
			  
			  }
			  else  {
				  
				    Thread.sleep(500);
				    System.out.println("Redeemed");
			  }
			  
	//		 
	//		  obj.clickfirst().click();
			 
			
			  Thread.sleep(1000);
			  obj.clickbacking().click();
			  
			  Thread.sleep(1500);
			  obj.clickfreebies().click();
			  

		      WebElement ad =	obj.clicksimilac();
		      JavascriptExecutor jsev = (JavascriptExecutor) driver;
     		  jsev.executeScript("arguments[0].click()", ad);
     		  
               
 			  if(obj.clickredeem().getText().equalsIgnoreCase("Redeem"))   {
 				  
 				  WebElement ab = obj.clickredeem();
				  JavascriptExecutor jse = (JavascriptExecutor) driver;
         		  jse.executeScript("arguments[0].click()", ab);
         		  
         		  
 			  }
 			  else  {
 				 
         		  Thread.sleep(500);
   			      System.out.println("Redeemed");
   			  
 			  }
   			  
 			  
 			  Thread.sleep(1000);
 			  obj.clickfirst().click();
 			 
 			  Thread.sleep(500);
 			  obj.clickfreebies().click();
			  
 			 
             try {
				  
            	  Thread.sleep(500);
				  CommonMethod.handleselection(obj.selectimage(), "Complete, Balanced Nutrition® for Kids", driver);
			    }
			  
			    catch (Exception e) {
				

		          	List<WebElement> as=obj.selectimage();
			
		            for(WebElement v1:as)    {
			  
			  
	                if(v1.getText().equalsIgnoreCase("Complete, Balanced Nutrition® for Kids"))		{	
	                	
	                   JavascriptExecutor jsee = (JavascriptExecutor) driver;
	             	   jsee.executeScript("arguments[0].click()", v1);
	                	
			    	      v1.click();
			    	      break;
			          }
		           } 
		    	}
			  
 			  
             if(obj.clickredeem().getText().equalsIgnoreCase("Redeem"))   {
				  
				  WebElement ab = obj.clickredeem();
				  JavascriptExecutor jse = (JavascriptExecutor) driver;
        		  jse.executeScript("arguments[0].click()", ab);  
        		  
			  }
			  else  {
				 
        		  Thread.sleep(500);
  			      System.out.println("Redeemed");
 			                                        
			  }
 			  
             Thread.sleep(500);
             obj.clickyes1().click();
             
             Thread.sleep(500);
             obj.clickyes2().click();  
             
             Thread.sleep(500);
             obj.clickyes3().click();
		
	}
	
	
  }
	


