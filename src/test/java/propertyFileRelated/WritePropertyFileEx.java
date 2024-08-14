package propertyFileRelated;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFileEx {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		pro.setProperty("name", "Kanchan");
		pro.setProperty("position", "Automation Tester");
		pro.setProperty("contact", "855186111");
		pro.setProperty("age", "28");
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\example1.properties";
		
        FileOutputStream fos=new FileOutputStream(filepath);
        
        pro.store(fos, "sample data in property file");
       
        fos.close();
        
        System.out.println("Data created in property file");
	}

}
