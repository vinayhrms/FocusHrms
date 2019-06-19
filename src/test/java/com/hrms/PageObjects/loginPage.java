package com.hrms.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	@FindBy(id="Email")
	private WebElement userNameTB;
	
	@FindBy(id="Password")
	private WebElement passwordTB;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBT;
	
	public loginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUN(String username) {
		userNameTB.sendKeys(username);
	}
	public void enterPW(String password) {
		passwordTB.sendKeys(password);
	}
	public void clickOnLogin() {
		loginBT.click();
	}

}
