Feature: Mandatory Registration
  Scenario: Valid Registration
    Given I navigate to propertyrete web site
    When I click on the register button
    And I enter first name
    And I enter last name
    And I enter email address
    And I enter mobile number
    And I enter my password
    And I confirm my password
    And I click on create account
    Then  an error message is displayed


 Scenario: Invalid Registration
    Given I navigate to propertyrete web site
    When I click on the register button
    And I leave the first name blank
    And I leave the last name blank
    And I enter email address"olumuyee@gmail.com"
    And I enter mobile number"07473373303"
    And I enter my password"master2000"
    And I confirm my password"master4000"
    And I click on create account
    Then am not registered



