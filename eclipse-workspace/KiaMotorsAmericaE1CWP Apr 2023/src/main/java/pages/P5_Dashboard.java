package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P5_Dashboard extends KMABase {
	

	public P5_Dashboard(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		waitUntilElementVisisble("//*[@class='icon-info']");
		if(!verifyTitle("Dashboard")){
			reportStep("This is not Dashboard Page", "FAIL");	
		}		
	}
	

	public P5_Dashboard clickDoorUnLock() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//span[@class='action-button state-1 btn-unlock']");
		waitUntilElementVisisble("(//*[text()='The remote command for unlock executed successfully.'])[1]");
		return this;
	}
	
	
	
	public P5_Dashboard clickDoorlock() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@class='action-button state-2 btn-lock']");
		waitUntilElementVisisble("(//*[@class='close'])[7]");
		return this;
	}
	
	//--------------------Remote Climate----------------------------------------- 
	
	public P5_Dashboard clickRemoteStartStop() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@class='action-button active btn-climate']");
		waitElementToBeClickableXpathFW();
		doubleClick("(//span[@class='up'])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='edit-climate-schedule-modal-slider']/div/div[1]/div/form/ul/li[2]/div/div[1]/div/div[3]/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='edit-climate-schedule-modal-slider']/div/div[1]/div/form/ul/li[4]/div/div/label[2]/div/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[@class='button main']");
		/*waitUntilElementVisisble("//*[@id='ventilation-warning-okbtn']");
		clickById("ventilation-warning-okbtn");*/
		waitUntilElementVisisble("(//*[@class='close'])[7]");
		return this;
		
	}
	
	
	public P5_Dashboard clickRemoteStartWithToggles() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@class='action-button active btn-climate']");
		waitElementToBeClickableXpathFW();
		doubleClick("(//span[@class='up'])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='edit-climate-schedule-modal-slider']/div/div[1]/div/form/ul/li[2]/div/div[1]/div/div[3]/span/label/span");
		waitElementToBeClickableXpathFW();	
		clickByXpathJavascriptExecutor("//*[@id='edit-climate-schedule-modal-slider']/div/div[1]/div/form/ul/li[2]/div/div[2]/div/div[4]/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("//*[@id='edit-climate-schedule-modal-slider']/div/div[1]/div/form/ul/li[4]/div/div/label[2]/div/span/label/span");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[@class='button main']");
		waitUntilElementVisisble("(//*[@class='close'])[7]");
		return this;
	}
	
	
	/*public P5_Dashboard clickRemoteStartWithHeatedAccessories() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@class='action-button active btn-climate']");
		clickByXpath("//*[@class='toggle5']");
		clickByXpath("//*[@class='button main']");
		waitUntilElementVisisble("//*[@id='ventilation-warning-okbtn']");
		clickById("ventilation-warning-okbtn");
		waitUntilElementVisisble("(//*[@class='close'])[7]");
		return this;
	}*/

	
	public P5_Dashboard clickRemoteStop()  {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@class='action-button active btn-climate']");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[@class='button main']");
		waitUntilElementVisisble("(//*[@class='close'])[7]");
		return this;
	}

	
	
	//===================================================================================
	
	
	public P5_Dashboard clickMasterRefresh() throws InterruptedException {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("(//*[@class='refresh-ready active'])[2]");
		waitUntilElementVisisble("(//*[@class='refresh-ready active'])[2]");
		return this; 
	}
	

	
	
	
	public P5_Dashboard lastRefresh() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='time'])[2]")).isDisplayed());
		return this;
	}
	
	
	
	public P5_Dashboard handleToastMessage() {
		
		waitUntilElementVisisble("//button[@class='close']");
		HandlingToastMessage("//div[@class='alerts']/div/p)[6]", "//button[@class='close']", "The remote command for unlock executed successfully", "The remote command for lock executed successfully.",
								" alert alert-failed alert-dismissible","We cannot process your request. Please verify that your vehicle's doors, hood, and trunk are closed and locked", "null");
		waitUntilInvisibilityOfElementLocated("//button[@class='close']");
		return this;
	}
	
	
	//===================================================================================

	
	public P6_VehicleStatus clickVehicleStatus() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[@title='Vehicle Status Tile']");
		waitUntilElementVisisble("//*[@style='text-align: center;']/strong");
		
		return new P6_VehicleStatus(driver, test);
	}
	
	
	
	public P7_RemoteSection clickRemote() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[text()='Remote']");
		//waitVisibilityOfElementLocatedByID("securitytab");
		return new P7_RemoteSection(driver, test);
	}
	
	
	public P8_Schedules clickSchedules() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[text()='Schedules']");
		return new P8_Schedules(driver, test);
	}
	
	public P9_Locations clickLocations() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("//*[text()='Locations']");
		return new P9_Locations(driver, test);
	}
	
	
	public P11_MyCarZone clickMyCarZone() {
		waitUntilElementVisisble("//*[@class='icon-info']");
		clickByXpathJavascriptExecutor("(//*[text()='My Car Zone'])[2]");
		
		return new P11_MyCarZone(driver, test);
	}
	
	

}


