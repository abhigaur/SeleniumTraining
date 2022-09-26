package testNGExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTask {
	
	@Test()
	public void test() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.reliancedigital.in/");
	driver.manage().window().maximize();

	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	

	WebElement element = driver.findElement(By.xpath("//div[text()='Accessories']"));
	
	//element.click();
	Actions action = new  Actions(driver);
	action.moveToElement(element).build().perform();
	 System.out.println("hover done ");
	 
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement> elmetns = driver.findElements(By.xpath("//*[@id=\"RIL_AccessoriesNavigationNode\"]/div[2]/div/div[1]/ul[2]/li/a"));
	/*
	 * elmetns.iterator(); element.getText();
	 */
	
	Thread.sleep(3000);
	for(WebElement ecre:elmetns)
	{
		//Smart Cameras
		
		if(ecre.getText().equalsIgnoreCase("Smart Cameras"))
		{

			//Thread.sleep(3000);
			ecre.click();
			break;
		}
		
		
	}
	
	
	
	
	}
}
