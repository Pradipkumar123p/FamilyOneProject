package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FamilypageobjectModel {
	
  protected WebDriver driver;
	
	By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
	By sign1 = By.xpath("//span[normalize-space()='Sign Up']");
	By first  = By.xpath("//input[@placeholder='First Name']");
	By last = By.xpath("//input[@placeholder='Last Name']");
	By email = By.xpath("//input[@placeholder='Email']");
	By conti = By.xpath("//span[@class='MuiButton-label']");
	By error = By.xpath("//p[@class='error_message']");
	By activate = By.xpath("(//div[@class='call_link']//button//span)[1]");
	By gender = By.xpath("//div[@class='signup_gender']//button");
	By house = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary']//span");
	By add = By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//input");
	By add1 = By.xpath("//div[@class='address_parent_section']//div");
	By conti1 = By.xpath("//span[contains(text(),'Continue')]");
	By parent = By.xpath("//span[contains(text(),'I’m a Parent or Expecting')]");
	By child = By.xpath("//div[@class='unchild_rght expctChildLast']//label");
	By name1 = By.xpath("//input[@placeholder='Name']");
	By gender1 = By.xpath("//div[@class='addchild_gender']//button//span");
	By calender = By.xpath("(//input[@aria-invalid='false'])[2]");
	By mnthdate = By.xpath("//span[@class='MuiButton-label']//h4");
	By next = By.xpath("(//span[@class='MuiIconButton-label'])[1]");
	By title = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']//p");
	By date = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendar-transitionContainer']//div//div//div");
	By ok = By.xpath("//span[contains(text(),'OK')]");
	By continue1 = By.xpath("//span[contains(text(),'Continue')]");
	By plus = By.xpath("//a[@class='cstmChild']//div");
	By expect = By.xpath("//div[@class='unchild_rght expct_child']");
	By name2 = By.xpath("//input[@placeholder='Name']");
	By gender2 = By.xpath("//div[@class='addchild_gender']//button");
	By calender1 = By.xpath("(//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//input)[2]");
	By next2 = By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton'])[2]");
	By title1 = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']//p");	
	
	By next1 = By.xpath("//span[contains(text(),'Next')]");
	
	
	
	By slide = By.xpath("(//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets']//span)[3]");
	By image = By.xpath("(//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[@class='program_slides slides 4680']//img)[1]");
	By image1 = By.xpath("//div[@class='session_hendupr']");
	By sign2 = By.xpath("//span[contains(text(),'Sign Up')]");
	
	
	
	public FamilypageobjectModel(WebDriver driver2) {
		
		this.driver = driver2;
	}


     



	public WebElement signup()  {
		
		return driver.findElement(sign);
	}
	
    public WebElement signup1()  {
		
		return driver.findElement(sign1);
	}
	
     
   public WebElement firstname()  {
		
		return driver.findElement(first);
	}
	
    
    
   public WebElement lastname()  {
		
		return driver.findElement(last);
	}
   
   
   
   public WebElement mailid()  {
		
		return driver.findElement(email);
	}
  

   public WebElement continues()  {
		
		return driver.findElement(conti);
	}
   
   
   
   public WebElement errormessage()  {
		
		return driver.findElement(error);
	}
   
   
   public WebElement activatebutton()  {
		
		return driver.findElement(activate);
	}
  
     
   public List<WebElement> selectgender ()  {
	   
	   return driver.findElements(gender);
   }
   
   
   public WebElement housenb()  {
		
		return driver.findElement(house);
	}
   
   
   public WebElement address()  {
		
		return driver.findElement(add);
	}
   
   
   public List<WebElement> addressfetch ()  {
	   
	   return driver.findElements(add1);
   }
   
   
   public WebElement continue1()  {
		
 		return driver.findElement(conti1);
 	}
   
   
   public WebElement parentclick()  {
		
		return driver.findElement(parent);
	}
   
   
   public WebElement clildclick()  {
		
		return driver.findElement(child);
	}
   
   
   public WebElement entername()  {
		
		return driver.findElement(name1);
	}
   
   
   public List<WebElement> genderselect1 ()  {
	   
	   return driver.findElements(gender1);
   }
   
   
   public WebElement clickcalender()  {
		
		return driver.findElement(calender);
	}
   
   
   public WebElement clickcmonthdate()  {
		
		return driver.findElement(mnthdate);
	}
   
   
   public WebElement clicknext()  {
		
		return driver.findElement(next);
	}
  
   
   public WebElement matchtitle()  {
		
		return driver.findElement(title);
	}
   
   
    public List<WebElement> selectdate ()  {
	   
	   return driver.findElements(date);
   }
   
   
   public WebElement clickok()  {
		
		return driver.findElement(ok);
	}
    
  
    public WebElement clickcontinue2()  {
		
		return driver.findElement(continue1);
	}
    
    public WebElement clickcplus()  {
		
 		return driver.findElement(plus);
 	}
    
    
   public WebElement entername2()  {
		
		return driver.findElement(name2);
	}
   
   
   public WebElement clickexpect()  {
		
 		return driver.findElement(expect);
 	}
   
   
   public List<WebElement> selectgender2 ()  {
	   
	   return driver.findElements(gender2);
   }
     
   
   public WebElement clickcanlender1()  {
		
 		return driver.findElement(calender1);
 	}
    
   public WebElement clicknext2()  {
		
		return driver.findElement(next2);
	}
   
   
   public WebElement matchtitle1()  {
		
		return driver.findElement(title1);
	}
   
  
  
   public WebElement clicknext1()  {
		
		return driver.findElement(next1);
	}
  
  
   
   
	
    
    
   public WebElement slidebar()  {
		
		return driver.findElement(slide);
	}
	
    
   public WebElement imageclick()  {
		
		return driver.findElement(image);
	}
	
   public WebElement imageclick1()  {
		
		return driver.findElement(image1);
	}
	
   
   public WebElement signup2()  {
		
		return driver.findElement(sign2);
	}
	
   
   
   
   
   
}
