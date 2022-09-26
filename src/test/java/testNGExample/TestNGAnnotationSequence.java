package testNGExample;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationSequence {
	
	
	
	@BeforeMethod
	public void test3()
	{
		System.out.println("BeforeMethod");
	}
	
	@BeforeTest
	public void test4()
	{
		System.out.println("BeforeTest");
	}
	
	@Test
	public void test5()
	{
		System.out.println("Test annotaation");
	}
	
	@Test
	public void method()
	{
		System.out.println("This is method");
	}
}
