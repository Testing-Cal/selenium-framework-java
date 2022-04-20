package com.example.demo.ui;

import com.example.demo.ui.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ChromeTest extends BaseTest {
	
	@Test
	public void GSAMPLE1() throws InterruptedException {
			System.out.println("Test Started! ");
			//String siteURL = "http://20.232.193.80:3015/api/";
			String siteURL = System.getProperty("SITE_URL");
			if (siteURL == null) {
				// Pass the Site Under Test URL here in below format
				// http://209.12.12.12:3000/api/
				siteURL = "http://<site-under-test-url>:<site-port>/<context-path>/";
			}
			System.out.println("Using site URL: " + siteURL);
			//String titileToBeCompared = "React 17.0.2";
			String titileToBeCompared = "Angular 12";
			System.out.println("Site title to be compared: " + titileToBeCompared);
			Thread.sleep(10000);
			getDriver().navigate().to(siteURL);
			System.out.println("Test's Page title is: " + getDriver().getTitle());
			Assert.assertEquals(getDriver().getTitle(), titileToBeCompared);
			System.out.println("Test Complete! ");
			Thread.sleep(5000);
	}

	@Test
	public void GSAMPLE2() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE3() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE4() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE5()  {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE6()  {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE7() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE8()  {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE9()  {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE10()  {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE11() {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE12() {
		//int a =1/0;
	}

	@Test
	public void GSAMPLE13() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE14() {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE15()	 {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE16() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE17() {
		Assert.assertEquals("sagar","sagar");
	}

	@Test
	public void GSAMPLE18() {
		Assert.assertEquals("sagar1","sagar");
	}

	@Test
	public void GSAMPLE19() {
		Assert.assertEquals("sagar1","sagar");
	}
}
