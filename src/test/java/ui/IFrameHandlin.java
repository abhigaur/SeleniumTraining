package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandlin {

	static WebDriver driver;
	// static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();

		Thread.sleep(4000);
		WebElement fra = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/21778185301/Store_Craosual_0']"));
		driver.switchTo().frame(fra);
		
         
System.out.println("Switch to frame");
		//WebElement slider = driver.findElement(By.xpath("//img[starts-with(@src,'https://tpc.googlesyndication.com/simgad')]"));
		
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[starts-with(@src,'https://tpc.googlesyndication.com/simgad')]"))).click();




	}

}
