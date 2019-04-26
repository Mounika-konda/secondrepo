package Newlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getattributes {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	Thread.sleep(3000);
		WebElement e=driver.findElement(By.name("q"));
		
		Thread.sleep(3000);
		Actions a=new Actions (driver);
		a.sendKeys(e,"Abdul kalam").build().perform();
		Thread.sleep(3000);
		
		while (2>1)
			
		{
			
			a.sendKeys(Keys.DOWN).build().perform();
			
		String x=e.getAttribute("value");
		if (x.equalsIgnoreCase("abdul kalam thoughts"))
			
		{
			a.sendKeys(Keys.ENTER).perform();
			break;
			
			
		}
		
			
			
		}
		
		
		
		
		

	}

}
