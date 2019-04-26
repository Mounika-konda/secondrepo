package Newlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abdulkalam {

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Abdul kalam");
		Thread.sleep(3000);
		
		Actions a=new Actions (driver);
		
		for (int i=0;i<=2;i++)
			
		{
			
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		List<WebElement>l =driver.findElements(By.tagName("a"));
		for (int i=0; i<l.size();i++)
			
		
		{
			int count=0;
			
			if(l.contains("abdul kalam"))
				
			{
				
				count++;
				System.out.println(count);
			}
			
			
			
			
			}
			
		}

	

}
