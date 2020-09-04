package com.Zoopla.Property;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Zoopla.Agent.Agent;
import com.Zoopla.Utilities.TestBase;
import com.Zoopla.poProperty.poProperty;

public class Property extends TestBase{

	@Test(priority=5)
	public void validateProperty() throws Exception {
		poProperty oPageProperty=new poProperty(TestBase.driver);
		
		String sAgent1=oPageProperty.validatePage();
		//System.out.println(sAgent1);
		Agent oAgent=new Agent();
		oAgent.getName(sAgent1);
	}

}
