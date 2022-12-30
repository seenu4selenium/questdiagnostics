package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.AfterClass;

public class TS_001_QDsignin extends CommonFunctions {

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		screenshot();
	}

	@Test
	public void f() throws Exception {
		chromeBrowserLaunch();
		getURL("HOME_URL");	
		
		clickUsingJavaScript(loc.HomePage_AcceptCookies);
		//clickByAnyLocator(loc.HomePage_AcceptCookies);
		
		clickByAnyLocator(loc.HomePage_LogIn_Link);
		clickByAnyLocator(loc.HomePage_MyQuestPatientsLogin);
		switchToNewTab(1);
		
		clickUsingJavaScript(loc.HomePage_AcceptCookies);
		
		sendKeysByAnyLocator(loc.SigninPage_UserName, "Username");
		sendKeysByAnyLocator(loc.SigninPage_Password, "Password");
		clickByAnyLocator(loc.SigninPage_SigninButton);
		

	}

}
