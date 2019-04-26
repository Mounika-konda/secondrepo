package Newlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws Exception
	
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	WebElement e1=driver.findElement(By.xpath(
            "//*[@id='slider']/child::*"));
int x1=e1.getLocation().getX();
int y1=e1.getLocation().getY();
Actions a=new Actions(driver);
a.dragAndDropBy(e1,x1+150,y1).build().perform();
Thread.sleep(3000);
a.dragAndDropBy(e1,x1-150,y1).build().perform();
Thread.sleep(3000);

		
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Vertical slider")).click();
driver.switchTo().frame(0);
WebElement e2=driver.findElement(By.xpath(
		  "//*[@id='slider-vertical']//child::span[1]"));
int x2=e1.getLocation().getX();
int y2=e2.getLocation().getY();

a.dragAndDropBy(e2,x2+150,y2).build().perform();
Thread.sleep(3000);
a.dragAndDropBy(e2,x2-150,y2).build().perform();
Thread.sleep(3000);





		
		
	}

}
