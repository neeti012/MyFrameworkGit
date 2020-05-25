package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	FileInputStream fis;
	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Configuration/Config.properties");
		System.out.println ("path found");

		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (IOException e) {

			System.out.println("Not able to load config file :" + e.getMessage());
		}

	}

	public String getAppUrl() {

		return pro.getProperty("appURl");

	}

	public String getBrowser() {

		return pro.getProperty("Browser");
	}

	public String getDataFromConfig(String keytoSearch) {

		return pro.getProperty(keytoSearch);
	}

}
