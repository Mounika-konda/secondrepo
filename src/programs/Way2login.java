package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2login {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.way2sms.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("mobileNo")).sendKeys("9014469305");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("R4387P");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@onclick,'validLogin();')]")).click();
	Thread.sleep(2000);
    driver.findElement(By.id("mobile")).sendKeys("9014469305");
	Thread.sleep(2000);
	driver.findElement(By.id("message")).sendKeys("34th56");
	Thread.sleep(2000);
driver.findElement(By.id("sendButton")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//i[contains(@class, 'icon-feedback')]")).click();

Thread.sleep(5000);


driver.findElement(By.name("feedText")).sendKeys("uji");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(@class, 'close-btn')]")).click();
Thread.sleep(3000);



	
	
	
	
	
	
	
	
	
	}

}
