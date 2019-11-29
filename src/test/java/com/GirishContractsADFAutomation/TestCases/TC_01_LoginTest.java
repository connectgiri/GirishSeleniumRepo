package com.GirishContractsADFAutomation.TestCases;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GirishContractsADFAutomation.PageObjects.ClausePage;
import com.GirishContractsADFAutomation.PageObjects.HomePage;
import com.GirishContractsADFAutomation.PageObjects.LoginPage;
import com.GirishContractsADFAutomation.PageObjects.LogoutPage;
import com.GirishContractsADFAutomation.Utilities.Reporting.StepStatus;


public class TC_01_LoginTest extends BaseClass{
	
	@Test
	public void login() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
//		driver.get(url);
//		lp.Login(username, password);
//		reporting.setStepName("Login");
//		reporting.reportExecutionStatus(StepStatus.Pass, "Login passed", false);
		driver.get("https://www.weightwatchers.com/us/find-a-meeting/search?search=10011");
//		List list = driver.findElements(By.xpath("//*[@id='rso']/div[2]/div/div/h3/a"));
		List list = driver.findElements(By.xpath("//div[@class='meeting-locations-list__item']"));
		System.out.println("size:"+ list.size());
		
		if (list.size() >0){
		String a=driver.findElement(By.xpath("//div[@class='meeting-locations-list__item']")).getAttribute("id");
		String b=driver.findElement(By.xpath("//div[@id='"+a+"']//result-location[@location='location']//div[@class='meeting-location']//div[@class='meeting-location__top']//")).
		driver.findElement(By.xpath("//div[@id='"+a+"']")).click();
		
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String h=driver.findElement(By.cssSelector("#content > div > div > ui-view > ui-view > div.meeting-detail > "
				+ "div.meeting-detail-bottom-container.container-fluid > div > div > div.meeting-detail-bottom-top > "
				+ "div > div > schedule-detailed > div > div:nth-child("+dayOfWeek+") > "
						+ "div.schedule-detailed-day-meetings")).getText();
		System.out.println("schedule:" + h);
				
	}
		
		
		
	}
	
	@Test
	public void navigate_workarea() throws Exception{
		Thread.sleep(5000);
		HomePage hp=new HomePage(driver);
		hp.navigate_Workarea("TermsLibrary");
		reporting.setStepName("Navigate to workarea");
		reporting.reportExecutionStatus(StepStatus.Pass, "Workarea navigation", false);
	}
	
	@Test
	public void createclause() throws Exception{
		Thread.sleep(5000);
		ClausePage clause= new ClausePage(driver);
		clause.createClause();
	}
	
	
//	@Test
//	public void logout() throws Exception{
//		LogoutPage lop=new LogoutPage(driver);
//		lop.logout();
//		reporting.setStepName("Logout");
//		reporting.reportExecutionStatus(StepStatus.Pass, "Logout from application", false);
//	}
		
	/**
		if( driver.getTitle().equals("")) {
			Assert.assertTrue(true);
		}
		**/

}
