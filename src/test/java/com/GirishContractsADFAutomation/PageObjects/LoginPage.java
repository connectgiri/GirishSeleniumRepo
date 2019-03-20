package com.GirishContractsADFAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
@FindBy(name="userid")
@CacheLookup
WebElement textUserName;

@FindBy(name="password")
@CacheLookup
WebElement textPassword;

@FindBy(name="btnActive")
@CacheLookup
WebElement btnLogin;


public void Login(String Uname, String Pwd) {
	textUserName.sendKeys(Uname);
	textPassword.sendKeys(Pwd);
	btnLogin.click();
}
	
}
