
@tag
Feature: To create a new customer


  @tag1
  Scenario: To validate creation of customer
    Given click on register link
    And give the deatils required
    When click on register
    Then customer should be registered
    
  @tag2  
  Scenario: To validate customer can able to login
  Given provide username
  Then Enter password
  Then click on login
  And can able to login 
    
   

