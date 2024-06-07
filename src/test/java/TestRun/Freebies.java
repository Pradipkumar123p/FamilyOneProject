package TestRun;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.FamilypageobjectModel;
import Resources.BaseClass;
import Resources.ConstantMethod;

public class Freebies extends  BaseClass   {
	
	
	@Test
	void Verifyfreebies() throws InterruptedException  {
		
		  FamilypageobjectModel obj = new FamilypageobjectModel(driver);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			obj.signuplogin().click();
			Thread.sleep(1000);
			obj.clicklogin().click();
			Thread.sleep(1000);
			obj.enteremailf().sendKeys(ConstantMethod.validemail);
			Thread.sleep(1000);
			obj.clicklogin1().click();
			Thread.sleep(1000);
			obj.enternewpass().sendKeys(ConstantMethod.newpassword);
			Thread.sleep(1000);
			obj.clicklogin3().click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	

}
