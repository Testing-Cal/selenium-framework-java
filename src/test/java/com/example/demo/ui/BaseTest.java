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
	        driver.set(new RemoteWebDriver(
	        		new URL(System.getProperty("GRID_URL")+"/wd/hub"),
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
