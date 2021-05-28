package com.wefox.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() {
		
		prop = new Properties();
		FileInputStream fis = null;
		String projPath = System.getProperty("user.dir");
		try {
			fis = new FileInputStream(projPath + "//resources//data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		
		switch(browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projPath + "//resources//chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":
			break;
		case "safari":
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
