package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClassAdactin;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClassAdactin  {
	
	@Before
	public void beforeScenario() throws InterruptedException {
		ChromeBrowser();
		MaxWindow();
		Thread.sleep(5000);
		
	}
	@After
	public void afterScenario(Scenario s) throws InterruptedException, IOException {
		//screen shots will emded in embedding folder
		
		if(s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] Screenshot=ts.getScreenshotAs(OutputType.BYTES);
			s.embed(Screenshot, "image/png");
		}
	}

	
	@Before("@sanity")
	public void beforesanity() {
		System.out.println("Sanity scenario starts");
	}
	
	@After("@sanity")
	public void aftersanity() {
		System.out.println("Sanity scenario ends");
	}
	
	@Before(order=1)
	public void before1() {
		System.out.println("Order 1 @Before running");

	}
		
	@After(order=1)
	private void after1() {
		System.out.println("Order 1 @After running");

	} 
	
	
	
}
