Feature: Login
  Scenario: Valid Login
    Given I navigate to propertyrete site
    And I click on login link
    And I enter username"olumuyee@gmail.com"
    And I enter password"master2000"
    And I click on sign in button
    Then I am logged in


 Scenario Outline: Invalid Login
    Given I navigate to propertyrete site
    And I click on login link
    And I enter "<username>" and "<password>"
    And I click on sign in button
    Then am not signed in

   Examples:
   |username|password|
   |olumuyee@gmail.com|master4000|
   |ade               |koko      |


