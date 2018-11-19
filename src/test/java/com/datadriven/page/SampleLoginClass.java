package com.datadriven.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.datadriven.base.TestBaseUtil;

public class SampleLoginClass extends TestBaseUtil {
	 By username = By.id(OR.getProperty("loginPageUserName"));
	 By password = By.id(OR.getProperty("loginPagePassWord"));
	 By loginSubmit = By.id(OR.getProperty("loginPageSubmit"));

	public void testLoginPage() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginSubmit).click();
		
	}
	
	public SampleLoginClass(WebDriver driver) {
		
	}
	

}
