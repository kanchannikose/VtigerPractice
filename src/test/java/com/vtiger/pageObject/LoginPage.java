package com.vtiger.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}	
		@FindBy(name="user_name")
		WebElement txtUsername; 
		
		@FindBy(name="user_password")
		WebElement txtPassword;
		
		
		@FindBy(id="submitButton")
		WebElement loginBtn;
	
	
	   public void setUsername(String uname)
	   {
		   txtUsername.sendKeys(uname);
	   }
	   
	   public void setPassword(String pwd)
	   {
		   txtPassword.sendKeys(pwd);
	   }
	   
	   public void loginBtn()
	   {
		   loginBtn.click();
	   }
	
	

}
