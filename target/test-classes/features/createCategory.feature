

Feature: Manager should be able to create new a category.
  Background:
    Given user on the data base page
    When user selects the data base
    And user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    When the user clicks on Point of Sale
    And the 'Pos Categories' should be displayed on the main panel

  Scenario: Verify if the user is able to create new category with name
    When the user clicks on the Create button
    Then the user enter a valid name of the new category
    Then the user clicks save button
    And the valid name of the new category dispalyed on the main panel

  Scenario: Verify if the user is able to create new category with parent category
    When the user clicks on the Create button
    Then the user enter a valid name of the new category
    Then the user select a valid parent category from the dropdown box
    Then the user clicks save button
    And the  parent category and valid name of the new category dispalyed on the main panel



