package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	 public static WebDriver driver;
	public  Properties p;
	
	   static int a=0;
	
	 public  void Initilize() throws IOException  {
		   
		   FileInputStream file = new FileInputStream("C:\\Users\\nizam\\eclipse-workspace\\FamilyOneProject\\src\\main\\java\\data.properties");
		   
		   p = new Properties();
		   
		   p.load(file);
		   
		  String name =  p.getProperty("browser");
		  
		  if(name.equalsIgnoreCase("chrome")) {
		  
		   System.setProperty("webdriver.driver.chrome", "C:\\Users\\nizam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   
		   ChromeOptions op = new ChromeOptions();
		   
		   op.addArguments("--remote-allow-origins=*");
		   op.setBinary("C:\\Users\\nizam\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		   
		   driver = new ChromeDriver(op);
		   
		   
		  }   
		  
		  else if(name.equalsIgnoreCase("firefox"))   {
			  
			  driver = new FirefoxDriver();
		  }
		  
		  else if (name.equalsIgnoreCase("edge"))  {
			  
			  driver = new EdgeDriver();
		  }
		 
		  else {
			  
			  System.out.println("please check the browser name");
		  }
		     
	   }
	
	 
	 @BeforeSuite
	 public void beforesuite()  {
		 
		 ExtendManager.setup();
	 }
	 
	 
	 
       
	  @BeforeMethod
	 public void openURL() throws IOException  {
		   
		   Initilize();
		   
		   String name1 = p.getProperty("URL");
		   
		   driver.get(name1);
	   }
	   
	   
	  @AfterMethod
		public void teardown(ITestResult result) throws IOException{
			
			driver.manage().window().maximize();
		//  driver.close();
	   
	  }
	  
	  
	  
	  @AfterSuite
	  public void aftersuite()  {
			 
			 ExtendManager.endreport();
		 }
	  
	  
	  
	  
	  
	  public static String randomGmail() {
		  
			String generatestring = RandomStringUtils.randomAlphanumeric(4);
				 
			String Gmail = BaseClass.Getcurrenttime() + generatestring + a + "@dev.familyone.io";
				 a++;
			 
				 System.out.println(Gmail);
		  
		     return Gmail ;
	     }
	  
	  
	  
         public static String Getcurrenttime()  {
		  
		  String currentdate=new SimpleDateFormat("dd-MM").format(new Date());
		  
		  return currentdate;
		  
		  
		  
	  }
	
	  
         
         public static String getScreenshot(WebDriver driver, String screenshotname) throws IOException {
 			
 			String dateformate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
 			
 			TakesScreenshot ts= (TakesScreenshot) driver;
 			
 			File source = ts.getScreenshotAs(OutputType.FILE);
 			
 			String destination = System.getProperty("user.dir") + "/FailTestStatus/" + screenshotname + dateformate + ".png";
 			
 			File finalDestination = new File(destination);
 			 
 			FileUtils.copyFile(source, finalDestination);
 			   
 			return destination;
 		}
	  
	  

         public static String Getcurrenttime1()  {
		  
		  String currentdate1=new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		  
		  return currentdate1;
		  
         }
         
  }
