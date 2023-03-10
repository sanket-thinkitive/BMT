package com.testmonster.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testmonster.commons.Library;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class flowforgit {
	public AppiumDriver<MobileElement> driver;
	public Library lib;

	@BeforeClass
	public void setup() throws MalformedURLException {
		lib = new Library("Test Started");
		driver = lib.launchDriver();

	}

	@Test
	public void flowforgitTest() throws Exception {
                  lib.clickMobileElement("id:btnSkip");
lib.clickMobileElement("id:btnSkip");
lib.clickMobileElement("id:btnSkip");
lib.clickMobileElement("id:ivClose");
lib.clickMobileElement("id:btnLogInOnBoarding");

	}

	@AfterClass
	public void afterClass() {
		lib.quitBrowser();
	}

}
