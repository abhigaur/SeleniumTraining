package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	static WebDriver driver;

	// static String browser = "IE";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//div[@class='login-btn']"));

		// Right click
		
		  Actions action = new Actions(driver); 
		  action.contextClick(element).perform();
		 


	}

}
