import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//1.Give me the count of the link in page.
		//2.Count of footer section
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3.Count of l
		
		WebElement part=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(part.findElements(By.tagName("a")).size());
		
		//4.Click on each link in the column and check if the pages are opening
		for(int i=1;i<part.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			part.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(3000);
			
			Set<String>abc =driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
			 
			}
			
			
		}
		
	}

}
