@bleu
Feature: Blue Rental login test

    Scenario Outline:manager_login_test

      Given kullanici "https://www.bluerentalcars.com/" gider
      When kullanici logingiris butonuna tiklar
      And kullanici first name "<email>" girer
      And kullanici last name "<password>" girer
      And kullanici login buttonuna basar
      And kullanici ekranda yazdigini dogrular
      Then close the application



Examples: kisi bilgileri

        |  email                            |      password     |
      |  sam.walker@bluerentalcars.com    |     c!fas_art     |
      |  kate.brown@bluerentalcars.com    |      tad1$Fas    |
      |  raj.khan@bluerentalcars.com      |      v7Hg_va^     |
      |  pam.raymond@bluerentalcars.com   |      Nga^g6!      |