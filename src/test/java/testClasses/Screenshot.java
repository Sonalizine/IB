package testClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import configurations.Configuration;

public class Screenshot {
	public static WebDriver driver;
	@BeforeClass
	 public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
		 driver= new ChromeDriver();
	}
	
	@AfterClass
	public void Screenshot1() throws IOException  {
		    
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File dest=new File("C:\\Users\\tusha\\Desktop\\Software Testing\\Automation note\\Screenshot\\image5.jpg");
			 FileHandler.copy(src, dest);
	}
	@Test
	public void TC01() {
		
		driver.get(Configuration.appURL);
		driver.manage().window().maximize();
		System.out.println("passed");
		
	}

}
