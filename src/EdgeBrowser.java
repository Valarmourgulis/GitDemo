import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.className("login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Parikshit");
		driver.findElement(By.name("email")).sendKeys("parikshit09chauhan@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Parikshit@123");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
