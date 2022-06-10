Feature: US1008 kullanici farkli yanlis sifre ve kullanici adi ile giremez

  @negative
  Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    #Kullanici adi   Password
    #Manager5 Manager5!
    #Manager6 Manager6!
    #Manager7 Manager7!
    #Manager8 Manager8!
    #Manager9 Manager9!
    Examples:
      | username | password  |
      | Manager5 | Manager5! |
      | Manager6 | Manager6! |
      | Manager7 | Manager7! |
      | Manager8 | Manager8! |
      | Manager9 | Manager9! |