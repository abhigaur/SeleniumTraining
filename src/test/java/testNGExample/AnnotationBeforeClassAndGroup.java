package testNGExample;

import org.junit.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class AnnotationBeforeClassAndGroup {

	// Berfore class and after class work in same class
	
	@BeforeClass()
	public void test1()
	{
		System.out.println(" before class");
	}
	@BeforeGroups(value="sanity")
	public void beforeGroupMethod()
	{
		System.out.println(" before groups");
	}
	@AfterGroups(value="sanity")
	public void afterGroups()
	{
		System.out.println(" after groups");
	}
	
	@Test
	public void test2()
	{
		System.out.println(" test2");
	}
	
	@Test(groups="sanity")
	public void test3()
	{
		System.out.println(" test 3");
	}
	
	@Test(groups="regression")
	public void test5()
	{
		System.out.println(" test5");
	}
	
	
	@org.testng.annotations.AfterClass
	public void test4()
	{
		System.out.println(" AfterClass");
	}
	
}
