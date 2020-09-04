package com.Zoopla.Agent;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zoopla.Utilities.TestBase;
import com.Zoopla.poAgent.poAgent;
import com.Zoopla.poProperty.poProperty;

public class Agent extends TestBase{
	
	static String sAgentProp;
	String sAgent2;
	public void getName(String sAgent1) {
		this.sAgentProp=sAgent1;
		
	
		
	}

	@Test(priority=10)
	private void validateAgent() {
		poAgent objPageAgent=new poAgent(TestBase.driver);
		this.sAgent2 =objPageAgent.getName();
		AssertJUnit.assertEquals(sAgentProp,sAgent2);
		
		
	}

	

}
