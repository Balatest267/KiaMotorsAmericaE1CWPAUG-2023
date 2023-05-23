package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.mozilla.javascript.Context;
import org.testng.ITestContext;

import utils.DataInputProvider;

public class KMABase extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;	

	
	/*@BeforeSuite
	public void beforeSuite(){
		startResult();   
	}*/


	@BeforeTest
	public void beforeTest(){
		startResult();   
		loadObjects();  		
	}
	
	
	@Parameters({"browser","testCaseName", "testDescription", "category", "authors"})
	@BeforeMethod
	public void beforeMethod(String browserName, String testCaseName, String testDescription, String category, String authors) {
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);   
		invokeApp(browserName);
	}
		
	
	/*@AfterSuite
	public void afterSuite(){
		endResult();
	}*/
	

	@AfterTest
	public void afterTest(){
		unloadObjects();  
		endResult();
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException{
		endTestcase();     
		closeAllBrowsers();		
		Thread.sleep(5000);
		}
	
	@DataProvider(name="fetchData")	
	public Object[][] getData(ITestContext context){
		String dataSheetName = context.getCurrentXmlTest().getParameter("dataSheetName");
		return DataInputProvider.getAllSheetData("./data/"+dataSheetName+".xlsx");		
	}	
	
}






