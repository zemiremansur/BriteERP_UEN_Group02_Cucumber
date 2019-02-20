Feature: sales details page

  @BRIT-4133 @PointOfSales @UEN
  Scenario:manager should be able to create point of sale.
    Given manager on the sales details page
    When manager click the add an item button
    Then form page should be display
    And manager write the name of point of sale zara
    Then manager click the save button
    Then saved page should be display


  @BRIT-4174 @PointOfSales @UEN
  Scenario:manager should be able to edit point of sale
    Given manager on the sales details page
    When manager select point of sale ZARA
    Then manager edit the name to "ZARAM"
    And manage select the save and close button
    Then page should be display ZARAM

  @BRIT-4136 @PointOfSales @UEN
  Scenario: manager should be able to save new changes.
    Given manager on the sales details page
    When manager select the zara
    Then point of sales zara page should be display
    And manager edit something on the page
    And manager select the save and change button
    Then new changed page should be display

  @BRIT-4175 @PointOfSales @UEN
  Scenario : manager should be save and close
    Given manager on the sales of details page
    When manager create an item
    Then manager select save and close
    And saved page should be display

  @BRIT-4176 @PointOfSales @UEN
  Scenario: As a POS Manager  should be able to add an item.
    Given manager on the sales details page
    When manager select the delete point of sales
    Then deleted page should be display

  @BRIT-4207 @PointForSale @UEN
  Scenario: manager should be able to select the sales start and end time.
    Given manager on the sales details page
    When manager select the start time 10:00
    And manager select the end time 12:00
    Then selected page should be display

  @BRIT-4170 @PointOfSales @UEN
  Scenario:manager should be able to select the sales start date
    Given manager on the sales details page
    When manager select the start date
    Then selected page should be display

  @BRIT-4206 @PointOfSales @UEN
  Scenario:manager should be able to select the sales end date.
    Given manager on the sales details page
    When manager select the end date febrary20
    Then selected page should be display

  @BRIT-4173 @PointOfSales @UEN
  Scenario:manager should be able to click close button at any time
    Given manager on the sales details page
    When manager select the close picker
    Then page should not be display

  @BRIT-4138 @PointOfSales @UEN
  Scenario: pos manager should print point of sales page
    Given manager on the sales details page
    When manager select the print button
    Then printed page should be displayed
