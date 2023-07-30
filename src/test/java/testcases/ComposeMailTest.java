package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadDataFromPropFile;

public class ComposeMailTest extends TestNGListeners{
	
	@Test(priority = 1)
	public void composeButtonValidation() {
		
		String actualresult = cmp.composeButton();
		String expectedresult = "Compose";
		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@Test(priority = 2)
	public void composeButtonClickValidation() {
		cmp.composeButtonClick();
	}
	
	@Test(priority = 3)
	public void toFieldValidation() {
		String actualresult = cmp.toField();
		String expectedresult = "To";
		Assert.assertEquals(actualresult, expectedresult);
	}

	@Test(priority = 4)
	public void toFieldClickValidation() throws IOException {

		cmp.toFieldClick(ReadDataFromPropFile.readConfigData("toemail"));
	}

	@Test(priority = 5)
	public void ccFieldValidation() {

		String actualresult = cmp.ccField();
		String expectedresult = "Cc";
		Assert.assertEquals(actualresult, expectedresult);

	}

	@Test(priority = 6)
	public void ccFieldClick(String ccemail) throws IOException {
			
		cmp.ccFieldClick(ReadDataFromPropFile.readConfigData("ccemail"));
	}

	@Test(priority = 7)
	public void bccFieldValidation() {

		String actualresult = cmp.bccField();
		String expectedresult = "Bcc";
		Assert.assertEquals(actualresult, expectedresult);

	}

	@Test(priority = 8)
	public void bccFieldClickValidation() throws IOException {

			cmp.bccFieldClick(ReadDataFromPropFile.readConfigData("bccemail"));
	}

	@Test(priority = 9)
	public void subjectFieldValidation() throws IOException {
		
		cmp.subjectField(ReadDataFromPropFile.readConfigData("subject"));
	}

	@Test(priority = 10)
	public void textboxFieldValidation() throws IOException {

		cmp.textboxField(ReadDataFromPropFile.readConfigData("body"));
	}
	
	@Test(priority = 11)
	public void attachmentFieldValidation() {
		
		cmp.attachmentField();
	}
	
	@Test(priority = 12)
	public void sendButtonValidation() {

		String actualresult = cmp.sendButton();
		String expectedresult = "Send";
		Assert.assertEquals(actualresult, expectedresult);
	}

	@Test(priority = 13)
	public void sendbuttonclickValidation() {

		cmp.sendbuttonclick();
	}


}
