package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;

public class AdminPage extends TestBaseUtil {

	@Test
	public void testClickOnPIM() {
		driver.findElement(By.id(OR.getProperty("PIM"))).click();

	}

}
