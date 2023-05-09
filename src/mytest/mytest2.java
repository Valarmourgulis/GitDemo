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
		System.out.println("Valardohairis");
	}
	
	@Test
	public void forMethod() 
	{
	     System.out.println("Be Aware");	
	     System.out.println("Homonculis");
	}

}
