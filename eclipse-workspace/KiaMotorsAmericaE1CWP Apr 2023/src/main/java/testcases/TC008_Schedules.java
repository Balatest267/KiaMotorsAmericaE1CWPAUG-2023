package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC008_Schedules extends KMABase{


	@Test(priority=1,dataProvider="fetchData")
	public void createNewSchedule(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickSchedules()
		.createNewSchedule();
}
	
	
	@Test(priority=2,dataProvider="fetchData")
	public void updateExistingSchedule(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickSchedules()
		.updateSchedule();
}
	
	
	@Test(priority=3, dataProvider="fetchData")
	public void enableParentToggle(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickSchedules()
		.enableParentToggle();
		
	}
	
	@Test(priority=4,dataProvider="fetchData")
	public void scheduleIsDisplayedRemoteSection(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickRemote()
		.remoteScheduleIsDisplayed();
		
	}
	

	
	@Test(priority=5, dataProvider="fetchData")
	public void deleteSchedule(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickSchedules()
		//.createNewSchedule()
		.deleteSchedule();
		
	}
	
	
	
	
}