package Helper;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.MyInnovation.ObjectRepository.ElementFactory;
import com.MyInnovation.Pages.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.BrowserSelection;
import Utilities.ExcelDataProvider;
import Utilities.Screenshots;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider testdata;
	public Login login;
	ConfigDataProvider configdata;
	public ExtentReports report;
	public ExtentTest logger;
	public ElementFactory ef;
	

	@BeforeSuite
	public void SuiteSetup() {

		testdata = new ExcelDataProvider();	
		
	
     
	}
	
	@BeforeClass
	public void setup() {

		configdata = new ConfigDataProvider();
		driver = BrowserSelection.LaunchBrowser(driver, configdata.getAppUrl(),configdata.getBrowser());
		login = new Login(driver);
		report = new ExtentReports("./Reports/MyReport.html");
		ef = PageFactory.initElements(driver, ElementFactory.class );
		
	}
	
	@AfterMethod

	public void quitbrowser() {
		driver.quit();
	}

}
