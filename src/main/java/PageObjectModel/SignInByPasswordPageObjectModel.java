package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInByPasswordPageObjectModel {
	
	WebDriver driver;
	
	By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
	By login = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]");
	By emailf = By.xpath("//input[@placeholder='Email Address']");
	By login1 = By.xpath("//span[contains(text(),'Log in')]");
	By login3 = By.xpath("//span[contains(text(),'Log in')]");
	By setting = By.xpath("(//div[@class='webMenu']//ul//li)[4]");
	By setting1 = By.xpath("(//div[@class='edit_contentLeft'])[2]");
	By changepass = By.xpath("(//div[@class='setng_contentLeft'])[2]");
	By newpass = By.xpath("//input[@name='password']");
	By conformpass = By.xpath("//input[@name='confirm_password']");
	By continue3 = By.xpath("//span[contains(text(),'Continue')]");
	By logout = By.xpath("//span[contains(text(),'Log Out')]");
	By popup = By.xpath("//div[@class='unknwnchild_content unknwnchild_contentNw']//img");
	
	
	  
	public SignInByPasswordPageObjectModel(WebDriver driver2)    {
		
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
	   
	   
       public WebElement clicklogin3()   {
		   
		   
		   return driver.findElement(login3);
	   }
	   
	
	
   public WebElement clicksetting()  {
		
		return driver.findElement(setting);
	}
   
   
   public WebElement clicksetting1()  {
		
		return driver.findElement(setting1);
	}
   
   
   public WebElement clickchangepassword()  {
		
		return driver.findElement(changepass);
	}
   
   
   
   public WebElement enternewpass()  {
		
		return driver.findElement(newpass);
	}
   
   
   public WebElement enterconfirmpassword()  {
		
		return driver.findElement(conformpass);
	}
   
   
   public WebElement clickcontinue3()  {
		
		return driver.findElement(continue3);
	}
   
   
   public WebElement clicklogout()  {
		
		return driver.findElement(logout);
	}
   
   
   public WebElement handlepopup()  {
		
		return driver.findElement(popup);
	}
   
   
	
	
	
	
	
	
	
	
	
	
}
