package org.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Nithra {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options mobile = new UiAutomator2Options();
		
		mobile.setCapability("deviceName","motog545G");
		
		mobile.setCapability("app", "C:\\Users\\gomathi\\eclipse-workspace\\SampleMob\\src\\test\\resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), mobile);
		
	}

}
