package com.vtiger.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgainzationPage {
	
	WebDriver driver;
	
	public CreateOrgainzationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	WebElement lnkCreateOrg;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement createOrgLookup;
	
	@FindBy(name="accountname")
	WebElement orgName;
	
	
	@FindBy(name="industry")
	WebElement selIndustry;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	WebElement clickSave;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement adminimg;
	
	@FindBy(linkText="Sign Out")
	WebElement signOut;
	
	public void createOrganization()
	{
		lnkCreateOrg.click();
	}
	
	public void clickOnOrgLookup()
	{
		createOrgLookup.click();
	}
	
	public void addOrgName(String oname)
	{
		orgName.sendKeys(oname);
	}
	
	
	public void clickSave()
	{
		clickSave.click();
	}
	
	public void adminimg()
	{
		adminimg.click();
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
	
	
	

}
