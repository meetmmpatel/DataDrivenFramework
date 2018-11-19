/**
 * 
 */
package com.datadriven.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author milanpatel
 *
 */
public class LogInPage {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	@CacheLookup
	WebElement loginSubmit;

	public LogInPage(WebDriver drWebDriver) {
		this.driver = drWebDriver;
	}

	public void userLogIn(String InputuserName, String InputpassWord) {
		username.sendKeys(InputuserName);
		password.sendKeys(InputpassWord);
		loginSubmit.click();
	}

}
