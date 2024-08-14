package vtiger.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	
	
	Properties pro;      //object of properties
	
	public PropertyFileUtility() //constructor
	{
		File src=new File(".\\src\\test\\resources\\CommonData");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	
	public String getUrl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public String getbrowser()
	{
		String browser=pro.getProperty("browser");
		return browser;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	
}
