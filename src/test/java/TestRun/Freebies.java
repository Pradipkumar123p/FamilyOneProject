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
			obj.clickplus().click();
			obj.clickaddchild().click();
			Thread.sleep(1000);
			obj.entername2().sendKeys(ConstantMethod.firstname);
			Thread.sleep(1000);
			CommonMethod.handleselection(obj.selectgender2(), "Girl", driver);
			Thread.sleep(1000);
			obj.clickcanlender1().click();
			Thread.sleep(1000);
			obj.clichmonthdate1().click();
			
			
			try {
				
				System.out.println("child2 add successfully");
			}
			
			catch (Exception e) {
				
				String title = "";
				while(!(title.equals("October 2023")))  {
					Thread.sleep(1000);
				CommonMethod.clickablepoint(obj.clickprevious(), driver);
					Thread.sleep(1000);
				    obj.matchingmonth1();
				    Thread.sleep(1000);
					title = obj.matchingmonth1().getText();
				}
			}
			
			
			
			
			
			String title = "";
			while(!(title.equals("December 2022")))  {
				Thread.sleep(500);
				obj.clickprevious().click();
				Thread.sleep(500);
			    obj.matchingmonth2();
			    Thread.sleep(500);
				title = obj.matchingmonth2().getText();
				break;
			}
			
			
		
			Thread.sleep(1000);
			CommonMethod.handleselection(obj.selectdate1(), "8", driver);
			
			
			
			Thread.sleep(1000);
			obj.clickok1().click();
			
			
			
			Thread.sleep(1000);
			obj.clickcontinue().click();
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	

}
