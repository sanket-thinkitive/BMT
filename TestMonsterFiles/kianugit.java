package com.testmonster.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testmonster.commons.Library;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class kianugit {
	public AppiumDriver<MobileElement> driver;
	public Library lib;

	@BeforeClass
	public void setup() throws MalformedURLException {
		lib = new Library("Test Started");
		driver = lib.launchDriver();

	}

	@Test
	public void kianugitTest() throws Exception {
                  lib.findMobileElement("id:imageLogo");
lib.findMobileElement("id:languageButton");
lib.findMobileElement("id:nextButton");
lib.clickMobileElement("id:nextButton");
lib.findMobileElement("xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.LinearLayout/android.widget.ImageView");
lib.findMobileElement("id:btnShowRegister");
lib.clickMobileElement("id:btnShowRegister");


	}

	@AfterClass
	public void afterClass() {
		lib.quitBrowser();
	}

}
