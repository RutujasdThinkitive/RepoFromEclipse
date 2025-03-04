package com.ttaf.PageObject;
import com.ttaf.Library.AppLibrary;
import org.openqa.selenium.WebDriver;


public class LoginUIPage {
private AppLibrary appLibrary;
private WebDriver driver;

//locators
private String usernameFeild="xpath://input[@name='email']";
private String passwordFeild="xpath://input[@name='password']";
private String loginBtn="xpath://button[text()='Login']";
private String logo="xpath://img[@alt='Main Logo']";
private String forgotbtn="xpath://p[text()='Forgot Password?']";

public LoginUIPage(AppLibrary appLibrary) {
	this.appLibrary=appLibrary;
	this.driver=appLibrary.getCurrentDriverInstance();
}

//action

public boolean isEmailFieldPresent() {
	
    return appLibrary.findElement(usernameFeild).isDisplayed();
}

public boolean isPasswordFeildPresent() {
    return appLibrary.findElement(passwordFeild).isDisplayed();
}

public boolean isLoginBtnPresent() {
    return appLibrary.findElement(loginBtn).isDisplayed();
}

public boolean isLogoPresent() {
    return appLibrary.findElement(logo).isDisplayed();
}

public boolean isForgotbtnPresent() {
    return appLibrary.findElement(forgotbtn).isDisplayed();
}



}
