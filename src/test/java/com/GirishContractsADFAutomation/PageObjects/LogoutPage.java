package com.GirishContractsADFAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoutPage {
	
	WebDriver ldriver;
	public LogoutPage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	

@FindBy(id="pt1:_UIScmil2u::icon")
@CacheLookup
WebElement logout;

@FindBy(name="Confirm")
@CacheLookup
WebElement logout_confirm;

@FindBy(id="pt1:_UISlg1")
@CacheLookup
WebElement logout_Signout;

@FindBy(id="_FOpt1:_UIShome::icon")
@CacheLookup
WebElement Home;


public void logout() throws Exception {
	Thread.sleep(5000);
//	Home.click();
//	Thread.sleep(5000);
	logout.click();
	Thread.sleep(5000);
	logout_Signout.click();
	Thread.sleep(5000);
	logout_confirm.click();
	
}

}
