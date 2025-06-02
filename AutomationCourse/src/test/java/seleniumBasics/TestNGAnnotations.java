package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations
{

	//how to generate test scripts
	// to convert the normal method to test method we use annotation(@)-@Test
	//@test annotation only have run and debug no other annotation would have such usages
	@Test
	public void testCase()
	{
		System.out.println("Test Case");
	}
	
	
	//2nd annotation
	//the browser initilization and other functions which need to be perform before the test scripts can be added in 
	//before method
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	
	//3rd annotation
	//the methods where the function which need to be performed after test case can be added in afterMethod
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After Method");
	}
	
	
	//4th annotation
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Method");
	}
	
	
	
	//5th annotation
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Method");
	}
	
	
	@BeforeClass
	//5th annotation
	public void beforeClass()
	{
		System.out.println("Before class  Method");
	}
	
	
	@AfterClass
	//6th annotation
	public void afterClass()
	{
		System.out.println("After class  Method");
	}
	
	@BeforeSuite
	//7th annotation
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@AfterSuite
	//8th annotation
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
