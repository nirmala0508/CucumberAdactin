package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactin;

public class AdactinRadioButton extends BaseClassAdactin{
	
	public AdactinRadioButton() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioBtnSelectHotel;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadioBtnSelectHotel() {
		return radioBtnSelectHotel;
	}

	public WebElement getBtnContinue() {
		
		return btnContinue;
	}
	
	
	

}
