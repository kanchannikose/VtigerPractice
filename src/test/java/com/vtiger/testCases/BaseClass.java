package com.vtiger.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import vtiger.genericUtilities.PropertyFileUtility;

public class BaseClass {

	PropertyFileUtility putil = new PropertyFileUtility();

	public String baseUrl = putil.getUrl();
	public String uname = putil.getUsername();
	public String pwd = putil.getpassword();

	static WebDriver driver;
    
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		if (br.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");
            driver=new EdgeDriver();
		}

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public static void captureSceenshot(String fileName) throws IOException
	  {
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg=new File("./screenshots/"+fileName);
		  FileUtils.copyFile(src, trg);
		  
		  System.out.println("screenshot saved successfully");
		  
		
		  
		
	  }
	public String randomstring()
	{
		String generateString =RandomStringUtils.randomAlphanumeric(5);
		return generateString;
	}


}
