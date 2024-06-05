package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendManager {
	

	public static ExtentReports exent;   
	public static ExtentTest test;       
	public static ExtentSparkReporter htmlreporter;   
	
	
     public static void setup()  {
		
		htmlreporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/" +"Myreport_"+BaseClass.Getcurrenttime1()+".html");
		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("FamilyOne_Application Report");
		htmlreporter.config().setTheme(Theme.DARK);
		
		exent = new ExtentReports();
		exent.attachReporter(htmlreporter);
		exent.setSystemInfo("Local Host", "3030");
		exent.setSystemInfo("OS", "Window11");
		exent.setSystemInfo("Tester Name", "Pradip Kumar patel");
		
	  }
     
     
     public static void endreport()   {
 		
 		exent.flush();
 	}

	

}
