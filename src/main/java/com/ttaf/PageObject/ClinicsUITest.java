package com.ttaf.PageObject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClinicsUITest {
	
	@Test
	public void UiTest() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev.admin.bluegrassbsc.com/");
		ClinicsModule c1=new ClinicsModule(driver);
		c1.loginTo("superadmin@mailinator.com", "Pass@123");
		
	}

}
