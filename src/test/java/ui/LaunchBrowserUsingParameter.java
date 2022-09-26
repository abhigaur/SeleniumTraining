package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchBrowserUsingParameter {
	
	

	
	
	@Parameters({"browser"})
	
	@Test
	public void launchBrowser1(String browser)
	{	 

		
		if(browser=="chrome") {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
				driver.get("https://codewithharry.com/");
				driver.manage().window().maximize();
			
			
		}
		

	}
	

}
