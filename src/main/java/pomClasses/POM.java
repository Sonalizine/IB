package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	@FindBy(xpath="//input[@id='email']") private WebElement uid;
	@FindBy(xpath="//input[@id='pass']") private WebElement pwd;
	@FindBy(xpath="//button[@name='login']") private WebElement btn;
	
	public POM(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterUsername(String uname) {
		uid.sendKeys(uname);
	}
	public void EnterPass(String pass) {
		pwd.sendKeys(pass);
	}
	public void ClicKbutton() {
		btn.click();
	}

}
