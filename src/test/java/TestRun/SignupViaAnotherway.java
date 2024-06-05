package TestRun;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;

import PageObjectModel.FamilypageobjectModel;
import Resources.BaseClass;
import Resources.CommonMethod;

public class SignupViaAnotherway extends BaseClass{
	
	   @Test
	  void Runsignup1()  {
		  
		  FamilypageobjectModel obj = new FamilypageobjectModel(driver);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  CommonMethod.clickablepoint(obj.slidebar(), driver);
	      
		  CommonMethod.clickablepoint(obj.imageclick(), driver);
	
          CommonMethod.clickablepoint(obj.imageclick1(), driver);
		
		  obj.signup2().click();
	  }
	
	
	
	

}
