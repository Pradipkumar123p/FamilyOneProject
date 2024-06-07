package Resources;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void clickablepoint(WebElement a, WebDriver d) { 
		
		 WebElement c = a;
         JavascriptExecutor jse = (JavascriptExecutor) d;
		 jse.executeScript("arguments[0].click()", c);
		
		
	}

	
	public static void verifyassertion(String actual, String expected, String message)  {
		
		SoftAssert sa = new SoftAssert();
		
		String ac = "actual";
		String ex = "expected";
		
		sa.assertEquals(ac, ex, message);
		
		sa.assertAll();
		
	}
	
	
	
          public static void handleselection(List<WebElement> az,String idx, WebDriver d)  {
		
	          	List<WebElement> as=az;
		
	            for(WebElement v1:as)    {
		  
		  
                if(v1.getText().equalsIgnoreCase(idx))		{	
                	
                	  JavascriptExecutor jse = (JavascriptExecutor) d;
             		  jse.executeScript("arguments[0].click()", v1);
    	 
		    	      v1.click();
		    	      break;
		      }
	     }
		
	  }
	

	
       public static void handleselection1(List<WebElement> az,int idx)  {
    	   
    	   List<WebElement> aw = az;
		
		   for(int i=0;i<=aw.size()-1;i++)  {
			   
			 aw.get(i).click();
			 break;
		   }
	}  
	
	
	
       public static void handleselection3(List<WebElement> az,String idx, WebDriver d)  {
   		
         	List<WebElement> as=az;
	
           for(WebElement v1:as)    {
	  
	  
           if(v1.getText().equalsIgnoreCase(idx))		{	
	 
	    	      v1.click();
	    	      break;
	    	      
	      }
          
    }
	
 }
       
       
       
       
       
       
	
}
