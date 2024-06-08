package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreebiesPageObjectModel {
	
	WebDriver driver;
	
	//SignIn 
	    By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
		By login = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]");
		By emailf = By.xpath("//input[@placeholder='Email Address']");
		By login1 = By.xpath("//span[contains(text(),'Log in')]");
		By newpass = By.xpath("//input[@name='password']");
		By login3 = By.xpath("//span[contains(text(),'Log in')]");
		By child  = By.xpath("//a[@class='cat3NonAct']");
		By edit = By.xpath("//div[@class='all_children_close editInfoUpr 13']//a");
		By calender = By.xpath("(//input[@aria-invalid='false'])[2]");
		By mnthdate = By.xpath("//span[@class='MuiButton-label']//h4");
		By next = By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']//span)[3]");
		By month = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']");
		By date = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendar-transitionContainer']//div//div//div");
		By ok = By.xpath("//span[contains(text(),'OK')]");
		
		
		
		
		
		
		public FreebiesPageObjectModel(WebDriver driver2)   {
			
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
		   
		    
		   public WebElement clickchild()  {
				
				return driver.findElement(child);
			} 
		   
		    
		   public WebElement clickedit()  {
				
				return driver.findElement(edit);
			} 
		   
		   
		   public WebElement clickcalender()  {
				
				return driver.findElement(calender);
			} 
		   
		   
		   public WebElement clickmnthdate()  {
				
				return driver.findElement(mnthdate);
			} 
		   
		   
		   public WebElement clicknext()  {
				
				return driver.findElement(next);
			} 
		   
		   
		   public WebElement matchmonth()  {
				
				return driver.findElement(month);
			} 
		   
		   
		   public List<WebElement> selectdate ()  {
			   
			   return driver.findElements(date);
		   }
		   
		   
		   public WebElement clickok()  {
				
				return driver.findElement(ok);
			}  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

}
