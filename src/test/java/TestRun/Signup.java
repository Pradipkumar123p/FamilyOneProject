package TestRun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class Signup extends BaseClass{
	
	@Test(invocationCount = 1)
	void Verifysignup() throws InterruptedException   {
		
		SignupPageObjectModel obj = new SignupPageObjectModel(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
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



	/* @DataProvider
     Object[][]   email()  {
		
	 Object[][] data = new Object[2][2];
	 
	 data[0][0]  = ConstantMethod.email1;
	 data[1][0]  = ConstantMethod.email2;
	
	 
		
		return data;
	
		
		
	}    */
	
	
	
	
	
}
