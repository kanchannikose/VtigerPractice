package propertyFileRelated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileexample {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\example.properties";
		
		FileInputStream fos=new FileInputStream(filepath);
		
		pro.load(fos);
		
		fos.close();
		
		String name= pro.getProperty("name");
		String email= pro.getProperty("email");
		String age=pro.getProperty("age");
		
		for(String key: pro.stringPropertyNames())
		{
			System.out.println(key +"    "+pro.getProperty(key));
		}

	}

}
