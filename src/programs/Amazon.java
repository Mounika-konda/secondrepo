package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement e=driver.findElement(By.xpath("//span[text()='Shop by']"));
	Thread.sleep(2000);
	Actions a=new Actions (driver);
	a.moveToElement(e).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='TV, Appliances, Electronics']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Televisions']")).click();
	Thread.sleep(3000);
	
	
	
	
	}

}
