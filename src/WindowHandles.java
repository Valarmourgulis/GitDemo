import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String>windows= driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailID);
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'We are offering free assistance of providing ')]")).getText());
		driver.findElement(By.xpath("//p[contains(text(),'We are offering free assistance of providing ')]")).getText();

		String password=driver.findElement(By.xpath("//p[contains(text(),'We are offering free assistance of providing ')]")).getText().split("of")[0].trim().split("free")[1];
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		
		

	}

}
