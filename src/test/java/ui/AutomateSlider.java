package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSlider {

	static WebDriver driver;

	// static String browser = "IE";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();

		WebElement	frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frame);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='green']/span"));

		
		
		  Actions action = new Actions(driver); 
		  action.dragAndDropBy(element, -100, 111).perform();
		 


	}

}
