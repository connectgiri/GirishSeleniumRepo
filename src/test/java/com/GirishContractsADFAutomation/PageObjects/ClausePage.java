package com.GirishContractsADFAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClausePage {

	WebDriver ldriver;
	public ClausePage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="_FOpt1:_FOr1:0:_FOSritemNode_contract_management_terms_library:0:_FOTsdi__OKC_itemNode__ContractsDefault::icon")
	@CacheLookup
	WebElement workareaIcon;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:_FOTRaT:0:RAtl1")
	@CacheLookup
	WebElement createClauseLink;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:MAnt2:1:ap1:libClCrorgCL::content")
	@CacheLookup
	Select BusinessUnit;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:MAnt2:1:ap1:libClCrinputText5::content")
	@CacheLookup
	WebElement ClauseNumber;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:MAnt2:1:ap1:libClCrinputText6::content")
	@CacheLookup
	WebElement ClauseTitle;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:MAnt2:1:ap1:libClCrintent::content")
	@CacheLookup
	Select Intent;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_contract_management_terms_library:0:MAnt2:1:ap1:libClCrselectOneChoice1::content")
	@CacheLookup
	Select Type;
	
	/**
	 * @author ginallap
	 * @throws Exception
	 */
	public void createClause() throws Exception{
		Thread.sleep(10000);
		System.out.println("Entered in to clause");
//		workareaIcon.click();
		Thread.sleep(5000);
		createClauseLink.click();
		Thread.sleep(5000);
		BusinessUnit.selectByVisibleText("Vision Operations");
		ClauseNumber.sendKeys("SampleSeClause");
		ClauseTitle.sendKeys("SampleClauseT");
		Intent.selectByVisibleText("Buy");
		Type.selectByVisibleText("Administration");
		
		
		
	}
	
	
	
	
}
