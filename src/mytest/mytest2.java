package mytest;

import org.testng.annotations.Test;

public class mytest2 {
	
	@Test(dependsOnMethods= {"forMethod","choice"})
	public void getDisplay() {
		System.out.println("Well done");
		
		
	}
	@Test
	public void choice() {
		System.out.println("Vendetta");
	}
	
	@Test
	public void forMethod() 
	{
	     System.out.println("Be Aware");	
	}

}
