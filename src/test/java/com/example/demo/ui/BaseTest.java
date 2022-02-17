package com.example.demo.ui;

import com.example.demo.utilities.CapabilityFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
	 protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	    public CapabilityFactory capabilityFactory = new CapabilityFactory();
	 
	    @BeforeMethod
	    @Parameters(value={"browser"})
	    public void setup (String browser) throws MalformedURLException {
	        //Set Browser to ThreadLocalMap
			//String gridURL = System.getProperty("GRID_URL");
			String gridURL = "http://3.94.128.215:4444";
			System.out.println("Using Grid URL: " + gridURL);
	        driver.set(new RemoteWebDriver(
	        		new URL(gridURL + "/wd/hub"),
					capabilityFactory.getCapabilities(browser)));
	    }
	 
	    public WebDriver getDriver() {
	        //Get driver from ThreadLocalMap
	        return driver.get();
	    }
	 
	    @AfterMethod
	    public void tearDown() {
	        getDriver().quit();
	    }
	 
	    @AfterClass void terminate () {
	        //Remove the ThreadLocalMap element
	        driver.remove();
	    }
}
