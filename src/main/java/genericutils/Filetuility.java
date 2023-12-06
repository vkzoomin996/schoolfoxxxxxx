package genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Filetuility {
	public String readdatafrompropertyFile(String key ) throws Throwable {
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
 		Properties prop=new Properties();
 		prop.load(fis);
 		String value = prop.getProperty(key);
  		return value;
 		
		
	}

}
