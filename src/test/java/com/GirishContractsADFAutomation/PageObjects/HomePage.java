package com.GirishContractsADFAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.GirishContractsADFAutomation.TestCases.BaseClass;


public class HomePage extends BaseClass{
	
	WebDriver ldriver;
	public HomePage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="pt1:_UISmmLink")
	@CacheLookup
	WebElement NavigatorIcon;
	
	@FindBy(id="pt1:nv_itemNode_contract_management_terms_library")
	@CacheLookup
	WebElement TermsLibraryLink;
	
	/**
	 * @author ginallap
	 * @param Workarea
	 */
	
	public void navigate_Workarea(String Workarea) throws Exception
	{
		Thread.sleep(5000);
		NavigatorIcon.click();
		Thread.sleep(5000);
		if(Workarea.equalsIgnoreCase("TermsLibrary"))
			TermsLibraryLink.click();
		
	}
	
}
