package testNGExample;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteDemo {
	
	
	@BeforeSuite
	public void setupProcess()
	{
		System.out.println("This is process setup");
	}
	

	@AfterSuite
	public void setupTearDown()
	{
		System.out.println("This is process setup TearDown");
	}
	
	
	@Test
	public void test01()
	{
		System.out.println("this is test 01");
	}

	
	

}
