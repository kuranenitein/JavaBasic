package testCases;


import org.testng.annotations.Test;

import com.qa.testBase.AmazonLaunchTestBase;

public class Testing extends AmazonLaunchTestBase {
	 
 
	
	@Test
	public void logoDisplayTest() 
	{
		h.logoDispay();			
	}
	
	@Test
	public void linkClickableTest()
	{
	     h.linkClickable();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(null, false, null);
	   
	}
	
}
