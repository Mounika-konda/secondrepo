package programs;

import java.util.List;

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
	  driver.get("http://www.gmail.com");
	  Thread.sleep(3000);
	  String x=driver.findElement(By.name("identifier")).getAttribute("aria-label");
	  System.out.println(x);
	  
	  Thread.sleep(2000);
	  String y=driver.findElement(By.name("identifier")).getCssValue("text-align");
	  System.out.println(y);
	  Thread.sleep(2000);
	  String z=driver.findElement(By.name("identifier")).getText();
		System.out.println(z);
		String w=driver.findElement(By.name("identifier")).getTagName();
		System.out.println(w);
		//close site
		
		int nove=0;
		int nohe=0;
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				nove=nove+1;
			}
			else
			{
				nohe=nohe+1;
			}
		}
		System.out.println(nove);
		System.out.println(nohe);
		driver.close();
		
		
		

	}

}
