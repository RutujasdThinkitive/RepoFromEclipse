package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.LoginPage3;
import com.ttaf.PageObject.LoginUIPage;

public class LoginTest3 extends TestBase {

    @Test(priority = 1)
    public void verifyLogIn() throws Exception {
        test = extent.createTest("verifyLogIn", "Verify Admin Login");
        
        try {
            appLibrary.getCurrentDriverInstance().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            test.log(Status.INFO, "Setting implicit wait");

            String UN = getAdminUserID();
            String pass = getAdminPassword();
            test.log(Status.INFO, "Fetched credentials");

            LoginPage3 lp = new LoginPage3(appLibrary);
            lp.login(UN, pass);
            test.log(Status.PASS, "Login successful");

        } catch (Exception e) {
            test.log(Status.FAIL, "Login failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 0)
    public void verifyLoginUi() {
        test = extent.createTest("verifyLoginUi", "Verify UI Elements on Login Page");

        try {
            LoginUIPage lp = new LoginUIPage(appLibrary);
            appLibrary.getCurrentDriverInstance().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Assert.assertTrue(lp.isLogoPresent(), "Logo is missing!");
            test.log(Status.PASS, "Logo is displayed");

            Assert.assertTrue(lp.isEmailFieldPresent(), "Email field is missing!");
            test.log(Status.PASS, "Email field is displayed");

            Assert.assertTrue(lp.isForgotbtnPresent(), "Forgot button is missing!");
            test.log(Status.PASS, "Forgot button is displayed");

            Assert.assertTrue(lp.isLoginBtnPresent(), "Login button is missing!");
            test.log(Status.PASS, "Login button is displayed");

            Assert.assertTrue(lp.isPasswordFeildPresent(), "Password field is missing!");
            test.log(Status.PASS, "Password field is displayed");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "UI Verification failed: " + e.getMessage());
            throw e;
        }
    }
}