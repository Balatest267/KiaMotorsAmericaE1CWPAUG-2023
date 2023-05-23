package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC002_Login extends KMABase {

		
	@Test(priority=1)
	public void verifySignInIsDisplayed() {
		new P2_Login(driver, test)
		.clickSignIn();
	}
	
	@Test(priority=2, dataProvider="fetchData")
	public void verifyLoginIn(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn();	
	}
	
	@Test(priority=3)
	public void verifyForgotPassword() throws InterruptedException{
	new P2_Login(driver, test)
	.clickSignIn()
	.clickForgotPassword();
	}
	
	
	@Test(priority=4, dataProvider="fetchData")
	public void verifyRememberMecheckbox(String emailId, String pwdLogin) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.rememberMe()
	.clkSignIn()
	.clickSettings()
	.clickLogout()
	.clickSignIn()
	.verifyEmailIdExists()
	.enterLoginPassword(pwdLogin)
	.clkSignIn();			// In this case, only email id is saved 
	
}
	

	@Test(priority=5, dataProvider="fetchData")
	public void Login_5440916(String emailId, String pwdLogin) throws InterruptedException{
		
	new P2_Login(driver, test)
	.clickSignIn()
	.verifySignInEnable();
}
	

	@Test(priority=6,dataProvider="fetchData")
	public void verifyLogout(String emailId, String pwdLogin) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickSettings()
	.clickLogout();	
	
	}
	
}
