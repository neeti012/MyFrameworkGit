/**
 * 
 */
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author neeti.goyal
 *
 */
public class BrowserSelection {

	public static WebDriver LaunchBrowser(WebDriver driver, String URL, String Browsername) {

		if (Browsername.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("IE")) {

		} else if (Browsername.equalsIgnoreCase("FireFox")) {

		}

		else {

			System.out.println("Pass the valid browser name");
		}

		driver.manage().window().maximize();

		driver.get(URL);
		return driver;
	}
}
