package com.example.demo.ui;

import com.example.demo.ui.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest extends BaseTest {
	
	    @Test
	    public void GSAMPLE1() throws Exception {
	        System.out.println("Test Started! " );
			String siteURL = "http://54.175.11.133:3015/api/";
			System.out.println("Using site URL: " + siteURL);
			String titileToBeCompared = "React 17.0.2";
			System.out.println("Site title to be compared: " + titileToBeCompared);
	        getDriver().navigate().to(siteURL);
	        System.out.println("Test's Page title is: " + getDriver().getTitle());
	        Assert.assertEquals(getDriver().getTitle(), titileToBeCompared);
	        System.out.println("Test Complete! ");
			Thread.sleep(5000);
	    }
	
}
