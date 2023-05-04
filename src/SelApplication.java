import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SelApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		
		//webdriver.chrome.driver ->value of path
		//WebDriver driver = new ChromeDriver();
		
		//FireFox Launch
		//gecko driver
		System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\jdk-19\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
