/**
 * 
 */
package com.MyInnovation.Tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BaseClass;
import Utilities.Screenshots;

/**
 * @author neeti.goyal
 *
 */


public class Verify_Login extends BaseClass {
	
	@Test
	public void Login_Application() {
		
	
		
		logger = report.startTest("Verify_Login", "Application started");
		String username = testdata.ReadStringDataUsingSheetIndex(0, 1, 0);
		logger.log(LogStatus.INFO, "Username Fetched");
	
		String password = testdata.ReadStringDataUsingSheetName("Sheet1", 1, 1);
		logger.log(LogStatus.INFO, "Password fetched");

		login.startApplication(username, password);
		
		logger.log(LogStatus.PASS, "Application logged in successfully");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	;
	}
	
	@AfterMethod
	
	public void ScreenshotAfterMethod(ITestResult result)
	{
	
	
	if (result.getStatus()==ITestResult.FAILURE)
	{
		String ImagePath = Screenshots.CaptureScreenshot(driver);
		
		String path =logger.addScreenCapture(ImagePath);
		logger.log(LogStatus.FAIL, "Failed at below step",path);
		report.endTest(logger);
		report.flush();
		driver.get("./Reports/MyReport.html");
	}
		
		
	}

}
