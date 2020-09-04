package com.Zoopla.poLondon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.Utilities.TestBase;



public class poLondon extends TestBase {

	WebDriver driver=null;
		public poLondon(WebDriver driver) {
			driver=TestBase.driver;
			PageFactory.initElements(driver,this);
		}
		
		
		
	    
	    
	    @FindBy(xpath="//h1[contains(text(),'Property for sale in London')]")
		WebElement hdrElem;
	    
		public String validateHeader() {
			
			return hdrElem.getText();
		}

		@FindAll({@FindBy(how=How.XPATH,using="//div[@class='listing-results-right clearfix']//a[contains(@class,'text-price')]")})
		List<WebElement> lsProperties ;
		public void getList() {
			System.out.println(lsProperties.size());
			//Collections.sort(lsProperties);
			ArrayList<String> sProp=new ArrayList<String>();
			int i=0;
			for (WebElement prop : lsProperties) {
				//System.out.println(prop.getText());
				
				sProp.add(prop.getText());
			}
			
			Collections.sort(sProp,Collections.reverseOrder());
			System.out.println("Descending order price");
			System.out.println(Arrays.asList(sProp));
			
			objBrowser.poClick(lsProperties.get(4));
			
			
		}	
	    
	}


