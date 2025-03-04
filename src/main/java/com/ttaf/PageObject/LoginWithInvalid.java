package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWithInvalid {
	public int invalidCred(WebDriver driver,String un,String pass) throws InterruptedException {
		String url="https://dev.admin.bluegrassbsc.com/dashboard";
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String currUrl=driver.getCurrentUrl();
		
		if(url.equals(currUrl)) {
			return 1;
		}
		
		return 0;
	}
}
