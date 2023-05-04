import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//broken URL
		//STEp-1 : IS to get all URL's tied up to the links Selenium
		 //Java Methods will call URl's and gets you the status code
		 //if status code is > 400 then that URL is not working-> link which tied to URL is broken
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.cssSelector("li[class ='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) 
		{
			
			String url = link.getAttribute("href");
			//Return type                              // class      //Method
			  //  |                                        |            |
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection(); 
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The Link with Text"+link.getText()+" is broken with code"+respcode);
			
			
		}
		
		a.assertAll();
		
		
		
		
		
		
		
		
		
		
	}

}
