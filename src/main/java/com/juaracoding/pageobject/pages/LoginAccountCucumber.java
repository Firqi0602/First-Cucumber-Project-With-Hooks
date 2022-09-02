package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class LoginAccountCucumber {
	private WebDriver driver;
 
	public LoginAccountCucumber() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
//	
//	======================= Login ====================
//	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//li[normalize-space()='Authentication failed.']")
	private WebElement msgFailed;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement txtMyAccount;
//	
//	======================= Login ====================
//	Scenario 
	public void login(String email, String password) {
		this.email.sendKeys(email); //step
		this.password.sendKeys(password);
	}
	
	public String msgFailed() {
		return msgFailed.getText();
	}
	
	public String getTxtMyAccount() {
		return txtMyAccount.getText();
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
}
