package com.MyInnovation.Pages;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.MyInnovation.ObjectRepository.ElementFactory;

public class Chatbot {
	
    WebDriver driver ;
	ElementFactory ef;
	Actions action ;
	 boolean status;
	 
	public  Chatbot (WebDriver driver) {
		
		this.driver = driver;	
		ef = PageFactory.initElements(driver, ElementFactory.class);
		
		action  = new Actions(driver);
	}
	
	
	public void ClickChatbotIcon() throws InterruptedException {
		
		ef.ChatBot.click();
		driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
		ef.Chatbot_InputField.click();
		Thread.sleep(5000);
	    //action.moveToElement(ef.Chatbot_InputField).sendKeys("hello").build().perform();
		ef.Chatbot_InputField.sendKeys("hello");
		Thread.sleep(5000);
	
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		//ef.Chatbot_InputField.sendKeys("What are private challenges");
		//action.moveToElement(ef.Chatbot_InputField).sendKeys(Keys.ENTER).build().perform();
		//sendKeys(Keys.ENTER).perform();
		Thread.sleep(7000);
		String Chatbot_ActualReply = ef.Chatbot_Answer.getText();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		String Chatbot_expectedReply = "How would you like to use the MyInnovation platform today?";
if (Chatbot_expectedReply.equals(Chatbot_ActualReply))
{
	System.out.println("Matched");
	}
else {
	System.out.println("Not matched");
}
}
}

