package dataProviderTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDataProviderTest {

	
	@Test(dataProvider = "datasetLogin",dataProviderClass = MultipleDataProviderDemo.class)

	public void useData(String userName, String pass) {
	

		System.out.println("test");
	}
	
	
	@Test(dataProvider = "datasetLogin",dataProviderClass = MultipleDataProviderDemo.class)

	public void useData1(String userName, String pass,String abc) {
	

		System.out.println("test");
	}

	
	
	
	
	
}
