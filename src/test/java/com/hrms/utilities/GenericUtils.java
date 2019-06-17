package com.hrms.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public static void getScreenshot(WebDriver driver, String name) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src, new File("./ScreenShot/"+name+".png"));
		}
		catch(Exception e) {
			
		}
	}

}
