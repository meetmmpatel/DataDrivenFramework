package com.datadriven.schatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		
		Properties  config = new Properties();
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/properties/Config.properties");
        config.load(fis);
		System.out.println(config.getProperty("browser"));
		System.out.println(config.getProperty("testsiteurl"));
		
		
		
	}

}
