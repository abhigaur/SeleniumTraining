package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCapture {

	static WebDriver driver;

	// static String browser = "IE";

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");
		//driver.manage().window().maximize();
		
		Date date= new Date();
		
		String timee = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(timee);
	
		
//Take screen shot
		
		
		//File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 TakesScreenshot screenShot = ((TakesScreenshot)driver);
		File soruce = screenShot.getScreenshotAs(OutputType.FILE);
		
	FileUtils.copyFile(soruce, new File(".//screenshot//" + "test"+timee +".png"));

	}

}
