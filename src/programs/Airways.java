package programs;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Airways {
	
	
	public static void slectDateByJs(WebDriver driver,WebElement element2, String date) throws Exception
	
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','30 Jan, 2019');",element2);
		Thread.sleep(10000);
	
	}
	
public static void pickDateByJs(WebDriver driver,WebElement element2, String date) throws Exception
	
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','25 Feb, 2019');",element2);
		Thread.sleep(10000);
	
	}

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jetairways.com/EN/IN/planyourtravel/cars.aspx?currency=INR");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@alt='Carzonrent']")).click();
	Thread.sleep(2000);
	
	
	Set<String> windows=driver.getWindowHandles();
	List<String>list=new ArrayList<String>(windows);
	
	driver.switchTo().window(list.get(2));
	Thread.sleep(6000); 
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	WebElement element1=driver.findElement(By.id("ddlOriginSF"));
	Select s=new Select(element1);
	s.selectByIndex(5);
	Thread.sleep(6000); 
	WebElement houryrent=driver.findElement(By.xpath("//span[text()='Hourly Rental']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",houryrent);
	Thread.sleep(2000);
	
	WebElement date=driver.findElement(By.id("inputFieldSF1"));
	String dateval="30 Jan, 2019";
	
	slectDateByJs(driver,date,dateval);
	Thread.sleep(4000);
	
	
	WebElement date2=driver.findElement(By.id("inputFieldSF2"));
	String dateval2="25 Feb, 2019";
	pickDateByJs(driver,date2,dateval2);
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("btnMakePaymentSF")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
	}

}
