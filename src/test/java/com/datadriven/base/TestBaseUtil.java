package com.datadriven.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBaseUtil {

	/*
	 * WebDriver Properties Logs ExtentReports DB Excel Mail
	 * 
	 * 
	 */

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;

	

	@BeforeSuite
	public void testSetup() throws IOException {

		if (driver == null) {
			// Load the properties files
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/properties/properties/Config.properties");
			config.load(fis);
		

			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/properties/properties/OR.properties");
			OR.load(fis);
			
		}

		// Define the values of web driver to read from properties file.
		// Keep the web driver in to project itself
		if (config.getProperty("browser").equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver 2");

			driver = new FirefoxDriver();
			

		} else if (config.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-3");

			driver = new ChromeDriver();
			
		}

		driver.navigate().to(config.getProperty("testsiteurl"));
		

		// Read the value of implicit wait from config properties file.
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

	}

	public boolean isElement(By by) {
		try {
			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {
			return false;
		}

	}

	@AfterSuite
	public void testCleanup() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(5000);
			driver.quit();
		}
		

	}

}
