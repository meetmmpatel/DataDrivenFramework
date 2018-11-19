package com.datadriven.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadriven.base.TestBaseUtil;
import com.datadriven.page.LogInPage;

public class LogInPageTest extends TestBaseUtil {

	@Test(dataProvider = "userLoginData")
	public void testLoginPage(String userName, String password) {

		LogInPage login = PageFactory.initElements(driver, LogInPage.class);
		login.userLogIn(userName, password);

	}

	@DataProvider(name = "userLoginData")
	public Object[][] dataProviderForLoginPage() {

		Object[][] obj = { { "Admin", "admin123" } };

		return obj;

	}

}
