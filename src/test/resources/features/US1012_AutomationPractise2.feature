Feature: US1012 kullanici register yapabilmeli

  @wip
  Scenario: TC17 kullanici uygun datalarla register olabilmeli
  http://automationpractice.com/index.php sayfasina gidelim
  Cucumber ile asagidaki testi yapalim
    Given kullanici "apUrl" anasayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin
    Then sayfayi kapatir