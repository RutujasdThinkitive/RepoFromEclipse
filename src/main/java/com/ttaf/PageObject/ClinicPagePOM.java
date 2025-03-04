package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClinicPagePOM {
	public WebElement clinics;
	public String Expurl="https://dev.admin.bluegrassbsc.com/clinics";
	public WebElement addNewClinic;
	public WebElement search;
	public WebElement searchText;
	public WebElement profile;
	
	
	public ClinicPagePOM(ChromeDriver driver) {
		
		addNewClinic=driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary')]"));
		search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchText=driver.findElement(By.xpath("//div[text()='test']"));
		profile=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-qfi6ev']"));
	}
	
	
	public void ClinicsUi(ChromeDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		String act=driver.getCurrentUrl();
		Thread.sleep(2000);
		if(act.equals(Expurl)) {
		System.out.println("On the correct page");
			System.out.println("Add new clinic button: "+addNewClinic.isDisplayed());
			Thread.sleep(2000);
			System.out.println("Search bar: "+search.isDisplayed());
			Thread.sleep(2000);
			
			String expRecord="test";
			search.sendKeys("test");
		Thread.sleep(2000);
			if(expRecord.equals(searchText.getText())) {
				System.out.println("search feild is working properly");
			}else {
				System.out.println("not working properly");
			}
			
			
		}else {
			System.out.println("Not on correct page");
		}
		
		String profileName="Abhishek Sharmak";
		if(profile.equals(profileName)) {
			System.out.println("Correct profile");
		}
		
	}
}
