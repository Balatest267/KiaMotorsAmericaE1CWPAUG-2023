package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P3_ForgotPassword  extends KMABase {

	public P3_ForgotPassword(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		waitUntilElementVisisble("//*[@id='header-signIn']");
		if(!verifyTitle("Kia Owners Portal")){
			reportStep("This is not Kia Owners Portal", "FAIL");	
		}		
}
	
	
	public P3_ForgotPassword clickForgotPassword() {
		clickByLink("FORGOT PASSWORD");
		Assert.assertTrue(driver.findElement(By.id("resetIconClick")).isDisplayed());
		return this;
	}


}
	

	