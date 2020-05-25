/**
 * 
 */
package com.MyInnovation.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author neeti.goyal
 *
 */
public class ElementFactory {
	
	
	@FindBy(xpath="//span[text()='Accenture']")
	public WebElement SSO_Btn_AccentureProfile ;
	
	@FindBy(xpath = "//input[@id='userNameInput']" ) 
	public WebElement LoginPage_Input_Username;
	
	@FindBy(id = "passwordInput")
	public WebElement LoginPage_Input_Password;
	
	@FindBy(id="submitButton")
	public WebElement LoginPage__Btn_Signin;
	
	@FindBy (xpath="//li[@class='header_chat_icon']//img[@class='chatbot-icon']")
	public WebElement ChatBot;
	
	@FindBy (xpath = "//input[@placeholder='Type your message']")
	public WebElement Chatbot_InputField ;
	
	@FindBy (xpath = ("(//div[@class='format-markdown'])[last()]"))
    public WebElement Chatbot_Answer ;
    
}
