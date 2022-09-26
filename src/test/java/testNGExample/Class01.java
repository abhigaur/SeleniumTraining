package testNGExample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class01 {

	@BeforeTest
	public void login()
	{
		System.out.println("this is login test, before test annotation");
	}
	
}
