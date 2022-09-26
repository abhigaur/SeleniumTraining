package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown1 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		
		 * WebElement dp = driver.findElement(By.xpath("//select[@name='country']"));
		 * 
		 * Select select= new Select(dp);
		 * 
		 * select.selectByIndex(3);
		 * 
		 * 
		 * select.selectByValue("ANTARCTICA");
		 * 
		 * select.selectByVisibleText("ARUBA");
		 */
		
		// Multiple Select options 
		
		
		// user methods for select and desect all for 
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
		
		
		
		WebElement dp = driver.findElement(By.xpath("//select[@name='demo_multiple']"));
		 
		  Select select= new Select(dp);
		  
		 List<WebElement> test = select.getOptions();
		
		 System.out.println( test.size());
		 
		// System.out.println(test.get(5));
		 
	
			/*
			 * select.selectByValue("One");
			 * 
			 * select.selectByVisibleText("Nine");
			 */		
		

	}

}
