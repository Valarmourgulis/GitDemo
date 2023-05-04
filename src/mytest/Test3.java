package mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@Test
	public void LoginApIcarLoan() 
	{
		//Rest API notations
		System.out.println("I will Execute Last");
		
	}
	
	@Parameters({"URL","APIkey/username"})
	@Test
	public void Weblogincarloan(String  urlname,String key) 
	{
		
	   //selenium	
		
		System.out.println("webLogincar");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	@AfterClass
	public void aftclass() 
	{
	    System.out.println("After Executing all Methods in class");	
	}
	
	@AfterMethod
	public void methodExcecutesFirsts() 
	{
	    System.out.println("Mai Jha Ata Hu Method wha se Excecute Hotein hai");	
	}
	@BeforeSuite
	public void Bfsuite() 
	{
	     System.out.println("I am number One");
	}

	@Test(dataProvider="getData")
	public void MobileLogincarLoan(String username,String password) 
	{
		//appium
		System.out.println("Mobile signout");
		System.out.println("username");
		System.out.println("password");
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		//1st combination - username password
		//2nd - username password - no credit history
		//3rd - fraudlent credit history
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="second password";
				
		//3rd set
		data[2][0]=	"thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
	
}
