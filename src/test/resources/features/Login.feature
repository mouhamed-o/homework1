Feature: Login
  All Login tests
  
  Scenario: Login with correct user login pass
    Given I go to Login page
    And I set my login email "homeWorkTestUser0001@a.a" and my password "homeWorkTestUser0001"
    When I click on Sign In button
    Then I'm login as "homeWorkTestUser0001"