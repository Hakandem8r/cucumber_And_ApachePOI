Feature: Register Functionality

  Scenario Outline: Create an Account
    Given Navigate to website
    And click sign i button
    And type e-mail "<Email>"
    And click on Create an Account button
    And choose a tittle
    And type firstname "<firstname>" and lastname "<lastname>"
    And type a password "<password>"
    Examples:
      | Email            | firstname | lastname | password   |
      | mesut1@gmail.com | Mesut     | Aslan    | mesut123.! |