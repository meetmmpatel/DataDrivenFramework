package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;

public class LogInPage extends TestBaseUtil {

	@Test(dataProvider = "userLoginData")

	public void testLoginPage(String userName, String password) {
		log.debug("Inside Login Page");
		driver.findElement(By.id(OR.getProperty("loginPageUserName"))).sendKeys(userName);
		driver.findElement(By.id(OR.getProperty("loginPagePassWord"))).sendKeys(password);
		driver.findElement(By.id(OR.getProperty("loginPageSubmit"))).click();
		log.debug("Login Page Test is complete");
	}

	@DataProvider(name = "userLoginData")
	public Object[][] dataProviderForLoginPage() {

		return new Object[][] { { "Admin", "admin123" } };

	}

}
