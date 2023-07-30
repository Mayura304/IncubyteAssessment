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
		driver.get("https://accounts.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@BeforeClass
	public void createObject() {
		
		lip = new LogInPage(driver);
		cmp = new ComposeMailPage(driver);
		
	}
	
	
}
