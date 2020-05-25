package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots {

	@Test
	public static String CaptureScreenshot( WebDriver driver )

	{
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String screenshot_path = "./Screenshots/"+"MyInnovation_"+ getDate()+".png";

		File dest = new File(screenshot_path);

		try {

			FileHandler.copy(src, dest);
			System.out.println("Screenshot captured");

		} catch (IOException e) {

			System.out.println("some issue happened while copying the files :" + e.getMessage());
			e.printStackTrace();
		}
	
		return screenshot_path;

	}
	
	public static String getDate () {
		
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		String date1 = customformat.format(currentdate);
		return date1;
	}
	

}
