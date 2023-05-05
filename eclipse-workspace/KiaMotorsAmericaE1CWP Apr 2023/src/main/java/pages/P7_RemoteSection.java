package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P7_RemoteSection extends KMABase {
	
	public P7_RemoteSection(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//waitUntilElementVisisble("//*[@class='icon-info']");
		if(!verifyTitle("Remote")) {
			reportStep("This is not Remote Page", "FAIL");
		}
	}
		
		public P7_RemoteSection clickDoorUnLockRS()  {
			waitVisibilityOfElementLocatedByID("securitytab");
			clickByXpathJavascriptExecutor("//*[@class='remote-security-unlock action-button state-1']");
			waitVisibilityOfElementLocatedByXpath("(//*[@class='close'])[5]");
			return this;		
	}
		
		
		public P7_RemoteSection clickDoorLockRS() {
			waitVisibilityOfElementLocatedByID("securitytab");
			clickByXpathJavascriptExecutor("//*[@class='remote-security-lock action-button state-2 trigger-remote-error active']");
			waitVisibilityOfElementLocatedByXpath("(//*[@class='close'])[5]");
			return this;
		}
		
		
		public P7_RemoteSection remoteScheduleIsDisplayed() {
			waitVisibilityOfElementLocatedByID("securitytab");
			clickById("climatetab");
			waitElementToBeClickableXpathFW();
			//waitUntilElementVisisble("(//*[@class='last-refreshed'])[2]");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@class='remote-footer-card climate-schedule']")).isDisplayed());
			return this;
		}
		
		
		
		public P7_RemoteSection clickRemoteStartRS() {
			waitVisibilityOfElementLocatedByID("securitytab");
			clickById("climatetab");
			waitElementToBeClickableXpathFW();
			doubleClick("(//*[@class='down'])[1]");
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("//*[@id='remotebody']/div/div[2]/div[3]/div[1]/div/div[2]/span/label/span");
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("//*[@id='remotebody']/div/div[2]/div[3]/div[3]/div/div[2]/span/label");
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("/html/body/div[1]/div/remote/div[2]/div[2]/climate/div[1]/div[3]/div/span/label/span");
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("//*[@class='action-button state-1 show-warning remote-start']");
			waitVisibilityOfElementLocatedByXpath("(//*[@class='close'])[8]");
			return this;
		}
		
		
		public P7_RemoteSection clickRemoteStopRS() {
			waitVisibilityOfElementLocatedByID("securitytab");
			clickById("climatetab");
			clickByXpathJavascriptExecutor("//*[@class='action-button state-2 active trigger-remote-error remote-stop']");
			waitVisibilityOfElementLocatedByXpath("(//*[@class='close'])[8]");
			return this;
		}
		
	

}
