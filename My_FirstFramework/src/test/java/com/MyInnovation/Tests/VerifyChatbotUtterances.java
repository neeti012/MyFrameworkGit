package com.MyInnovation.Tests;

import org.testng.annotations.Test;

import com.MyInnovation.Pages.Chatbot;
import com.MyInnovation.Pages.Login;
import Helper.BaseClass;

public class VerifyChatbotUtterances extends BaseClass {
	
	@Test
	public void validateChatbotResponse() throws InterruptedException {
		
		Login login = new Login(driver);
		String username = testdata.ReadStringDataUsingSheetIndex(0, 1, 0);
		String password = testdata.ReadStringDataUsingSheetName("Sheet1", 1, 1);
		login.startApplication(username, password);
		Thread.sleep(20000);
		Chatbot chat = new Chatbot(driver);
		
		chat.ClickChatbotIcon();
		
	}
	
	

}
