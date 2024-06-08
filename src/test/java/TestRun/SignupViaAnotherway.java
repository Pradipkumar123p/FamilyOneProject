package TestRun;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class SignupViaAnotherway extends BaseClass{
	
	   @Test
	  void Runsignup1() throws InterruptedException  {
		  
		  SignupPageObjectModel obj = new SignupPageObjectModel(driver);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  CommonMethod.clickablepoint(obj.slidebar(), driver);
	      
		  CommonMethod.clickablepoint(obj.imageclick(), driver);
	
          CommonMethod.clickablepoint(obj.imageclick1(), driver);
		
		  obj.signup2().click();
		  obj.firstname().sendKeys(BaseClass.randomFirstName());
		  obj.lastname().sendKeys(BaseClass.randomLastName());
		    
		    obj.mailid().sendKeys(BaseClass.randomGmail());
		    
		    try {
		    	
		    	CommonMethod.verifyassertion(obj.errormessage().getText(), ConstantMethod.error, "please provide the valid email id");
		    }
		    catch (Exception e) {
			
		    	System.out.println("valid email");
			}
			
		    Thread.sleep(1000);
		    obj.continues().click();
		    
	
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
			
			obj.clildclick().click();
			
			obj.entername().clear();
			obj.entername().sendKeys(ConstantMethod.firstname);
			
		    Thread.sleep(1000);
			CommonMethod.handleselection(obj.genderselect1(),"Boy",driver);
			
			CommonMethod.clickablepoint(obj.clickcalender(), driver);
		
			
			obj.clickcmonthdate().click();
			
			String monthname ="";
			
			while(!(monthname.equals("May 2023")))  {
				
				obj.clicknext().click();
				Thread.sleep(500);
				obj.matchtitle();
				
				monthname = obj.matchtitle().getText();
				
			}
			
			
			CommonMethod.handleselection(obj.selectdate(), "7", driver);
			
			obj.clickok().click();
			
			obj.clickcontinue2().click();
			
			obj.clickcplus().click();
			
			obj.clickexpect().click();
			
			obj.entername2().clear();
			obj.entername2().sendKeys(ConstantMethod.name1);
			Thread.sleep(1000);
			CommonMethod.handleselection(obj.selectgender2(), "Boy", driver);
			Thread.sleep(1000);
			CommonMethod.clickablepoint(obj.clickcanlender1(), driver);
			Thread.sleep(1000);
			obj.clickcmonthdate().click();   
			
	        String monthname1 ="";
			
			while(!(monthname1.equals("September 2024")))  {
				
				obj.clicknext2().click();
				Thread.sleep(1000);
				obj.matchtitle1();
				
				monthname1 = obj.matchtitle1().getText();
				
			}
			
			CommonMethod.handleselection(obj.selectdate(), "8", driver);
			
			obj.clickok().click();
			
			obj.clickcontinue2().click();
			
			obj.clicknext1().click();
			
		  
		  
		  
	  }
	
	
	
	

}
