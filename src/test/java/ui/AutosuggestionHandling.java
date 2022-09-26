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

public class AutosuggestionHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.adda247.com");
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("ssc");
		 
		 Thread.sleep(2000);
		 
		// driver.findElement(By.xpath("//div[@class='autosuggestion-item'][1]")).click();
		 
		 // To get list for all auto suggestion
		 
		 
		 
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='autosuggestion-item']"));
		 
		 System.out.println("Size of list is"+list.size());
		 
		 for(WebElement test:list)
		 {
			
			 
			 String testt = test.getText();
			
			 //System.out.println( test.getText());
			 
			 if(testt.equalsIgnoreCase("Adda Prime Test Pack (Validity 12 Months)"))
			 {
				 test.click();
				//System.out.println( testt);
				 break;
			 }
		 }
		 
			}

}
