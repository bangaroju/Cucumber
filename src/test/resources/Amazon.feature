@tag
Feature: InfusionSoft

@tag1
Scenario: INfusion Soft Company creation
  Given I want to open browser
  And Browser opens INfusion soft login page
  When Username and password is entered
  Then add a company
  And logout successfully