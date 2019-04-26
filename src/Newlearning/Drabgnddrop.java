package Newlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drabgnddrop {

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable\"");
	Thread.sleep(2000);
	
	WebElement e1=driver.findElement(By.id("draggable"));
	WebElement e2=driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(e1, e2).build().perform();
		
		
		
	}

}
