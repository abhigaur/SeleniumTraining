package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	
	@Test
	public void report01()
	{
		System.out.println("this is report01");
		Reporter.log("test report");
		
		Reporter.getCurrentTestResult();
	}
	
	@Test
	public void report02()
	{
		System.out.println("this is report02");
	}
	
	@Test
	public void report03()
	{
		System.out.println("this is report03");
	}
	
	@Test
	public void report04()
	{
		System.out.println("this is report04");
	}

}
