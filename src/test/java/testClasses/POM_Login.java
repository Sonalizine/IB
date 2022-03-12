package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configurations.Configuration;
import pomClasses.POM;

public class POM_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		POM pm=new POM(driver);
		pm.EnterUsername("sonali");
		pm.EnterPass("12435");
		pm.ClicKbutton();
		
		
		

	}

}
