package ui;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
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

public class FindAllLinkAndBrokenLink2 {

	static WebDriver driver;
	String urls;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://yepme.com/");
		driver.manage().window().maximize();

		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

		int size = listOfLinks.size();

		// Find Links

		/*
		 * for(WebElement link:listOfLinks) {
		 * 
		 * String urls = link.getAttribute("href"); System.out.println(urls); }
		 */

		// Find Broken Links

		for (WebElement link : listOfLinks) {

			String urls = link.getAttribute("href");

			if (isUrlValid(urls)) {

				verifyLinks(urls);
			}
			else {
		         System.out.println("Enter valid URL");
		      }

		}

	}

	public static boolean isUrlValid(String url) {
		try {
			URL obj = new URL(url);
			obj.toURI();
			return true;
		} catch (MalformedURLException e) {
			return false;
		} catch (URISyntaxException e) {
			return false;
		}
	}

	public static void verifyLinks(String urls) {

		try {
			URL link = new URL(urls);
			try {
				HttpURLConnection httpConnection = (HttpURLConnection) link.openConnection();

				httpConnection.setConnectTimeout(2000);
				// connect using connect method
				httpConnection.connect();

				if (httpConnection.getResponseCode() == 200) {
					System.out.println(urls + " - " + httpConnection.getResponseMessage());
				}
				if (!(httpConnection.getResponseCode() == 200)) {

					System.out.println(urls + " - " + httpConnection.getResponseMessage());
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}