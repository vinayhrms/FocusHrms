package com.hrms.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstants{
	
	public WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		System.setProperty(chromekey, chromrValue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://192.168.122.62/hrms");
		
	}
	@AfterMethod
	public void postCondition(ITestResult res) {
		
		int status = res.getStatus();
		if(status==2) {
			String name = res.getMethod().getMethodName();
			GenericUtils.getScreenshot(driver, name);
			Reporter.log("method name " +name,true);
			Assert.fail();
		}
		
		driver.close();
		
	}

}
