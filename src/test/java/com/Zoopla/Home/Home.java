package com.Zoopla.Home;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Zoopla.London.London;
import com.Zoopla.Utilities.TestBase;
import com.Zoopla.poHome.poHome;

public class Home extends TestBase {

	WebDriver driver=null;
	poHome objPoHome=null;
	@BeforeTest
	public void acceptCookie() {
		driver=TestBase.driver;
		driver.findElement(By.xpath("//button[text()='Save my preferences']")).click();
		
	}
	
	@Test
	public void enterLocation() throws Exception {
		objPoHome=new poHome(driver);
		objPoHome.enterInputLocation();
		London objLondon=new London();
		objLondon.validateHeader();
	}

	
	
	
	
	
}

