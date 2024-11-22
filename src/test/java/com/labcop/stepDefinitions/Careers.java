package com.labcop.stepDefinitions;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.labcorp.page.LabCorpCareerPage;

import _LabCorpPOC.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Careers extends BaseTest {
	
	LabCorpCareerPage cPage;
	
	
	@Given("Click on careers button")
	public void click_on_careers_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    cPage.carrerHome();
	}

	@Given("Enter jobTitle in the searchbox")
	public void enter_job_title_in_the_searchbox() {
	  
		cPage.enterJobTitle(jobTitle);
	}

	@Given("Click on Search button")
	public void click_on_search_button() {
	   
		cPage.clickOnSearchButton();
	}

	@Given("Click on jobTitle")
	public void click_on_job_title() {
		cPage.clickOnPosition();
		
	}

	@When("Capture the JobTitle,JobLocation,JobID")
	public void capture_the_job_title_job_location_job_id() {
	    
		cPage.captureJobTitleLocaId();
		
	}

	@Then("Click on Apply button")
	public void click_on_apply_button() {
		
		cPage.clickOnApply();
	   
	}

	@Then("Click on Return to JobSearch")
	public void click_on_return_to_job_search() {
		cPage.clickOnBacktoJobSearch();
	
	}
	
	
	

}
