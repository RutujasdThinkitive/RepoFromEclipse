package com.db.Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ttaf.PageObject.*;



public class LoginTest1 {
	public WebDriver driver;
	public static String un;
	public static String pass;
	public static String url="https://dev.admin.bluegrassbsc.com/";
	@BeforeClass
	public void prerequisite() {
		System.setProperty("webdriver.chrome.driver","D:/Thinkitive2//BlueGrass/automationFramework/driver/chromedriver.exe");
		
	}
	@BeforeMethod
	public void openBrowser() {
		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(priority = 0) 
	public void login() throws InterruptedException {
		
		Login1 l1=new Login1();
		 un="superadmin@mailinator.com";
		 pass="Pass@123";
		
		l1.validCred(driver,url,un,pass);
	}
	@Test(priority =1 )
	public void LoginWithInvalid() throws InterruptedException {
		Login1 l1=new Login1();
		
		un="demoadmin@demo.com";
		pass="Pass567";
		System.out.println("if 1 then logged in with invalid cred else 0: "+l1.invalidCred(driver, un, pass));
	}
	@Test(priority = 2)
	public void search() throws InterruptedException {
		Login1 l1=new Login1();
		un="superadmin@mailinator.com";
		 pass="Pass@123";
		l1.searchAndChangeStatus(driver, "nice",un,pass);
	}
	@Test(priority = 3)
	public void createTheClinic() throws InterruptedException {
		Login1 l1=new Login1();
		 un="superadmin@mailinator.com";
		 pass="Pass@123";
		l1.validCred(driver,url,un,pass);
		l1.createClinic(driver);
	}
	
}
