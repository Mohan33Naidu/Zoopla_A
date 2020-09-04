package com.Zoopla.poAgent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class poAgent {
	WebDriver driver=null;
	
	public poAgent(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@id='content']//b)[1]")
	WebElement elAgentName;
	public String getName() {
		
		
		String s= elAgentName.getText();
		return s;
	}

	
}
