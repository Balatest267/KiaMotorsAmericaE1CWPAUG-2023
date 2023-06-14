package wrappers;


public interface Wrappers {
		
//-----------------------------------------------------Invoke Method------------------------------------------------------------
	
	public void invokeApp(String browser);
	public void invokeApp(String browser, boolean bRemote);
	
	
//-----------------------------------------------------Wait Method------------------------------------------------------------
	
		public void waitVisibilityOfElementLocatedByXpath(String xpath);
		
		public void waitVisibilityOfElementLocatedByName(String name);
		
		public void waitelementToBeClickableByXpath(String xpath);
	
		
		
//-----------------------------------------------------Enter Method------------------------------------------------------------	
	
	
	public void enterById(String idValue, String data);
	
	public void enterByName(String nameValue, String data);	

	public void enterByXpath(String xpathValue, String data);


	
//----------------------------------------------------- Verify Method ------------------------------------------------------------		

	public boolean verifyTitle(String title);

	public void verifyTextById(String id, String text);

	public void verifyTextByXpath(String xpath, String text);

	public void verifyTextContainsByXpath(String xpath, String text);

	
//-----------------------------------------------------Click Method------------------------------------------------------------		

	public void clickById(String id);

	public void clickByClassName(String classVal);

	public void clickByName(String name);

	public void clickByLink(String name);

	public void clickByLinkNoSnap(String name);
	
	public void clickByXpath(String xpathVal);

	public void clickByXpathNoSnap(String xpathVal);
	

//-----------------------------------------------------Click Method with Java Script Executor------------------------------------------------------------	
	
	public void clickByXpathJavascriptExecutor(String xpathVal);
	
//-----------------------------------------------------Get Method------------------------------------------------------------		

	
	public String getTextById(String idVal);

	public String getTextByXpath(String xpathVal);

	
//-----------------------------------------------------Select Method------------------------------------------------------------		
	

	public void selectVisibileTextById(String id, String value);

	public void selectIndexById(String id, int value);
	
	
//-----------------------------------------------------Switch Method------------------------------------------------------------		


	public void switchToParentWindow();
	public void switchToLastWindow();
	
//-----------------------------------------------------Alert Method------------------------------------------------------------		

	public void acceptAlert();
	public void dismissAlert();
	public String getAlertText();

//-----------------------------------------------------Takesnap Method------------------------------------------------------------		

	public long takeSnap();

//-----------------------------------------------------Page refresh------------------------------------------------------------		
	
	public void pageRefresh();
	
//-----------------------------------------------------Close Method------------------------------------------------------------	
	
	public void closeBrowser();
	public void closeAllBrowsers();
	
}
