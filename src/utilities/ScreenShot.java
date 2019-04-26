package utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import frameworks_base.BaseEngine;


public interface ScreenShot {

	

	public static void screenshot(String tcName) throws Exception {
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseEngine.getWebDriver();
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(BaseEngine.getUserDir()+"\\Screenshots\\"+tcName+".jpeg"));
	}

	
}


