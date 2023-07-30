package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeMailPage {

	WebDriver driver;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div") WebElement composebutton;
	@FindBy(xpath="(//*[text()='To'])[2]") WebElement tofield;
	@FindBy(xpath="(//*[text()='Cc'])[3]") WebElement ccfield;
	@FindBy(xpath="(//*[text()='Bcc'])[3]") WebElement bccfield;
	@FindBy(xpath="(//*[@name='subjectbox'])[2]") WebElement subjectfield;
	@FindBy(xpath="//*[@role='textbox']") WebElement textboxfield;
	@FindBy(xpath="//*[@class='a1 aaA aMZ']") WebElement attachmentfield;
	@FindBy(xpath="//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']") WebElement sendbutton;


	public ComposeMailPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String composeButton() {

		String buttonlabel = composebutton.getText();
		return buttonlabel;
	}

	public void composeButtonClick() {

		composebutton.click();
	}

	public String toField() {

		String tolabel = tofield.getText();
		return tolabel;

	}

	public void toFieldClick(String toemail) {

		tofield.sendKeys(toemail);
	}

	public String ccField() {

		String tolabel = ccfield.getText();
		return tolabel;

	}

	public void ccFieldClick(String ccemail) {

		tofield.sendKeys(ccemail);
	}

	public String bccField() {

		String tolabel = bccfield.getText();
		return tolabel;

	}

	public void bccFieldClick(String bccemail) {

		tofield.sendKeys(bccemail);
	}

	public void subjectField(String subject) {

		subjectfield.sendKeys(subject);
	}

	public void textboxField(String body) {

		textboxfield.sendKeys(body);
	}
	
	public void attachmentField() {
		
		attachmentfield.sendKeys(System.getProperty("user.dir")+"//testsdata//resume.pdf");
	}
	
	public String sendButton() {

		String buttonlabel = sendbutton.getText();
		return buttonlabel;
	}

	public void sendbuttonclick() {

		sendbutton.click();
	}




}
