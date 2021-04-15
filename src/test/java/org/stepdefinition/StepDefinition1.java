package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class StepDefinition1 {
	
	
	public WebDriver driver;
	@Given("User name is in facebook login page")
	public void user_name_is_in_facebook_login_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String Title=driver.getTitle();
	System.out.println(Title);
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println(CurrentUrl); 
	}
	@When("User enter invalid uername and password")
	public void user_enter_invalid_username_and_password() {
	 
	WebElement 
	txtUserName=driver.findElement(By.id("email"));
	txtUserName.sendKeys("Greens");
	WebElement txtPassword=driver.findElement(By.id("pas"));
	txtPassword.sendKeys("12345");
	}
	
	@When("User click login button")
	public void user_click_login_button() throws
	InterruptedException {
	WebElement 
	loginButton=driver.findElement(By.name("login"));
	loginButton.click();Thread.sleep(3000);
	}
	@Then("User should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
	 String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("privacy_mutation_token"));

}
}

