package mytest;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is a Interface which implements TestNG listners

public class Listeners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	   //System.out.println("I Successfuly executed Listeners Pass code");
	
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		//response if API is Failed
		//Screenshot code 
		
	   System.out.println("I Failed executing Listeners Pass code"+ result.getName());	
	}

}
