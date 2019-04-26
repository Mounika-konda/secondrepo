package Newlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Porbandar (PBD)");
	Thread.sleep(2000);
	driver.findElement(By.id("hp-widget__sTo")).sendKeys("New Delhi (DEL)");
	Thread.sleep(2000);
	
	driver.findElement(By.id("hp-widget__paxCounter_pot")).sendKeys("3");
	
	driver.findElement(By.id("searchBtn")).click();
	Thread.sleep(2000);
	
	

	
	
	
	
		
		
	}

}
