package TestRun;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjectModel;
import PageObjectModel.SignInByPasswordPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class SignInByPassword  extends BaseClass   {
	
	
	    @Test
	   void verifySignInByPassword() throws InterruptedException    {
		   
		   SignupPageObjectModel obj = new SignupPageObjectModel(driver);
		   SignInByPasswordPageObjectModel obj1 = new SignInByPasswordPageObjectModel(driver);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			

			obj.signuplogin().click();
			Thread.sleep(1000);
			obj.signup1().click();
			
			obj.firstname().sendKeys(ConstantMethod.firstname);
		    obj.lastname().sendKeys(ConstantMethod.lastname);
		    
		    obj.mailid().sendKeys(BaseClass.randomGmail());
		    
		    try {
		    	
		    	CommonMethod.verifyassertion(obj.errormessage().getText(), ConstantMethod.error, "please provide the valid email id");
		    }
		    catch (Exception e) {
			
		    	System.out.println("valid email");
			}
			
		    Thread.sleep(1000);
		    obj.continues().click();
		    
	//webDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
	   //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='call_link']//button//span)[1]")));
		    Thread.sleep(18000);
		    
		  	obj.activatebutton().click();
		
			CommonMethod.handleselection(obj.selectgender(), "Male",driver);
			
			Thread.sleep(1000);
			obj.housenb().click();
			obj.address().sendKeys("1");
			
			Thread.sleep(1000);
			CommonMethod.handleselection1(obj.addressfetch(), 5);
			
			obj.continue1().click();
			
			obj.parentclick().click();
	                                                                     //https://d2ugykmbq84odw.cloudfront.net/
			obj.clildclick().click();
			
			obj.entername().clear();
			obj.entername().sendKeys(ConstantMethod.firstname);
			
		    Thread.sleep(1000);
			CommonMethod.handleselection(obj.genderselect1(),"Boy",driver);
			
			CommonMethod.clickablepoint(obj.clickcalender(), driver);
			
		//	CommonMethod.handleselection(obj.selectyear(),"2024",driver);
			
	     //   CommonMethod.handleselection(obj.selectmonth(),"Jun",driver);
		 //   CommonMethod.clickablepoint(obj.selectmonth(),driver);
			
	     /*
	       driver.navigate().refresh();

	    try  {
	    	Thread.sleep(2000);
	    	CommonMethod.clickablepoint(driver.findElement(By.xpath("((//div[@class='MuiDialog-root']//div//div)[5]//div//div)[5]")), driver);
	    }
	    catch (Exception e) {
			
	    	Thread.sleep(5000);
	    	WebElement a = driver.findElement(By.xpath("((//div[@class='MuiDialog-root']//div//div)[5]//div//div)[5]"));
	    	
	    		Thread.sleep(2000);
	    		CommonMethod.clickablepoint(a, driver);
	    	
		}       
		
		  */
			
			
		//    CommonMethod.handleselection(obj.selectdate(), "5",driver);
			
		//	obj.clickok().click();
			
		//	obj.clickcontinue2().click();
			
			obj.clickcmonthdate().click();
			
			String monthname ="";
			
			while(!(monthname.equals("May 2023")))  {
				
				obj.clicknext().click();
				Thread.sleep(1000);
				obj.matchtitle();
				
				monthname = obj.matchtitle().getText();
				
			}
			
			
			CommonMethod.handleselection(obj.selectdate(), "7", driver);
			
			obj.clickok().click();
			
			obj.clickcontinue2().click();
			
			obj.clicknext1().click();
		   
		   obj1.clicksetting().click();
		   
		   obj1.clicksetting1().click();
		   
		   obj1.clickchangepassword().click();
		   
		   obj1.enternewpass().sendKeys(ConstantMethod.newpassword);
		   obj1.enterconfirmpassword().sendKeys(ConstantMethod.confirmpassword);
		   
		   obj1.clickcontinue3().click();
		   
		   obj1.clicklogout().click();
		   
		   Thread.sleep(1000);
		   obj.signuplogin().click();
			
		   obj1.clicklogin().click();
		   
		   obj1.enteremailf().sendKeys(ConstantMethod.validemail);
		   
		   obj1.clicklogin3().click();
		   
		   obj1.enternewpass().sendKeys(ConstantMethod.newpassword);
		   
		   obj1.clicklogin3().click();
		   
		   Thread.sleep(1000);
		   
		   try {
		   
		   obj1.handlepopup().click();
		   
		   }
		   catch (Exception e) {
			
			  System.out.println("popup is not present");
		}
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	
	
	
	
	
	
	

}
