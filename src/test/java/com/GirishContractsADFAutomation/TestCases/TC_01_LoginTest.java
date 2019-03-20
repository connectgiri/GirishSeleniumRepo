package com.GirishContractsADFAutomation.TestCases;


import org.testng.annotations.Test;

import com.GirishContractsADFAutomation.PageObjects.LoginPage;

public class TC_01_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() {
		
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.Login(username, password);
		
	/**
		if( driver.getTitle().equals("")) {
			Assert.assertTrue(true);
		}
		**/
	}
	

}
