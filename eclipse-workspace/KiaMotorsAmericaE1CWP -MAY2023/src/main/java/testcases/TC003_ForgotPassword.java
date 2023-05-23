package testcases;


import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC003_ForgotPassword extends KMABase {
	
	
	@Test(priority=1)
	public void forgotPassword() throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.clickForgotPassword();
	
	}
}
