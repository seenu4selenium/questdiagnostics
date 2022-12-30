package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	// Pagename_WebelementName_TypeOfElement = locator;
	// Homepage
	public final By HomePage_AcceptCookies = By.id("onetrust-accept-btn-handler");

	public final By HomePage_LogIn_Link = By.xpath("//div[@class='log-in-box']");
	public final By HomePage_MyQuestPatientsLogin = By.xpath("(//*[@class='login-btn-box']/a)[1]");

	// Sign In page	
	public final By SigninPage_UserName = By.name("username");
	public final By SigninPage_Password = By.name("password");
	public final By SigninPage_SigninButton = By.name("signin");

}
