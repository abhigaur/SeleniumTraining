package dataProviderTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	// just pass the class name in @Test , if dataprovider has in different class
	
	@Test(dataProvider = "datasetLogin",dataProviderClass = DataProviderDemo.class)

	public void useData(String userName, String pass) {
		/*
		 * WebDriver driver; WebDriverManager.chromedriver().setup(); driver = new
		 * ChromeDriver();
		 * 
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		 * driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 * 
		 * driver.close();
		 */

		System.out.println("test");
	}

}
