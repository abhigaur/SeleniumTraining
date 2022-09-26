package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	
// @DataProvider(name="test")
	@DataProvider
	public Object[][] dataSet() {

		Object[][] data = new Object[3][2];

		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";

		data[1][0] = "locked_out_user";
		data[1][1] = "secret_sauce";

		data[2][0] = "standard_user";
		data[2][1] = "secret_sauce";


		return data;

	}
//@Test(dataProvider = "name")
	@Test(dataProvider = "dataSet")
	public void useData(String userName,String pass)
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.close();
		
		
	}
	
}
