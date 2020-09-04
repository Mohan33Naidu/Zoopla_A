package com.Zoopla.Utilities;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Zoopla.poHome.poHome;

public class TestBase {

	public static CommonUtilities objComm=new CommonUtilities();
	public static BrowserUtilities objBrowser=new BrowserUtilities();
	public static WebDriver driver=null;
	public static poHome objPoHome=null;
	
	@BeforeSuite
	public static void initDriver() throws Exception {
		objComm.loadProperty();
		objComm.loadLogProperties();
		objComm.loadTestData();
		driver=objBrowser.initDriver(System.getProperty("browser"));
		objBrowser.getUrl();
		objPoHome=new poHome(driver);
		
	}
	
	@AfterSuite
	public static void closeDriver() {
		
		//driver.close();
	}
	

	
	
	
}
