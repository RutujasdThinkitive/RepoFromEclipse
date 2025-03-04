package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	
	String viewAll="driver.findElement(By.xpath(\"//div[@class='jss66 MuiBox-root css-0']/p\")).click()";
	public void validCred(WebDriver driver, String url, String un, String pass) throws InterruptedException {
	
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
	public void searchAndChangeStatus(WebDriver driver,String clinic,String un,String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='jss66 MuiBox-root css-0']/p")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(clinic);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo']")).click();
		Thread.sleep(2000);
		WebElement msg=driver.findElement(By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 css-1vgedcp']"));
		if(msg.isDisplayed()) {
			System.out.println("Status updated");
		}else {
			System.out.println("Status not updated");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root jss102 css-hkx3jt']")).click();
		
	}
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
	public void createClinic(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Clinics']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='clinicId']")).sendKeys("452344");
		driver.findElement(By.xpath("//input[@name='clinicName']")).sendKeys("Vighnaharta Hospitals");
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("vighnahartahospitals@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("MG road");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("7656788");
		WebElement openingTime=driver.findElement(By.xpath("//input[@name='timeSlots.0.openingTime']")); 
		openingTime.sendKeys("7:30 A");
		openingTime.sendKeys(Keys.ARROW_DOWN);
		openingTime.sendKeys(Keys.ENTER);
		WebElement closingTime=driver.findElement(By.xpath("//input[@name='timeSlots.0.closingTime']"));
		closingTime.sendKeys("8:30 P");
		closingTime.sendKeys(Keys.ENTER);
		
		
	}
}
