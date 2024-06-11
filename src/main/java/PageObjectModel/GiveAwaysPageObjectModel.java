package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiveAwaysPageObjectModel {
	
	
	WebDriver driver;
	
	
	        By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
			By login = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]");
			By emailf = By.xpath("//input[@placeholder='Email Address']");
			By login1 = By.xpath("//span[contains(text(),'Log in')]");
			By newpass = By.xpath("//input[@name='password']");
			By login3 = By.xpath("//span[contains(text(),'Log in')]");
			By giveaways = By.xpath("//div[@class='cmnTabPrgrm contestTabClr']//img");
			By images = By.xpath("//div[@class='freebies_iner program_title01 giveAwayWrapTxt ']//label");
	        By enternow = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text contest_enter_fixed  MuiButton-textPrimary']//span)[1]");
	        By telephone = By.xpath("//input[@type='tel']");
	        By continue1 = By.xpath("(//button[@class='MuiButto;nBase-root MuiButton-root MuiButton-text MuiButton-textPrimary']//span)[1]");
	        By code = By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputHiddenLabel']");
	        By consent = By.xpath("//span[@class='MuiButton-label']");
	        
	        
	        
	        
			public GiveAwaysPageObjectModel(WebDriver driver2)   {
				
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
			   
			   public WebElement enternewpassword()  {
					
					return driver.findElement(newpass);
				}
			   
			   
			   public WebElement clicklogin3()   {
				   
				   
				   return driver.findElement(login3);
			   }
			   
			    
			   public WebElement clickaways()   {
				   
				   
				   return driver.findElement(giveaways);
			   }
	
	            
			   public List<WebElement> selectimage ()  {
				   
				   return driver.findElements(images);
			   }
	
			   
               public WebElement clickenternow()  {
				   
				   return driver.findElement(enternow);
			   }
			   
			   
               public WebElement entertelephone()  {
				   
				   return driver.findElement(telephone);
			   }
			   
			   
               public WebElement clickcontinue1()  {
				   
				   return driver.findElement(continue1);
			   }
			   
               
               public WebElement entercode()  {
				   
				   return driver.findElement(code);
			   }
               
               
               
               public WebElement clickconsent()  {
				   
				   return driver.findElement(consent);
			   }
			   

}
