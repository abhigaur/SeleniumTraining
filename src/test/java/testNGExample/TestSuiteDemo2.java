package testNGExample;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteDemo2 extends TestSuiteDemo{
	
	
	
	
	@Test
	public void LoginTest()
	{
		System.out.println("this is test in TestSuiteDemo2  class ");
	}
	
	@Test
	public void LoginTest2()
	{
		System.out.println("this is test2 in TestSuiteDemo2  class ");
	}

	
	

}
