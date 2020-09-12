package stepdefs;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DemoDefinitions {
	
	@Given("I have a configured Cucumber-JVM project")
	public void i_have_a_configured_cucumber_jvm_project() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("at given");
	}

	
	@When("I run it within my IDE")
	public void i_run_it_within_my_ide() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("at when");
		
		//File pathToBinary = new File("/opt/firefox/firefox");
		//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		//FirefoxProfile firefoxProfile = new FirefoxProfile();
		System.setProperty("webdriver.firefox.bin", "/opt/firefox/firefox");
		
		WebDriver driver = new FirefoxDriver();
		System.out.println("BROWSER_BINARY location is "+SystemProperty.BROWSER_BINARY);
		//WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:geckodriver.exe");
		driver = new FirefoxDriver();
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
		*/
	    
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com/");
			
	}

	@Then("I will be able to run connected step definitions")
	public void i_will_be_able_to_run_connected_step_definitions() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("at then");
	}
	

}
