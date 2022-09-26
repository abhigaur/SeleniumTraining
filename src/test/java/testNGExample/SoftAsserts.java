package testNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAsserts {
	
	@Test
 
	// Soft Assert ,if any test fail then below line will execute
	void testTitle()
 {
	 WebDriver driver;
	 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		
		SoftAssert assertss = new SoftAssert();
		
		String expectedTitle="Adda247 - India’s Largest Vernacular Test Prep Platform";
		String actualTitle=driver.getTitle();
		
		assertss.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("This is first assert");
		
		String actualLogoTitle = driver.findElement(By.xpath("//img[@class='logo-img']")).getAttribute("Title");
		String expectedLogo="adda247";
		
		assertss.assertEquals(actualLogoTitle, expectedLogo);
		System.out.println("Second assert Pass");
		
		
		assertss.assertAll();
		//driver.close();
		
		
 }
	

}
