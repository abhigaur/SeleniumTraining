package ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	
	// static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in");
		driver.manage().window().maximize();
		
		
		//WebElement test = driver.findElement(By.xpath("//*[@id=\"mainnnnnnnnnn\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/span/a"));
		
		List<WebElement> test1 = driver.findElements(By.xpath("//*[@id=\"mainnnnnn\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/span/a"));
		
		//System.out.println("Single webdriver"+test);

	System.out.println("multiple webdriver"+test1);
		

	}

}
