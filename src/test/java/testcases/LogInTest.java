package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadDataFromPropFile;

public class LogInTest extends TestNGListeners {
	
	@Test()
	public void logInValidate() throws IOException {
		
		lip.logIn(ReadDataFromPropFile.readConfigData("emailid"), ReadDataFromPropFile.readConfigData("password"));
		
	}

}
