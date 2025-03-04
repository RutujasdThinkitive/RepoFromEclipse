package com.db.Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.ttaf.PageObject.ClinicsModule;

public class ClinicsTest {
	public WebDriver driver;
	public ClinicsModule  c1;
	
	
	@BeforeMethod
	public void prerequisite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Thinkitive2//BlueGrass/automationFramework/driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		 c1=new ClinicsModule(driver);
		 Thread.sleep(2000);
		 driver.get("https://dev.admin.bluegrassbsc.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
	}
	
	
	
	
	@Test
	public void loginTest() throws InterruptedException {
		Thread.sleep(2000);
		c1.loginTo("superadmin@mailinator.com", "Pass@123");
		Thread.sleep(2000);
	}
	
	
	
}
