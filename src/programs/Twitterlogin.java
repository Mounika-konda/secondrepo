package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitterlogin {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobile.twitter.com/login");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign up for Twitter")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("name")).sendKeys("sam");
	Thread.sleep(2000);
	driver.findElement(By.name("phone_number")).sendKeys("90989");
	Thread.sleep(2000);
	
	}

}
