package com.ttaf.PageObject;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.ttaf.Library.AppLibrary;

public class LoginPage3 {
	
	private AppLibrary appLibrary;
	private WebDriver driver;
	//locators
	private String un="xpath://input[@name='email']";
	private String pass="xpath://input[@name='password']";
	private String loginBtn="xpath://button[text()='Login']";
	
	//driver
	
	public LoginPage3(AppLibrary appLibrary) throws MalformedURLException {
		this.appLibrary=appLibrary;
		this.driver=appLibrary.getCurrentDriverInstance();
		//This is for testing
		
	}
	
	public void login(String un1,String password) throws Exception {
		appLibrary.enterText(un, un1);
		Thread.sleep(2000);
		appLibrary.enterText(pass, password);
		Thread.sleep(2000);
		appLibrary.clickElement(loginBtn);
	}
	

}
