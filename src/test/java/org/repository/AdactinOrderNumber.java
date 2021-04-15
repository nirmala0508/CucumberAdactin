package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactin;

public class AdactinOrderNumber extends BaseClassAdactin {
	
	public AdactinOrderNumber() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="order_no")
	  private WebElement OrderNo;
	
	public WebElement getOrderNo() {
		return OrderNo;
	}


	
	
}
