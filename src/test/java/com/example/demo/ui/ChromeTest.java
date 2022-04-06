package com.example.demo.ui;

import com.example.demo.ui.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest extends BaseTest {
	
	    @Test
	    public void GSAMPLE1() throws InterruptedException {
			System.out.println("Test Started! " );
			String siteURL = "http://20.232.193.80:3015/api/";
			if (siteURL == null) {
				// Pass the Site Under Test URL here in below format
				// http://209.12.12.12:3000/api/
				siteURL = "http://<site-under-test-url>:<site-port>/<context-path>/";
			}
			System.out.println("Using site URL: " + siteURL);
			String titileToBeCompared = "Angular 12";
			System.out.println("Site title to be compared: " + titileToBeCompared);
			Thread.sleep(10000);
			getDriver().navigate().to(siteURL);
			System.out.println("Test's Page title is: " + getDriver().getTitle());
			Assert.assertEquals(getDriver().getTitle(), titileToBeCompared);
			System.out.println("Test Complete! ");
			Thread.sleep(5000);

		}
	
}
