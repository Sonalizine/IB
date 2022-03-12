package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import configurations.Configuration;

public class Browser {
	
	public static  WebDriver driver;
 @BeforeClass
 public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
	 driver= new ChromeDriver();
		
	 driver.get(Configuration.appURL);
	 driver.manage().window().maximize();
	 
 }
 @AfterClass
 public void quit() {
	 driver.quit();
 }

}
