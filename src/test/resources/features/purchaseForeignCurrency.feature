Feature: Purchase Foreign Currency
  Background:
    Given Users are onthe Main page
    Then Users must  click Signin button
    Then User is on the Login page
    And Users see an error on the page
    Then Users came back and they are signed in already
    Then user should clicl online banking
    And user should click Paybill menu
  Scenario: Available currencies
    When the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available
      |Australia (dollar) |
      |Canada (dollar) |
      |Switzerland (franc) |
      |China (yuan) |
      |Denmark (krone) |
      |Eurozone (euro) |
      |Great Britain (pound)|
      |Japan (yen) |
      |Mexico (peso) |
      |Norway (krone) |
      |New Zealand (dollar) |
      |Singapore (dollar) |


  Scenario: Error message for not selecting currency
    When the user accesses the Purchase foreign currency cash tab
    Then user tries to calculate cost without selecting a currency
    Then first error message should be displayed

  Scenario: Error message for not entering value
    When the user accesses the Purchase foreign currency cash tab
    Then user tries to calculate cost without entering a value
    Then second error message should be displayed
