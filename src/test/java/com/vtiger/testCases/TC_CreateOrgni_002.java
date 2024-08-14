package com.vtiger.testCases;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.vtiger.pageObject.CreateOrgainzationPage;
import com.vtiger.pageObject.LoginPage;

public class TC_CreateOrgni_002 extends BaseClass {
	

	@Test
	public void createOrganization() throws InterruptedException
	{
		
		driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(uname);
		lp.setPassword(pwd);
		lp.loginBtn();
		
		Thread.sleep(5000);
		
		CreateOrgainzationPage cop=new CreateOrgainzationPage(driver);
	    cop.createOrganization();
	    cop.clickOnOrgLookup();
	    cop.addOrgName(randomstring());
	    cop.clickSave();
	   
	    Thread.sleep(5000);
	    
	
	}
	
}
