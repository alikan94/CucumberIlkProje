Feature: US1004 kullanici parametre ile configration file'i kullanabilmeli

  @config
  Scenario: TC07 configration properties dosyasinda parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir
    #bu bir not yazisidir