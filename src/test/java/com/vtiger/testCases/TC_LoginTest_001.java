package com.vtiger.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void LoginTest() throws IOException
	{
		
		driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(uname);
		lp.setPassword(pwd);
		
		lp.loginBtn();
		
		
		if(driver.getTitle().equals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"))
		{
			Assert.assertTrue(true);
			System.out.println("It is passed");
		}
		else
		{
			captureSceenshot("TC_LoginTest_001");
			Assert.assertTrue(false);
			System.out.println("It is failed");
		}
	}
	
	

}
