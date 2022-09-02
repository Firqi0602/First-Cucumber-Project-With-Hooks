package com.juaracoding.pageobject.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{

	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandBox");
		
		return new ChromeDriver(options);
	}
}
