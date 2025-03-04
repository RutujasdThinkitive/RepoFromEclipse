package com.db.Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	public void validCred(WebDriver driver, String url, String un, String pass) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
