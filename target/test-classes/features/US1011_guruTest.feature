Feature: US1011 web tablosundaki istenen sutunu yazdirma

  @guru @pr2
  Scenario: TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    Then cookies sorulursa kabul et
    And "Current Price (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
