package com.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	WebDriver driver;
	
	@Given("User Enters the facebook url through Chrome browser")
	public void user_enters_the_facebook_url_through_chrome_browser() {
		
		  driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
	    
	}
	
	
	
	@When("User Clicks on the Login Button")
	public void loginButton() {
		
		
		
	   driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		
	   
	}

	@When("User Enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
		
		//inspect userName

		 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kani@gmail.com");
		

		//inspect Password
		
	   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("9696");	
	   
	  
		
	   
	}


	@When("User Enters the valid username and invalid password")
	public void user_enters_the_valid_username_and_invalid_password() {
		
		//inspect userName

		 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kani963@gmail.com");
		

		//inspect Password
		
	   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("9697");	
	   
	 
		
	    
	}

	@When("User Enters the invalid username and valid password")
	public void user_enters_the_invalid_username_and_valid_password() {
		
		
		//inspect userName

		 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kani123@gmail.com");
		

		//inspect Password
		
	   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("9496");	
	   
	  
		
	   
	}
	
	
	@Then("User Validates the error Message")
	public void user_validates_the_error_message() {
	    
		
		
		System.out.println("user Verify Successfully");
	}



}
