package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver driver;
	@FindBy(xpath="//*[@id='identifierId']") WebElement enterusername;
	@FindBy(xpath="//*[@type='button'])[3]") WebElement nextbutton;
	@FindBy(xpath="//*[@name='password']") WebElement enterpassword;
	@FindBy(xpath="//*[text()='Next']") WebElement nextbutton2;

	public LogInPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logIn(String username, String password) {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		enterusername.sendKeys("username");
		nextbutton.submit();
		enterpassword.sendKeys("password");
		nextbutton2.submit();
	}
	


}
