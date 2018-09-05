package com.swift.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class testcase {

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
