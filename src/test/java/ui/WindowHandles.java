package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	static WebDriver driver;
	// static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		

		Iterator<String> itr = allWindows.iterator();
		
		String firstWindows = itr.next();
		String secondWindows = itr.next();
		
		driver.switchTo().window(secondWindows);
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("abhilahd");

		
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("gaur");
		
		driver.switchTo().window(firstWindows);
		

	}

}
