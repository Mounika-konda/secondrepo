package Newlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms  

{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	//Launch site
	driver.get("http://www.way2sms.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@class='mdw-ft align-right']/a/button")).click();
	
	}
 
	
	
	
}
