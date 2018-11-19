package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;
import com.datadriven.page.LogInPage;

public class LeavePageTest extends TestBaseUtil {

	@Test
	public void testLeavepage() {
		AdminPageTest adminTest = new AdminPageTest();
		adminTest.testClickOnPIM();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

	}
	


}
