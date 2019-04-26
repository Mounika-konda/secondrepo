package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Way2sms {

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.way2sms.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='w2-register']//child::a[1]/button")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("name")).sendKeys("Mounika");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("mobileNo")).sendKeys("9014469305");
	
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("kondamounika443@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='female']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("dob")).sendKeys("12/11/1993");
	Thread.sleep(2000);
	
	WebElement e=driver.findElement(By.id("city"));
	
	Select s=new Select(e);
	s.selectByIndex(4);
	
	Thread.sleep(12000);
	
	driver.findElement(By.id("terms")).click();
	Thread.sleep(4000);
	
driver.findElement(By.id("sendButton")).click();
Thread.sleep(4000);

	
	
	}

}
