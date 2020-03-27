package JavaSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		Properties prop =new Properties();
		
		FileInputStream ip =new FileInputStream("C:\\Users\\JyothiKrishna\\eclipse-workspace\\nonMavenProject\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		
		prop.getProperty("name");
		
		String brow = prop.getProperty("browser");
		
		String url = prop.getProperty("Url"); 
		//Firefox browser
		
		if(brow.equalsIgnoreCase("Firefox")) {
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JyothiKrishna\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 System.out.println("Firefox driver launched successfully");
		}
		else if (brow.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JyothiKrishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(options);
		System.out.println("Chrome driver launched successfully");		
		}
		else if (brow.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\JyothiKrishna\\Downloads\\IEDriverServer.exe");
			 driver= new InternetExplorerDriver();
			System.out.println("IE driver launched successfully");		
			}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		//driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
