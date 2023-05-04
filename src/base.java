import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-19\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait w = new WebDriverWait(driver,5);
		
		String[] veggies= {"Cucumber","Brocolli","Beetroot","Beans"};
	
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		addItems(driver, veggies);
		base b=new base();
		addItems(driver, veggies);
		
		
		
		
		
		
		
		
		
		
		
		
	    }
		public static void addItems(WebDriver driver,String[] veggies) throws InterruptedException 
		
		{
			
			int j=0;
		
	    List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name")); 
	    
	    for(int i=0;i<products.size();i++) 
	    {
	    	String[] name=products.get(i).getText().split("-");
	    	String formattedName=name[0].trim();
	    	
	    	
	    	//check whether name you extracted is present in array or not.
	    	//convert array into Array list for easy search
	    	List veggieList = Arrays.asList(veggies);
	    	int veg = veggieList.size();
	    	System.out.println(veg);
	    	
	    	
	    if(veggieList.contains(formattedName)) 
	    	{
	    	j++;
	    		driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
	    		if(j==4)
	    		{
	    			driver.findElement(By.cssSelector("a.cart-icon")).click();
		    		
		    		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		    		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']"));
		    		
		    		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		    		
		    		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		    		//explicit Wait
		    		
		    		//w.until(ExpectedConditions.visibilityOfElementLocated(null));
		    		
		    		
		    		
		    		
		    		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		    		
		    		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")).click();
		    		
		    		driver.findElement(By.xpath("//option[@value='India']")).click();
		    		driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
		    		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		    		
	    		break;	
	    		}
	    		
	    		
	    		
	    		
	    	}
	    
	}

	}
	
	

}

   
