package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClinicsModule {
	public WebElement un;
	public WebElement pass;
	public WebElement login;
	public WebElement viewAll;
	public WebElement searchClinic;
	public WebElement search;
	public WebElement msg;
	public WebElement okBtn;
	public WebElement clinics;
	public WebElement addNewClinic;
	public WebElement clinicId;
	public WebElement clinicname;
	public WebElement email;
	public WebElement address1;
	public WebElement city;
	public WebElement state;
	public WebElement country;
	public WebElement zipCode;
	
	
	public ClinicsModule(WebDriver driver) {
		un=driver.findElement(By.xpath("//input[@name='email']"));
		pass=driver.findElement(By.xpath("//input[@name='password']"));
		login=driver.findElement(By.xpath("//button[@type='submit']"));
		viewAll=driver.findElement(By.xpath("//div[@class='jss66 MuiBox-root css-0']/p"));
		searchClinic=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		msg=driver.findElement(By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 css-1vgedcp']"));
		okBtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root jss102 css-hkx3jt']"));
		clinics=driver.findElement(By.xpath("//button[text()='Clinics']"));
		addNewClinic=driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary')]"));
		clinicId=driver.findElement(By.xpath("//input[@name='clinicId']"));
		clinicname=driver.findElement(By.xpath("//input[@name='clinicName']"));
		email=driver.findElement(By.xpath("//input[@name='emailId']"));
		address1=driver.findElement(By.xpath("//input[@name='address1']"));
		city=driver.findElement(By.xpath("//input[@name='city']"));
		state=driver.findElement(By.xpath("//input[@name='state']"));
		country=driver.findElement(By.xpath("//input[@name='country']"));
		zipCode=driver.findElement(By.xpath("//input[@name='zipCode']"));
		
		
		
	}
	
	
	public void loginTo(String username,String password) throws InterruptedException {
		
		un.sendKeys(username);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(2000);
		login.click();
	}
	
//	public void changeClinicStatus() {
//		viewAll.click();
//		searchClinic.sendKeys("nice");
//		search.click();
//		if(msg.isDisplayed()) {
//			System.out.print("Status updated");
//		}else {
//			System.out.print("Status not updated");
//		}
//		okBtn.click();
//		
//		
//	}
//	public void invalidCred(String user,String password) {
//		un.sendKeys(user);
//		pass.sendKeys(password);
//		login.click();
//		
//	}
//	
//	public void createClinic(String username,String password) throws InterruptedException {
//		loginTo(username,password);
//		clinics.click();
//		addNewClinic.click();
//		clinicId.sendKeys("23456");
//		clinicname.sendKeys("Vighnaharta hospitals");
//		email.sendKeys("vighnaharta@gamil.com");
//		address1.sendKeys("MG road");
//		city.sendKeys("Pune");
//		state.sendKeys("Maharashtra");
//		country.sendKeys("India");
//		zipCode.sendKeys("12345");
//		
//	}
	
	

}
