package testNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DbConnection {
	
	
	@BeforeTest
	public void lauchBrowser()
	{
		System.out.println("Browser Launched");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Browser Close");
	}
	
	@BeforeMethod
	public void test01()
	{
		System.out.println("BD connect");
	}
	@AfterMethod
	public void test02()
	{
		System.out.println("DB disconnected");
	}
	@Test(priority = 2)
	
	public void testCase1()
	{
		System.out.println("Test case1");
	}
	
	@Test(priority = 1)
	
	public void testCase2()
	{
		System.out.println("test case2");
	}

}
