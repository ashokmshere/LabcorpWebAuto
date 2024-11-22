#Author: Ashok

Feature: Apply a job in labcorp company

	Background: Logging into the Application
	Given I Login Labcorp application


  @regTest
  Scenario: Apply job in Labcorp company
    Given Click on careers button
    And Enter jobTitle in the searchbox
    And Click on Search button
    And Click on jobTitle
    When Capture the JobTitle,JobLocation,JobID
    Then Click on Apply button
    And Click on Return to JobSearch

  