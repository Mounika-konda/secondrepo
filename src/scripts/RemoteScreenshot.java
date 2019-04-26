package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworks_base.BaseEngine;

public class RemoteScreenshot extends BaseEngine{

	
	
	
		@Test
		public  void screenshotJquery() throws IOException {
			getWebDriver().get("https://www.jqueryui.com");
			getWebDriver().findElement(By.id("2")).click();
	
		
	
		
		
		
	}

}
