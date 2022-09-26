package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://staging.adda247.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("SSC Adda");
		

		driver.findElement(By.xpath("//input[@id='searchBar']")).click();
		System.out.println("clicked");
		//driver.findElement(By.xpath("//input[@id='searchBar']")).clear();
		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys(Keys.DELETE);
		
		System.out.println("All element geting clear");
		
		
	String attribute = driver.findElement(By.xpath("//input[@id='searchBar']")).getAttribute("class");
	System.out.println(attribute);
		
		//driver.close();
		
		
		
		

	}

}
