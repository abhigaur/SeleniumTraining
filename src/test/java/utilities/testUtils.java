package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import commons.BaseTest;

public class testUtils extends BaseTest {

	public void getScreenShot() {

		
		//driver.get("https://www.w3schools.com/");
		Date date = new Date();

		String timee = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(timee);

		// File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot screenShot = ((TakesScreenshot)driver);
		File soruce = screenShot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(soruce, new File(".//screenshot//" + "test" + timee + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * testUtils t= new testUtils(); t.getScreenShot();
	 * 
	 * }
	 */
}