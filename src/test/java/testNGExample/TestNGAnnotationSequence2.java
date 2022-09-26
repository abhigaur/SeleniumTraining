package testNGExample;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationSequence2 {
	
	
	@BeforeSuite
	public void test11()
	{
		System.out.println("BeforeSutieAnnotation");
	}

	@BeforeClass
	public void test21()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void test31()
	{
		System.out.println("BeforeMethod");
	}
	
	@BeforeTest
	public void test41()
	{
		System.out.println("BeforeTest");
	}
	
	@Test
	public void test51()
	{
		System.out.println("Test annotaation");
	}
}
