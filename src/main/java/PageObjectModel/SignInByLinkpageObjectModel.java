package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInByLinkpageObjectModel {
	
	WebDriver driver;
	
	By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
	By login = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]");
	By emailf = By.xpath("//input[@placeholder='Email Address']");
	By login1 = By.xpath("//span[contains(text(),'Log in')]");
	By username = By.xpath("//div[@class='v-TextInput-control']//input");
	By password = By.xpath("//input[@type='password']");
	By checkbox = By.xpath("//div[@class='v-Checkbox-icon']");
	By login3 = By.xpath("//span[contains(text(),'Log in')]");
//	By matching = By.xpath("//span[contains(text(),'🔑Login🔑 - family.one')]");
	By matching = By.xpath("//div[@class='v-MailboxItem-preview u-truncate']");
	By emailvalid = By.xpath("//span[@title='3junpp1@dev.familyone.io']");
	By emailvalid1 = By.xpath("//h2[contains(text(),'familyone.io')]");
	By emaillogin = By.xpath("//a[contains(text(),'Login')]");
	
	
	
	 public SignInByLinkpageObjectModel(WebDriver driver2)   {
		 
		 this.driver = driver2;
	 }
	
	
	
	
	
	 public WebElement signuplogin()  {
			
			return driver.findElement(sign);
		}
	
	
	 public WebElement clicklogin()  {
			
			return driver.findElement(login);
		}
	   
	   
	   public WebElement enteremailf()  {
			
	 		return driver.findElement(emailf);
	 	}
	   
	   
	   public WebElement clicklogin1()  {
			
			return driver.findElement(login1);
		}
	   
	   public WebElement enteruser()  {
			
			return driver.findElement(username);
		}
	   
	   
	   
	   public WebElement enterpassword()  {
			
			return driver.findElement(password);
		}
	   
	   
	   public WebElement clickcheckbox()  {
			
			return driver.findElement(checkbox);
		}
	   
	   public WebElement clicklogin3()   {
		   
		   
		   return driver.findElement(login3);
	   }
	   
	   
	   
	   public List<WebElement> clickmatching ()  {
		   
		   return driver.findElements(matching);
	   }
	   
	   
	   public WebElement emailvalidation()  {
			
			return driver.findElement(emailvalid);
		}
	   
	   
	   public WebElement emailvalidation1()  {
			
			return driver.findElement(emailvalid1);
		}
	   
	   
	   public WebElement clickemaillogin()   {
		   
		   
		   return driver.findElement(emaillogin);
	   }
	   
	   
	
	
	
	

}
