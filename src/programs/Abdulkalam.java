package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abdulkalam {

	public static void main(String[] args) throws Exception 
	
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	//Launch site
	driver.get("https://jqueryui.com/droppable");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//Switch to frame
	driver.switchTo().frame(0); //single frame in page
	//Automate drag and drop
	WebElement e1=driver.findElement(By.id("draggable"));
	WebElement e2=driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(e1, e2).build().perform();
	Thread.sleep(3000);
	
	String x=driver.findElement(By.xpath("//*[text()='Drag me to my target']")).getCssValue("#333333");
	System.out.println(x);
	

		
		
		
	}

}
