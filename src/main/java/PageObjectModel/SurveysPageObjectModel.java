package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveysPageObjectModel {
	
	WebDriver driver;
	
	By click = By.xpath("");
	
	
	
	
	
	
	

	public SurveysPageObjectModel(WebDriver driver2) {
	
		this.driver = driver2;
	}
	
	 
	public WebElement clickthis()   {
		
		return driver.findElement(click);
	}
	
	
	
	

}
