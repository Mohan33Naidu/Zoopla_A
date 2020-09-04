package com.Zoopla.poProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.Utilities.TestBase;

public class poProperty extends TestBase{
	WebDriver driver=null;
	
	public poProperty(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//h4[@class='ui-agent__name'])[1]")
	WebElement elProperty;

	public String validatePage() throws Exception {
		Thread.sleep(2000);
		objBrowser.waitUntilElementVisible(elProperty);
		
		String sAgent=elProperty.getText();
		objBrowser.poClick(elProperty);
		
		return sAgent;
	}
	
	
}
