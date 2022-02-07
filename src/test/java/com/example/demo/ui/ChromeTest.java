package com.example.demo.ui;

import com.example.demo.ui.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest extends BaseTest {
	
	    @Test
	    public void GSAMPLE1() {
	        System.out.println("Test Started! " );
			String siteURL = "http://52.91.78.138:3015/api";
			System.out.println("Using site URL: " + siteURL);
	        getDriver().navigate().to(System.getProperty("SITE_URL"));
	        System.out.println("Test's Page title is: " + getDriver().getTitle());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Test Ended! ");
	    }
	
}
