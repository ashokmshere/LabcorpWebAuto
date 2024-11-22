package com.labcorp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import _LabCorpPOC.BaseTest;

public class LabCorpCareerPage extends BaseTest {

	public String jobTitleName,LocationName,IdNumber;
	
	@FindBy(xpath = "(//a[text()='Careers'])[2]")
	WebElement career;

	@FindBy(id = "typehead")
	WebElement searchJobTitleTextBox;

	@FindBy(id = "ph-search-backdrop")
	WebElement searchJobTitleButton;

	@FindBy(xpath = "//ul[@class='au-target']//li[1]//span[@role='heading']")
	WebElement positionName;

	@FindBy(xpath = "(//a[@class='btn primary-button au-target'])[1]")
	WebElement applyNowButton;

	@FindBy(xpath = "//h1[@class='job-title']")
	WebElement jobTitle;

	@FindBy(xpath = "//span[@class='au-target job-location']")
	WebElement jobLocation;

	@FindBy(xpath = "//span[@class='au-target jobId']")
	WebElement jobId;

	@FindBy(xpath = "//button[@data-automation-id='navigationItem-Careers Home']")
	WebElement carrersHome;

	public void carrerHome() {
		carrersHome.click();

	}

	public void enterJobTitle(String title) {
		jobTitle.sendKeys(title);

	}
	
	public void clickOnSearchButton() {
		
		searchJobTitleButton.click();
	}
	

	public void clickOnPosition() {
		
		positionName.click();
	}
	
	public void captureJobTitleLocaId() {
		
		jobTitleName=jobTitle.getText();
		LocationName=jobLocation.getText();
		IdNumber=jobId.getText();
		
		String jobTitleN="Functional Tester";
		String Location="Bangalore";
		String Id="2438895";
		
		
		Assert.assertEquals(jobTitleN, jobTitleName);
		Assert.assertEquals(Location, jobTitleName);
		Assert.assertEquals(Id, IdNumber);
		
		}
	
public void clickOnApply() {
		
	applyNowButton.click();
	}

public void clickOnBacktoJobSearch() {
	
	carrersHome.click();
	}
	
	
	
}
