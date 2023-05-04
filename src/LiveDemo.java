import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		
		
		//compare original list vs sorted list
		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all webelements into list
		List<WebElement> vegieNames=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new (original) list
		List<String> originalList=vegieNames.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3-> sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> getPrice;
		
		//scan the name column with get Text -> Beans ->Print the price of the rice
		do
		{
		     List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		     getPrice=rows.stream().filter(s->s.getText().contains("Rice")).
		      map(s->getPriceVeggie(s)).collect(Collectors.toList());
		getPrice.forEach(a->System.out.println(a));
		if(getPrice.size()<1) 
		{
		     driver.findElement(By.xpath("//a[contains(@aria-label,'Next')]")).click();	
		}
		}while(getPrice.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
