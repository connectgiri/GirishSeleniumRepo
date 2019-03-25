package com.GirishContractsADFAutomation.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GirishContractsADFAutomation.Utilities.ReadCSVTestData;
import com.GirishContractsADFAutomation.Utilities.ReadConfig;

public class LoginPage {
	
	
	ReadCSVTestData csv=new ReadCSVTestData();
	ReadConfig configFile=new ReadConfig();
	
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


/**
 * @author ginallap
 * @param Username
 * @param Password
 * @throws Exception
 * @Return null
 * @Description  This function enters username and password and click on login button
 */

public void Login(String Uname, String Pwd) throws Exception {
	String FilePath=configFile.getConfigPropertyValue("FilePath");
	csv.loadcsv(FilePath);
	Uname=csv.GetValuefromParamList("TC2", "Username");
	Pwd=csv.GetValuefromParamList("TC2", "Password");
	textUserName.sendKeys(Uname);
	textPassword.sendKeys(Pwd);
	btnLogin.click();
	
}

//logout.click();

}
	

