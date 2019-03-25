package com.GirishContractsADFAutomation.TestCases;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.GirishContractsADFAutomation.Utilities.ReadConfig;
import com.GirishContractsADFAutomation.Utilities.Reporting;



public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	public static HashMap<String, String> hashampcsv = new HashMap<String, String>();
	public String url=readConfig.getConfigPropertyValue("url");
	public String username=readConfig.getConfigPropertyValue("username");
	public String password=readConfig.getConfigPropertyValue("password");
	public static WebDriver driver;
	Reporting reporting=new Reporting();
		
	@Parameters("TestCaseName")
	@BeforeClass
	public void setreporting(String TC) throws Exception {
		
		reporting.setTestCaseName(TC);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
	if(br.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	if(br.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
	
	if(br.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
			
		
	}
	
	
	
	/**
	@throws Exception 
	 * @AfterClass
	public void tearDown() {
		driver.quit();
	}
	**/
	
	@AfterClass
	public void tearDown() throws Exception {
		reporting.initializeHtmlReport("C:\\Users\\ginallap.ORADEV\\eclipse-workspace\\GirishContractsADFAutomation\\ResultFiles\\25-March-19");
	}


}
