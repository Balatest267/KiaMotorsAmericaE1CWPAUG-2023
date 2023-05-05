package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P8_Schedules extends KMABase {

	public P8_Schedules(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Schedules")){
			reportStep("This is not Schedules Page", "FAIL");	
		}		
	}
	
	public P8_Schedules createNewSchedule() throws InterruptedException {
		waitUntilElementVisisble("//*[@title='Create Schedule']");
		clickByXpathJavascriptExecutor("//*[@title='Create Schedule']");
		clickByXpathJavascriptExecutor("//*[@title='Create Climate Schedule']");
		waitElementToBeClickableXpathFW();
		//clickByXpathJavascriptExecutor("(//*[@class='ui-dial-temperateure'])[1]");
		clickByXpathJavascriptExecutor("//*[@class='ui-dial-temperateure']/span[2]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='createClimateForm']/ul/li[2]/div/div[2]/div/div[5]/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[@class='checkbox checkbox-round'])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='createClimateForm']/ul/li[6]/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@title='Save New Climate Schedule']");
		waitUntilElementVisisble("(//*[@class='modal-title'])[9]");
		clickByXpathJavascriptExecutor("(//*[@class='button main has-spinner'])[1]");
		waitUntilElementVisisble("(//*[@class='close'])[8]");
		return this;
	}
	

	
	
	public P8_Schedules updateSchedule() throws InterruptedException {
		waitUntilElementVisisble("//*[@title='Create Schedule']");			
		clickByXpathJavascriptExecutor("//*[@class='icon-settings climate']");
		waitUntilElementVisisble("//*[text()='Edit Climate Schedule  ']");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[@class='ui-dial-temperateure-text'])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='viewClimateForm']/ul/li[2]/div/div[1]/div/div[3]/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[@class='checkbox checkbox-round'])[5]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[text()='Turn This Schedule On '])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@title='Save Edit Climate Schedule']");
		//waitUntilElementVisisble("//*[@class='modal-title']");
		//clickByXpathJavascriptExecutor("(//*[@class='button main has-spinner dtmSaveEditSchedule'])[2]");
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this;
	}
	
	
	public P8_Schedules enableParentToggle() {
		waitUntilElementVisisble("//*[@title='Create Schedule']");
		clickByCSSTagClass("span[class='toggle tiny']");
		//clickByXpathJavascriptExecutor("(//span)[62]");
		waitUntilElementVisisble("(//*[@class='close'])[8]");
		verifyTextByXpath("(//span)[70]", "Active");
		
		return this;
	}

	public P8_Schedules deleteSchedule() {
		waitUntilElementVisisble("//*[@class='icon-settings climate']");
		clickByXpathJavascriptExecutor("//*[@class='icon-settings climate']");
		waitUntilElementVisisble("(//*[@class='icon-close'])[5]");
		clickByXpathJavascriptExecutor("//*[@title='Delete Climate Schedule']");
		waitUntilElementVisisble("//*[@title='Create Schedule']");
		return this;
	}
	

	
}
