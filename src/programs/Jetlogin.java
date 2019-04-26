package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jetlogin {

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jetairways.com/EN/IN/planyourtravel/cars.aspx?currency=INR");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='#jp-login-panel']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("txtHeaderJPNumber")).sendKeys("2346");
	Thread.sleep(2000);
	driver.findElement(By.id("txtHeaderPassword")).sendKeys("9754");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@aria-describedby='spnForgotPassword']")).click();
	Thread.sleep(4000);
	
	
		
		
		
	}

}
