package testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ComposeMailPage;
import pages.LogInPage;

public class BaseTests  {

	
	public static WebDriver driver;
	public LogInPage lip;
	public ComposeMailPage cmp;
	
	@BeforeSuite
	public void beforeSuite() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXhrWklvgsT_w7UzoXRLa37btnAvGtI35V34MqUmHT7QnosiM3xQACeCpIsiCxkzRqZehZgT&osid=1&passive=1209600&service=mail");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@BeforeClass
	public void createObject() {
		
		lip = new LogInPage(driver);
		cmp = new ComposeMailPage(driver);
		
	}
	
	
}
