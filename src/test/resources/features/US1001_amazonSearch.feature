@tumu
Feature: US1001 Kullanici Amazon sayfasinda arama yapar

  @nutella @dumanliTest
  Scenario: TC01 kullanici amazonda kelime aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
  @java
  Scenario: TC02 kullanici amazonda java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir
  @iPhone
  Scenario: TC03 kullanici amazonda iPhone aratir
    When kullanici amazon anasayfasinda
    And kullanici iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder
    And sayfayi kapatir
