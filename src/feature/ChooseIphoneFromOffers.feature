Feature: SearchingFeature
  Scenario: Search iphone phone
    Given I navigate to the allegro website
    When I search item by Iphone phrase
    And I sort the price from the highest
    And I set used filter
    And I open first item from list
    Then Item page is open
    And Item name i equal to item name from list
