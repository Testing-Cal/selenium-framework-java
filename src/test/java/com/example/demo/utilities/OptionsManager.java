package com.example.demo.utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsManager {

	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximised");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		return options;
	}
	
}
