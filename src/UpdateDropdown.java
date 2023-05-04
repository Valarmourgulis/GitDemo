

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(false)
		//System.out.println(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
		System.out.println("it's Enabled");
		Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("it's Disabled");
		Assert.assertFalse(false);
		}
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		
		
		
		
		
		
		
		//count the number of checkboxes
		/*System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/
		
		/*for (int i=2;i<5;i++); 
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/
		
	}

}
