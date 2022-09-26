package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserNew {

	
	static WebDriver driver;
	
	static String browser="IE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Software\\SeleniumSetup\\DriverExe\\chromedriver.exe");
		
		
		if(browser=="chrome") {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		
		else if(browser=="mozila") {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver= new FirefoxDriver();
			
		}
		
else if(browser=="IE") {
			
			WebDriverManager.iedriver().setup();
			
			driver= new InternetExplorerDriver();
			
		}
		
	driver.get("https://codewithharry.com/");
driver.manage().window().maximize();

	}

}
