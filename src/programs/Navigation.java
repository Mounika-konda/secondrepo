package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Exception
	
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.co.in");
	Thread.sleep(5000);
	String x=driver.findElement(By.name("q")).getAttribute("class");
	System.out.println(x);
	
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	System.out.println(w+" "+h);
	Dimension d=new Dimension(200,600);
	driver.manage().window().setSize(d);
	Thread.sleep(5000);
		
	}
}
