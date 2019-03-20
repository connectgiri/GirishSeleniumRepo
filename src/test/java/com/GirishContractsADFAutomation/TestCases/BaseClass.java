package com.GirishContractsADFAutomation.TestCases;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.GirishContractsADFAutomation.Utilities.ReadConfig;



public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	
	public String url=readConfig.getConfigPropertyValue("url");
	public String username=readConfig.getConfigPropertyValue("username");
	public String password=readConfig.getConfigPropertyValue("password");
	public static WebDriver driver;
		
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
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
