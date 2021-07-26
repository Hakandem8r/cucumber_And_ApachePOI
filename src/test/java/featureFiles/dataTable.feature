Feature: User registration

  Scenario: User registration with diffrent data
    Given User is on registration page
    When User enters following user details
      | Hakan | Demir  | hd@gmail.com    | 123456789s | Stuttgart |
      | Mesut | Mutlu  | mesut@gmail.com | sifre      | Berlin    |
      | Esra  | Yilmaz | esra@gmail.com  | yilmaz123  | London    |
    Then User registration should be succesfull