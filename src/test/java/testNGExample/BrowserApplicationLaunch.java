package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bsh.This;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserApplicationLaunch {
	
	WebDriver driver;
@Parameters({"browser"})
	@Test
	public void launchBr(String browserrs) {
	System.out.println("test");

		if (browserrs.equalsIgnoreCase("chrome")) {
			System.out.println("test1");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://codewithharry.com/");
			driver.manage().window().maximize();

		
		}
	}

}
