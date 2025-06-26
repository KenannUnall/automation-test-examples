Feature: Sepete Ekleme Testi
  Scenario: E-bebek websitesine git ve ilk biberonu sepete ekle

    Given E-bebek sitesine git
    And Spani kapat
    When 'Biberon' yaz
    Then Ilk biberonu sec
    And Ilk biberonu sepete ekle
    Then Sepeti gore tikla
    