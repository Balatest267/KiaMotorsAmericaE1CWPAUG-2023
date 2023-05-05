package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import pages.P4_MyVehicles;
import wrappers.KMABase;

public class TC007_RemoteSection extends KMABase {

	
	
	@Test(priority=1, dataProvider="fetchData")
	public void RemoteSectionDoorUnlockRS(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickRemote()
		.clickDoorUnLockRS(); 		
	}
	
	
	
	@Test(priority=2, dataProvider="fetchData")
	public void RemoteSectionDoorLock(String emailID, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailID)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickRemote()
		.clickDoorLockRS();
	}
		
	@Test(priority=3,dataProvider="fetchData")
	public void RemoteSectionClimateStart(String emailID, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailID)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickRemote()
		.clickRemoteStartRS();
		
	}
		
	
	@Test(priority=4,dataProvider="fetchData")
	public void RemoteSectionClimateStop(String emailID, String pwdLogin, String vehicleModel) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailID)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickRemote()
		.clickRemoteStopRS();
		
	}
}
