package com.timeTracking.actiTime.Automation.modulename;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseName {
	@Test
	public void TestCaseName() {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
		
	}

}
