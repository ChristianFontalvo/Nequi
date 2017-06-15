package nequi.configuracion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationManager {
	private static Properties p = null;
	
	private static Properties getInstance() {
		if (p==null) {
			p = new Properties();
			try {
				p.load(new FileInputStream("config.properties"));
		 	 } catch (IOException ex) {}
		}
		return p;
	}
	
	public static String getAppSetting(String appSetting) {
		Properties prop = getInstance();
		return prop.getProperty(appSetting);
	}

}
