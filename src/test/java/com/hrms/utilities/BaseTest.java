package com.hrms.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseTest implements AutoConstants{
	WebDriver driver;
	
	public void preCondition() {
		System.setProperty(chromekey, chromrValue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("");
		
	}
	public void postCondition() {
		
		driver.close();
		
	}

}
