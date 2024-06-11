package TestRun;

import java.util.HashMap;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostHTTPMethod {
	
	       
	      @Test
	    void testSendingRequestBody() {
	     
	/*    HashMap data = new HashMap();
	    
	    data.put("phone_number","(982)624-2978");
	    data.put("sub_id", "b279eb25-e6fe-4fb0-a4c1-799835d49929");
	    data.put("phone_verification_auth", "7eba828e811d76dfa393226ba23ffe43");
	    data.put("action", "get_verify_code");
	    */
	    	  
	    	  
	    	  RequestSpecification resq = RestAssured.given();
	    	  
	    	  resq.header("Content-Type", "application/json");
	    	  
	    	  resq.body("{\"action\":\"get_verify_code\",\"phone_number\":\"(982)624-2978\",\"sub_id\":\"b279eb25-e6fe-4fb0-a4c1-799835d49929\",\"phone_verification_auth\":\"7eba828e811d76dfa393226ba23ffe43\"}");
	     
	          Response apiresq = resq.post("https://yobpenou45.execute-api.us-east-1.amazonaws.com/dev/developerAutomationPhonenumber");
		  
	          String responsebody =  apiresq.body().asString();
	          
	          System.out.println(responsebody);
	          
	          String store = responsebody.substring(65, 71);
	          
	          System.out.println(store);
	          
	          
	    }
	
	
	
	

}
