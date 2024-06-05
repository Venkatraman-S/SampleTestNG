
Feature: Flight search Scenario

  @tag1
  Scenario: Need to Book flight
    Given Luanch the URL
    When Close the popup
   And Enter the From "Chennai"
    And Enter the To "Banglore"
    And CLick the Search button
    Then Search for flights
  