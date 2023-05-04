package mytest;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void WebloginHomeloan() 
	{
	   //selenium	
		System.out.println("webLoginHome");
	}

	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() 
	{
		//appium
		System.out.println("LoginHome");
	}
	
	@Test
	public void LoginApIHomeLoan() 
	{
		//Rest API notations
		System.out.println("APIHomeLogin");
	}
}
