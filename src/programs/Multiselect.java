package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws Exception 
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
	Thread.sleep(3000);
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.name("cars"));
	
	Select s=new Select(e);
	Actions a=new Actions (driver);
	a.keyDown(Keys.CONTROL).build().perform();
	a.click(s.getOptions().get(1)).build().perform();
	Thread.sleep(3000);
	a.click(s.getOptions().get(2)).build().perform();
	Thread.sleep(3000);
	a.keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(2000);
	s.deselectByIndex(1);
	
		
		
		
	}

}
