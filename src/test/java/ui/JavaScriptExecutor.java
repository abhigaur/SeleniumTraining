package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	static WebDriver driver;

	// static String browser = "IE";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		
		 
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		
		// get the title
		
		String titleScript= "return document.title;";
		
		String title = (String)jse.executeScript(titleScript);
		
		System.out.println(title);
		
		// Clcik on button 
		
		
		driver.switchTo().frame("iframeResult");
		
		
		jse.executeScript("myFunction()");
		
		driver.switchTo().alert().accept();
		
		// highlight button 
		
		
	WebElement	elem=driver.findElement(By.xpath("/html/body/button"));
		jse.executeScript("arguments[0].style.border='3px solid red';", elem);
		
		
		//Scroll down to bottom
		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement scroll = driver.findElement(By.xpath("//a[@class='w3-button tut-button ws-black w3-padding-16 w3-mobile vl-howtobtn']"));
		
		jse.executeScript("arguments[0].scrollIntoView();", scroll);
		//jse.executeScript(titleScript, args)
    }

		 
		
		
	

}
