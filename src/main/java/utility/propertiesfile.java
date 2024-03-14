package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesfile {
	public String readdata(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(iconstant.propertypath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
}
