package com.example.demo.utilities;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    public Capabilities capabilities;

    public Capabilities getCapabilities(String browser) {
        capabilities = OptionsManager.getChromeOptions();
        return capabilities;
    }
}
