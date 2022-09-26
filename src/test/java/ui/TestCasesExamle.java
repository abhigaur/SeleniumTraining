package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesExamle {
	
	
	@Test
	public void testcase1()
	{
		System.out.println("this is test case1");
	}
	
	@Test
	public void testcase4()
	{
		System.out.println("this is test case4");
		Assert.assertTrue(false);
	}

	
	@Test
	public void testcase2()
	{
		System.out.println("this is test case2");
	}

	@Test
	public void testcase3()
	{
		System.out.println("this is test case3");
	}


}
