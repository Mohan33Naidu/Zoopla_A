package com.Zoopla.poHome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Zoopla.Home.Home;
import com.Zoopla.Utilities.TestBase;

public class poHome extends TestBase{

	WebDriver driver=null;
	Home objHome=null;
	public poHome(WebDriver driver) {
		
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search-input-location")
	WebElement btnInput;
	
	@FindBy(xpath="//h1[contains(text(),'Property for sale in London']")
	WebElement hdrElem;
    @FindBy(xpath="//ul//li[@data-value='London']")
    WebElement elDropdownvalue;
    
    @FindBy(xpath="//ul[contains(@class,'ui-autocomplete')]")
    WebElement elDD;
	@FindBy(id="Search")
	WebElement btnSearch;
	public void enterInputLocation() throws Exception {
		btnInput.sendKeys(System.getProperty("SearchLocation"));
		
		Actions action=new Actions(TestBase.driver);
		action.sendKeys(Keys.ENTER).perform();
		
		
		
	} 

}
