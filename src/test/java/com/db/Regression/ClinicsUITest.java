package com.db.Regression;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ttaf.PageObject.LogInPage;
import com.ttaf.PageObject.ClinicPagePOM;


public class ClinicsUITest {
	@Test
	public void UiTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:/Thinkitive2//BlueGrass/automationFramework/driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.admin.bluegrassbsc.com/");
		Thread.sleep(2000);
		LogInPage c1=new LogInPage(driver);

		c1.loginTo("superadmin@mailinator.com", "Pass@123",driver);
		
		Thread.sleep(2000);
		
		ClinicPagePOM c2=new ClinicPagePOM(driver);
		c2.ClinicsUi(driver);
		
	}
}
