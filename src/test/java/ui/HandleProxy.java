package ui;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleProxy {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// proxy is the layer of security between client and server, its act like firewall
		//used between client send request and wait for get response, between popup come to validate
		
		//can be handle by action class or autoit
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/basic_auth.php");
	
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("guru99");
		 driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		 driver.switchTo().alert().sendKeys("guru99");
	        driver.switchTo().alert().accept();
		
		

	}

}
