package com.labcop.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.labcorp.page.LoginToLabCorpPage;

import _LabCorpPOC.BaseTest;
import _LabCorpPOC.Browser;
import io.cucumber.java.en.Given;

public class LoginToLabCorp extends BaseTest{
	public WebDriver driver;
	LoginToLabCorpPage loginPage;
	
	@Given("I Login Labcorp application")
	public void loginPAge()
	{
		driver=Browser.getInstance().getDriver();
		driver.get(appURL);
		loginPage.enterLoginCred(user, password);
		
		
	}

	

	
}
