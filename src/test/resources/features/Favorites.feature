Feature: Favorites
  All Favorites Tests
  
  Background: As homeWorkTestUser0001 connected user
    Given I go to Login page
    And I set my login email "homeWorkTestUser0001@a.a" and my password "homeWorkTestUser0001"
    When I click on Sign In button
    Then I'm login as "homeWorkTestUser0001"
    
  Scenario: I add a new favorite
    Given I got on my feed page "homeWorkTestUser0001"
    And My post Article "dgdbxd" is my favorite
    Then I got on my favorite tab
		And the article "dgdbxd" should be one of my favorite article