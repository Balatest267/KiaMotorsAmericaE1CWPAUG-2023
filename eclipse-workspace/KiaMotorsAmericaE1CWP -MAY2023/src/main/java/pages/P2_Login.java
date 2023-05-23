package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P2_Login extends KMABase{

		public P2_Login(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test =test;
			waitUntilElementVisisble("//*[@id='header-signIn']");
			if(!verifyTitle("Kia Owners Portal")){
				reportStep("This is not Kia Owners Portal", "FAIL");	
			}		
		}
		
		
		public P2_Login clickSignIn() {
			clickByXpath("//*[text()=' SIGN IN ']");
			Assert.assertTrue(driver.findElement(By.id("resetIconClick")).isDisplayed());
			return this;	
		}
		
		
		public P2_Login enterLoginEmailId(String emailId) {
			waitVisibilityOfElementLocatedByName("userLoginId");
			enterByName("userLoginId", emailId );
			return this;
		}		
		
		public P2_Login enterLoginPassword(String pwdLogin) throws InterruptedException{
			waitVisibilityOfElementLocatedByName("userLoginPwd");
			enterByName("userLoginPwd", pwdLogin);
			return this;
		}
			
		
		public P4_MyVehicles clkSignIn() throws InterruptedException{
			clickByXpath("//*[@class='button full main has-spinner sign-in']");
			return new P4_MyVehicles(driver, test);
		}
		
		
		public P2_Login verifySignInEnable() {
			Assert.assertTrue(driver.findElement(By.id("//*[@class='button full main has-spinner sign-in']")).isDisplayed());
			return this;
		}
		
		public P3_ForgotPassword clickForgotPassword() {
			clickByLink("FORGOT PASSWORD");
			Assert.assertTrue(driver.findElement(By.id("resetIconClick")).isDisplayed());
			return new P3_ForgotPassword(driver, test);
		}
		
		public P2_Login rememberMe() {
			clickByXpath("(//*[@class='checkbox'])[1]");
			return this;
		}
		
		
		public P2_Login verifyEmailIdExists() {
			Assert.assertTrue(driver.findElement(By.name("userLoginId")).isDisplayed());
			return this;
		}
		
	
		
		
}
		

