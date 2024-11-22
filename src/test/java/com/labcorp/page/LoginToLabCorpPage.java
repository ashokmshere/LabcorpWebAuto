package com.labcorp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import _LabCorpPOC.BaseTest;

public class LoginToLabCorpPage extends BaseTest{
	

	@FindBy(xpath="//a[text()='Login']")
	WebElement loginButton;

	@FindBy(xpath="(//a[text()='Careers'])[2]")
	WebElement career;
	
	@FindBy(xpath="(//button[@class='ph-nav-btn subnav-dropdown ']//span[text()='Login'])[2]")
	WebElement careerLogin;
	
	@FindBy(xpath="(//a[@aria-label='Candidate Login'])[2]")
	WebElement candidateLogin;
	
	@FindBy(xpath="//input[@data-automation-id='email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@data-automation-id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@data-automation-id='signInSubmitButton']")
	WebElement signInButton;
	
	
	public void enterLoginCred(String userNa,String pass)
	{
		career.click();
		careerLogin.click();
		candidateLogin.click();
		emailId.sendKeys(userNa);
		password.sendKeys(pass);
		signInButton.click();
		
		
	}
	
}
