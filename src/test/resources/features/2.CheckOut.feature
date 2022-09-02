Feature: Checkout Product
  
 Scenario: Search product
    When User type printed dress
    And User click button search
    Then User can see printed dress product
    
 Scenario: Add 2 product and checkout
    Given User select add to chart in first product
    And After succes close first product
    And User select add to chart in second product
    And User click proceed to checkout
    Then User can see shoppingcart summary
    
    
    
