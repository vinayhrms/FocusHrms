package com.hrms.testCases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.hrms.PageObjects.loginPage;
import com.hrms.utilities.BaseTest;
import com.hrms.utilities.Exceldata;

public class LoginTest extends BaseTest {
	
	@Test
	public void validLoginTest() throws FileNotFoundException {
		String username=Exceldata.getData(filePath, "TC01", 1, 0);
		String password=Exceldata.getData(filePath, "TC01", 1, 1);
		String title=Exceldata.getData(filePath, "TC01", 1, 2);
		
		
	
		loginPage lg=new loginPage(driver);
		lg.verifyTitle(title);
		lg.enterUN(username);
		lg.enterPW(password);
		lg.clickOnLogin();
		
		
		
		
	}

}
