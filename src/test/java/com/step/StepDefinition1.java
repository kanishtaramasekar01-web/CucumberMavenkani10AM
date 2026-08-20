package com.step;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class StepDefinition1 {
		
		@Given("User enters login credentials")
		public void user_enters_login_credentials(DataTable dataTable) {
			
			
			List<Map<String, String>> data = 
	                dataTable.asMaps(String.class, String.class);

	        for(Map<String, String> row : data) {

	            String username = row.get("username");
	            String password = row.get("password");

	            System.out.println("Username: " + username);
	            System.out.println("Password: " + password);
	        }
	    }
			
		    
		}



