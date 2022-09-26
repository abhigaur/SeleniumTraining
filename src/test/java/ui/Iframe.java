package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {


	static WebDriver driver;
	// static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().alert().accept();
		
		String tt = driver.getTitle();
		
		System.out.println(tt);





	}


}
