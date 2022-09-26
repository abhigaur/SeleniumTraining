package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvent {

	static WebDriver driver;

	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();

		WebElement	source=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre"));
		WebElement	destination=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
		
		

		  Actions action = new Actions(driver); 
		 action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		 action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		//WebElement element = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

		
		
		 


	}

}
