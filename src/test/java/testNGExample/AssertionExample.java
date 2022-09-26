package testNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	
	@Test
 
	// hard assert if any assert fail then its not execute below line code ,Fail entire test 
	void testTitle()
 {
	 WebDriver driver;
	 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		
		String expectedTitle="Adda247 - India’s Largest Vernacular Test Prep Platform";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		String actualLogoTitle = driver.findElement(By.xpath("//img[@class='logo-img']")).getAttribute("Title");
		String expectedLogo="adda247";
		
		Assert.assertEquals(actualLogoTitle, expectedLogo);
		
		//driver.close();
		
		
 }
	

}
