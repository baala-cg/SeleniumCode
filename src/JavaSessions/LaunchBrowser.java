package JavaSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//FF Browser
		//geckodriver
		//launch browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JyothiKrishna\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String tit = driver.getTitle();
		
		System.out.println(tit);
		   //   new FirefoxDriver(); //Creating new Object in FirefoxDriver class
		   //   WebDriver driver // an Interface driver is created
		
		
		
		
	}

}
