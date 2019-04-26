package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobile.twitter.com/login");
	Thread.sleep(3000);
	driver.findElement(By.name("session[username_or_email]")).sendKeys("mounika");
	
	Thread.sleep(3000);
	driver.findElement(By.name("session[password]")).sendKeys("session[password]");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Forgot password?")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("account_identifier")).sendKeys("mounika");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Search']")).submit();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Continue']")).submit();
	
	Thread.sleep(2000);
	
	}

}
