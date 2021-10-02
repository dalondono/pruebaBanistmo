#Autor: David Londoño
@stories
Feature: interest rate
  as a user
  I want to browse a page
  to calculate interest rate

  @scenario1
  Scenario Outline: calculate interest rate
    Given the user want to calculate interest rate
    When user enters values
      | rate   | periodicity   | capitalization   |
      | <rate> | <periodicity> | <capitalization> |
    Then the user gets a value for the rate
      | result   |
      | <result> |
    Examples:
      | rate | periodicity | capitalization | result |
      | 50   | Trimestral  | Anual          | 10.67  |