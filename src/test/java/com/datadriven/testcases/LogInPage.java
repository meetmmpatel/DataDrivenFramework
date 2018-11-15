package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;

public class LogInPage extends TestBaseUtil {

	@Test
	public void getLoginPage() throws InterruptedException {
		
		log.debug("Inside Login Page");

		driver.findElement(By.id(OR.getProperty("loginPageUserName"))).sendKeys("Admin");
		driver.findElement(By.id(OR.getProperty("loginPagePassWord"))).sendKeys("admin123");
		driver.findElement(By.id(OR.getProperty("loginPageSubmit"))).click();
		
		log.debug("Login Page Test is complete");

	}

}
