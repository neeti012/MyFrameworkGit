package com.MyInnovation.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.MyInnovation.ObjectRepository.ElementFactory;

public class Login {
	
	WebDriver driver ;
	
	ElementFactory ef;
	
	public  Login (WebDriver driver) {
		
		this.driver = driver;	
		ef = PageFactory.initElements(driver, ElementFactory.class);
	}
	
	public void startApplication (String Username , String Password) {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ef.SSO_Btn_AccentureProfile.click();
		ef.LoginPage_Input_Username.sendKeys(Username);
		ef.LoginPage_Input_Password.sendKeys(Password);
		ef.LoginPage__Btn_Signin.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		
		
	}

}
