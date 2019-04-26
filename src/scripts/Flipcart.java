package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworks_base.BaseEngine;
import suppoerters.PropertiesReusables;

public class Flipcart extends BaseEngine

{

	@Test
	public void gmailLogin() throws Exception
	{
	
	 PropertiesReusables prconf1=new PropertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\frameworks\\config1.properties");
	
	 PropertiesReusables prOr =new PropertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\frameworks\\objectRepository\\OR.properties");
	 String un_id= prOr.getPropertyValue("un_id");
	 String urL=prconf1.getPropertyValue("url");
	 String un=prconf1.getPropertyValue("un");
	 
	 
	 
	 String next_xpath= prOr.getPropertyValue("next_xpath");
	 getWebDriver().get(urL);
	 Thread.sleep(3000);
	  
	 getWebDriver().findElement(By.id(un_id)).sendKeys(un);
	 getWebDriver().findElement(By.xpath(next_xpath)).click();
	 
	 
	 
	}
}
