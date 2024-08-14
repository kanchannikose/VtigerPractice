package propertyFileRelated;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();//create object of properties
		
		pro.setProperty("name", "Kanchan");
		pro.setProperty("email", "abc@gmail.com");
		pro.setProperty("age", "28");
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\example.properties";
        
		FileOutputStream fos=new FileOutputStream(filepath);
		
		pro.store(fos, "sample data in properties file..");
		
		fos.close();
		
		System.out.println("Properties have been written into "+filepath);
		
	}

}
