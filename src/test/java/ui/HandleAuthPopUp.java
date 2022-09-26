package ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthPopUp {

	
	// static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		

	}

}
