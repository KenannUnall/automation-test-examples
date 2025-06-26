@deneme
Feature: E-bebek_Deneme_Testi
  Scenario: e-bebek-test1
    Given kategorilere tiklar
    And herhangi bir kategori secer
    And herhangi bir alt kategori secer
    When filtreleye tiklar
    And fiyat Araligi secer
    When siralaya tiklar
    And cok degerlendirilenler secenegini secer
    And ilk urunu sepete ekler
    When sepete tiklar
    And urunun arttirip fiyat kontrolu yapar
    Then alisverisi tamamla butonuna tiklar