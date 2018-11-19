package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;
import com.datadriven.page.SampleLoginClass;

public class SampleTestClass extends TestBaseUtil {
	
	@Test
	public void testPIMclick() {
		SampleLoginClass login  = new SampleLoginClass(driver);
		login.testLoginPage();
		driver.findElement(By.id(OR.getProperty("PIM"))).click();
		
	}
	
	

}
