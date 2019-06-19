package com.hrms.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

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
	
	public static void selectByIndex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void selectByVisibletext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	public static void alertPopupOk(WebDriver driver) {
		Alert a=driver.switchTo().alert();
		Reporter.log("popup text"+a.getText(),true);;
		a.accept();
	}

}
