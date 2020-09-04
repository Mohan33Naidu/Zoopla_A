package com.Zoopla.London;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.Zoopla.Property.Property;
import com.Zoopla.Utilities.TestBase;
import com.Zoopla.poLondon.poLondon;

public class London extends TestBase{
	
	public poLondon objPoLondon=null;
	@Test (priority=1)
	public void validateHeader() {
		
		objPoLondon=new poLondon(TestBase.driver);
		String Header=objPoLondon.validateHeader();
		AssertJUnit.assertEquals(Header,System.getProperty("headerLondon"));
		System.out.println("validate"+Header);
	}
	
	@Test (priority=2)
	public void displayList() {
		
		objPoLondon.getList();
		/*Property oProperty=new Property();
		oProperty.validateProperty();*/
		
	}

	

}
