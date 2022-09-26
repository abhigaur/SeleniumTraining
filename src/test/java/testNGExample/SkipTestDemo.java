package testNGExample;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestDemo {
	
	
	boolean dataSetup=false;
	
	@Test(enabled = false)
	public void skip1()
	{
		System.out.println("this is skip 1");
	}
	

	@Test
	public void skip2()
	{
		System.out.println("this is skip 2");
		
		throw new SkipException("throw exception in skip 2 forcefully");
	}

	@Test
	public void skip3()
	{
		System.out.println("this is skip 3, skip based on condition");
		
		if(dataSetup) {
			System.out.println("Execute skip 3");
		}
		
		else {
			throw new SkipException("this is skip due to condition not meet");
		}
	}

}
