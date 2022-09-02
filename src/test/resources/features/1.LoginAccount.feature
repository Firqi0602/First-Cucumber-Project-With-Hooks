Feature: Login Account

  Scenario: Account failed login 
    When Go to Web automationpractice
    And User enter email address password invalid
    And User press button login
    Then User authentication failed
    
  Scenario: Account succes login 
   	Given Go to Web automationpractice
    When User enter email address password valid
    And User press button login valid
    Then User can see my account text

 
 