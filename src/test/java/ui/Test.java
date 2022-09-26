package ui;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Test {
	
	static String url= "tps://www.softwaretestingmaterial.com/broken-links-using-selenium/";
	
	public static boolean isUrlValid( String url) {
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

	
	public static void main(String[] args) {
		
		
		//boolean test = isUrlValid(url);
		
		//System.out.println(test);
		
		if(isUrlValid(url))
		{
			System.out.println("good url");
		}
		else {
			System.out.println("incorrect url");
		}
	}

}
