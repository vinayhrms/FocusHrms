package com.hrms.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstants{
	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		System.setProperty(chromekey, chromrValue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("");
		
	}
	@AfterMethod
	public void postCondition() {
		
		driver.close();
		
	}

}
