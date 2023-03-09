@hotelmycamp
Feature: Hotel login test

  Scenario Outline:TC_login_test

    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici logingiris butonuna tiklar
    And kullanici first name "<email>" girer
    And kullanici last name "<password>" girer
    And kullanici login buttonuna basar
    And kullanici hata mesaji aldigini dogrular
    Then close the application

Examples: email password
  | email              |  |  | password |
  | manager@gmail.com  |  |  | manager  |
  | manager1@gmail.com |  |  | manager1 |
  | manager2@gmail.com |  |  | manager2 |