package TestRun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import PageObjectModel.FamilypageobjectModel;
import Resources.BaseClass;
import Resources.ConstantMethod;

public class SignIn extends BaseClass{
	
	@Test
	void VerifysignIn() throws InterruptedException   {
		
        FamilypageobjectModel obj = new FamilypageobjectModel(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		obj.signuplogin().click();
		Thread.sleep(1000);
		obj.clicklogin().click();
		Thread.sleep(1000);
		obj.enteremailf().sendKeys(ConstantMethod.email1);
		Thread.sleep(1000);
		obj.clicklogin1().click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		
		driver.get("https://app.fastmail.com/");
		Thread.sleep(1000);
		obj.enteruser().sendKeys(ConstantMethod.username);
		obj.enterpassword().sendKeys(ConstantMethod.password);
		Thread.sleep(1000);
		obj.clickcheckbox().click();
		obj.clicklogin3().click();
		
	//	driver.navigate().refresh();
		
	List<WebElement> qs =	driver.findElements(By.tagName("a"));
	
	 for(int i=0;i<=qs.size()-1;i++)   {
		  
		 System.out.println("URL" + qs.get(i).getText());
	
		
	  }
	
	
		
		
	}
	
	

}
