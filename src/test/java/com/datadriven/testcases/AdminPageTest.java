package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;
import com.datadriven.page.LogInPage;

public class AdminPageTest extends TestBaseUtil {

	@Test
	public void testClickOnPIM() {

		LogInPageTest loginTest = new LogInPageTest();
		loginTest.testLoginPage("Admin", "admin123");
		driver.findElement(By.id(OR.getProperty("PIM"))).click();

		try {
			Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList",
					driver.getCurrentUrl());

		} catch (TestNGException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("#menu_pim_addEmployee")).click();

	}

}
