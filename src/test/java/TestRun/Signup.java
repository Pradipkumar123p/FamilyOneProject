package TestRun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.FamilypageobjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class Signup extends BaseClass{
	
	@Test(invocationCount = 1)
	void Runsignup() throws InterruptedException   {
		
		FamilypageobjectModel obj = new FamilypageobjectModel(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(10000);
		obj.signup().click();
		Thread.sleep(10000);
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
		
	    Thread.sleep(10000);
	    obj.continues().click();
	    
//webDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
   //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='call_link']//button//span)[1]")));
	    Thread.sleep(18000);
	    
	  	obj.activatebutton().click();
	
		CommonMethod.handleselection(obj.selectgender(), "Male",driver);
		
		Thread.sleep(10000);
		obj.housenb().click();
		obj.address().sendKeys("1");
		
		Thread.sleep(10000);
		CommonMethod.handleselection1(obj.addressfetch(), 5);
		
		obj.continue1().click();
		
		obj.parentclick().click();
		
		obj.clildclick().click();
		
		obj.entername().clear();
		obj.entername().sendKeys(ConstantMethod.firstname);
		
	    Thread.sleep(2000);
		CommonMethod.handleselection(obj.genderselect1(),"Boy",driver);
		
		CommonMethod.clickablepoint(obj.clickcalender(), driver);
		
		CommonMethod.handleselection(obj.selectyear(),"2024",driver);
		
        CommonMethod.handleselection(obj.selectmonth(),"Jun",driver);
	//ommonMethod.clickablepoint(obj.selectmonth(),driver);

     driver.navigate().refresh();

    try  {
    	
    	CommonMethod.handleselection(obj.selectmonth(),"Jun",driver);
    }
    catch (Exception e) {
		
    	System.out.println("success");
	}
		
		
	    CommonMethod.handleselection(obj.selectdate(), "5",driver);
		
		obj.clickok().click();
		
		obj.clickcontinue2().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



	/* @DataProvider
     Object[][]   email()  {
		
	 Object[][] data = new Object[2][2];
	 
	 data[0][0]  = ConstantMethod.email1;
	 data[1][0]  = ConstantMethod.email2;
	
	 
		
		return data;
	
		
		
	}    */
	
	
	
	
	
}
