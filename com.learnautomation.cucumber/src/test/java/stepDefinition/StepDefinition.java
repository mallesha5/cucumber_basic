package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public WebDriver driver ; 
	
	@Given("Open Chrome and start application")
	public void open_chrome_and_start_application() {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Users\\W10-Dell\\Documents\\softwares\\Selenium\\new\\chromedriver_win32\\chromedriver.exe";


	    System.out.println("launching chrome browser"); 
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(baseUrl);
	    String expectedTitle = "Welcome: Mercury Tours";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    
	    
	    
	    
	   
	}




	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String string, String string2) {
		
		
		System.out.println("Here we do nothing");
	
	}
	
	
	
	
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	  
		
		driver.close();
		
		System.out.println("closed browser successfully");
	}
	
	
	

}
