import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Swtching Window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		
		String text= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
		
		driver.switchTo().window(parentId);
		WebElement names=driver.findElement(By.cssSelector("[name='name']"));
		names.sendKeys(text);
		//Screenshot
		//File file=names.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("LOGO.png"));
		
		
		
		//Get height and Weight
		//Height,Weight comes under UX terminology 
		System.out.println(names.getRect().getDimension().getHeight());
		System.out.println(names.getRect().getDimension().getWidth());
		

	}

}
