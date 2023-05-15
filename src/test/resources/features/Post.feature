Feature: Post
  All Post Tests
  
  Background: As homeWorkTestUser0001 connected user
    Given I go to Login page
    And I set my login email "homeWorkTestUser0001@a.a" and my password "homeWorkTestUser0001"
    When I click on Sign In button
    Then I'm login as "homeWorkTestUser0001"
    
  Scenario: I post a new article
    Given I got to new post page
    And My new post Article is "My first Article"
    And My new post Article about section is "My first Article text About"
    And My new post description is:
    	"""
		  Some Title, Eh?
		  ===============
		  
		  
		  Here is the first paragraph of my blog post. Lorem ipsum dolor sit amet,
		  consectetur adipiscing elit.
		  
		  Best Regards,
		  
		  """
		And My new post tags are "Test;Test2"
		When I post my article
		Then My new post should be publish