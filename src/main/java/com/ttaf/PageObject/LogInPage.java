package com.ttaf.PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {
	public WebElement un;
	public WebElement pass;
	public WebElement login;
	
	
	
	

	public LogInPage(ChromeDriver driver) {
		un=driver.findElement(By.xpath("//input[@name='email']"));
		pass=driver.findElement(By.xpath("//input[@name='password']"));
		login=driver.findElement(By.xpath("//button[@type='submit']"));
		
		
	}
	public void loginTo(String user,String password,ChromeDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		un.sendKeys(user);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Clinics']")).click();
		
		
		
	}
	
	

}
