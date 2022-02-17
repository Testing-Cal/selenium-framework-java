package com.example.demo.ui;

import com.example.demo.ui.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest extends BaseTest {
	
	    @Test
	    public void GSAMPLE1() throws InterruptedException {
			System.out.println("Test Started! " );
			String siteURL = System.getProperty("SITE_URL");
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
