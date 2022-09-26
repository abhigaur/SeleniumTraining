package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddaTableHandle {

	static WebDriver driver;

	// static String browser = "IE";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();

		 List<WebElement> element = driver.findElements(By.xpath("//div[@class='exam-item-card']/span"));

		int size = element.size();
		 
		
		for(WebElement test: element)
		{
			String examName = test.getText();
			System.out.println(examName);
			
			if(examName.equalsIgnoreCase("IBPS SO"))
			{
				test.click();
				break;
			}
		}


	}

}
