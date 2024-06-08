package TestRun;

import java.time.Duration;

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
			obj.enteremailf().sendKeys(ConstantMethod.validemail);
			Thread.sleep(1000);
			obj.clicklogin1().click();
			Thread.sleep(1000);
			obj.enternewpassword().sendKeys(ConstantMethod.newpassword);
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
			
			String title = "";
			while(!(title.equals("September 2024")))  {
				Thread.sleep(1000);
				CommonMethod.clickablepoint(obj.clicknext(), driver);
				Thread.sleep(1000);
			    obj.matchmonth();
			    Thread.sleep(1000);
				title = obj.matchmonth().getText();
			}
			Thread.sleep(1000);
			CommonMethod.handleselection(obj.selectdate(), "6", driver);
			Thread.sleep(1000);
			obj.clickok().click();
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	

}
