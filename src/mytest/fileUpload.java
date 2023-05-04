package mytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.cssSelector("a[id='pickfiles'] span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\parik\\OneDrive\\Documents\\TotalAV\\Autoit.exe");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedCondition.)
	}

}
