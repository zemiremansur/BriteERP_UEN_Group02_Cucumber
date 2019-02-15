Feature: login functionality


  @h1
  Scenario: Pos manager login
    Given user on the data base page
    When user selects the data base
    Then login page should be displayed
    And user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    Then homepage should be displayed
    And title should contains "Inbox"
