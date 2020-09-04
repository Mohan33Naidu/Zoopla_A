package com.Zoopla.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {

	static WebDriver driver=null;
	static WebDriverWait wait=null;
	
	public  WebDriver initDriver(String sBrowser) {
		
		if(sBrowser.contains("ch"))
		{
			System.getProperty("webdriver.chrome.driver","");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			wait=new WebDriverWait(driver, 30);
		}
		
		
		
		return driver;
		
	}
	public void getUrl() throws Exception {
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public void waitUntilElementVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void poSendKeys(WebElement element,String sKey) {
		element.sendKeys(sKey);
	}
	
	public void poClick(WebElement element) {
		element.click();
	}
	
	public void jsScroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
}
