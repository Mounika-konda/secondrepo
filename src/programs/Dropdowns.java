package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdowns {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	Thread.sleep(3000);
		//Launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		//select multiple items in drop-down
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@value='volvo']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@value='audi']")).click();
		Thread.sleep(5000);
		
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(15000);
	}

}
