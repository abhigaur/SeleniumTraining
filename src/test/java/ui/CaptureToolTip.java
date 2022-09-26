package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureToolTip {
	static WebDriver driver;
	// static WebDriverWait wait;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.cssSelector(".you-tube"));
		
		//Actions action= new Actions(driver);
		
		String expected="YouTube";
		 String actualResult = element.getAttribute("title");
		 
		 Assert.assertEquals(actualResult, expected);
		 
		 System.out.println("Pass");

	}

}
