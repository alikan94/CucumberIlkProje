Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC13 kullanici 5 farkli kayıt gisiri yapabilmeli
    When kullanici "datatablesUrl" anasayfasinda
    And kullanici 1 sn bekler
    Then new butonuna basar
    And kullanici 1 sn bekler
    And isim bolumune "<firstName>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And ofis bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstName>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And sayfayi kapatir


    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Ali       | Kan      | QA       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05 | 11000  |
      | Huseyin   | Korkmaz  | BA       | berlin | -         | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-03 | 11000  |