package mytest;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups = {"Smoke"})
	public void myGame() 
	{
		System.out.println("Hello");
	}
	
	@Test
	public void Afsuite() 
	{
		System.out.println("From The last i am  first");
		 Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void prequiste() 
	{
	     System.out.println("I Will Excecute First");	
	}

}
