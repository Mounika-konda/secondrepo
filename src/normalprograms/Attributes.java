package normalprograms;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributes {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	List<WebElement> e=driver.findElements(By.xpath("//*"));
	Iterator<WebElement> iterator=e.iterator();
	Workbook wb;
	
	
	
	
	while (iterator.hasNext())
		
	{
		WebElement element	=iterator.next();
		
		String id=element.getAttribute("id");
		
		System.out.println("id is"+id);
		String classname=element.getAttribute("class");
		System.out.println("iclass  is" + classname);
		
		
		
	}
	
	
		
		
		
	}

}
