package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermethods {

	static WebDriver driver;

	static String browser = "chrome";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
if(browser=="chrome") {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		
		else if(browser=="mozila") {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver= new FirefoxDriver();
			
		}
		
else if(browser=="IE") {
			
			WebDriverManager.iedriver().setup();
			
			driver= new InternetExplorerDriver();
			
		}
		
	driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();


String windows = driver.getWindowHandle();
System.out.println("window for saucedemo"+windows);

driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");


driver.findElement(By.xpath("//input[@name='login-button']")).click();

String url=driver.getCurrentUrl();
System.out.println("current url is"+url);


List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item']"));
System.out.println(list);


driver.navigate().to("https://www.sugarcrm.com/");

String sugarwindow = driver.getWindowHandle();

driver.switchTo().window(sugarwindow);
System.out.println("window for sugarwindow"+sugarwindow);

	}

}
