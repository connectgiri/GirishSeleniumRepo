package com.GirishContractsADFAutomation.TestCases;
import org.testng.annotations.Test;
import com.GirishContractsADFAutomation.PageObjects.HomePage;
import com.GirishContractsADFAutomation.PageObjects.LoginPage;
import com.GirishContractsADFAutomation.PageObjects.LogoutPage;
import com.GirishContractsADFAutomation.Utilities.Reporting.StepStatus;


public class TC_01_LoginTest extends BaseClass{
	
	@Test
	public void login() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
		driver.get(url);
		lp.Login(username, password);
		reporting.reportExecutionStatus(StepStatus.Pass, "Login passed", false);
		
		
	}
	
	@Test
	public void navigate_workarea() throws Exception{
		Thread.sleep(5000);
		HomePage hp=new HomePage(driver);
		hp.navigate_Workarea("TermsLibrary");
		reporting.reportExecutionStatus(StepStatus.Pass, "Navigate to workarea", false);
	}
	
	@Test
	public void logout() throws Exception{
		LogoutPage lop=new LogoutPage(driver);
		lop.logout();
		reporting.reportExecutionStatus(StepStatus.Pass, "Navigate to workarea", false);
	}
		
	/**
		if( driver.getTitle().equals("")) {
			Assert.assertTrue(true);
		}
		**/

}
