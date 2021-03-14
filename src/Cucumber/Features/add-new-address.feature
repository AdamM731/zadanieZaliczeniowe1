Feature: Add new shipping address after login

  Scenario: User can add new shipping address

    Given User is logged in my store
    When User goes to CreateNewAddressesPage
    And User input Alias, Address, City, Zip, Country, Phone and click save button
    Then User sees "Address successfully added!"