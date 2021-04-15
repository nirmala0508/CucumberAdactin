package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactin;

public class AdactinPojoClassLogin extends BaseClassAdactin{
	
	public AdactinPojoClassLogin() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	  private WebElement txtUser;
	
	@FindBy(id="password")
	  private WebElement txtPass;
	
	@FindBy(id="login")
	  private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	
	public WebElement getTxtPass() {
		return txtPass;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
