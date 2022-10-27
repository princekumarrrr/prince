package com.timeTracking.actiTime.Automation.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database connection has been established");
		System.out.println("Navi");
		
	}
	@BeforeClass
	public void bcConfig() {
		System.out.println("Logged in to the application");
		System.out.println("Navigate to the url");
	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("Logged in the applicatio");
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("Logged out to the application");
	}
	@AfterClass
	public void acConfig() {
		System.out.println("Browser has been closed");
	}
	@AfterSuite
	public void asConfig() {
		System.out.println("Database connection has been closed");
	}
}
