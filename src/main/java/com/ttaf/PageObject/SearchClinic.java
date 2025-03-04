package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchClinic {
	public void searchAndChangeStatus(WebDriver driver,String clinic,String un,String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='jss66 MuiBox-root css-0']/p")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(clinic);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo']")).click();
		WebElement msg=driver.findElement(By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 css-1vgedcp']"));
		if(msg.isDisplayed()) {
			System.out.println("Status updated");
		}else {
			System.out.println("Status not updated");
		}
		
		
	}
}
