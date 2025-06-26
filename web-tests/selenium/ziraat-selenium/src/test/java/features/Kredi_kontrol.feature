Feature: Kredi Testi
  Scenario Outline: Kredi Hesaplama Testi

    Given Ziraat Web Sitesine Git
    And Cerezi Kapa "<Cerez>"
    And Menudeki Bireysel Secenegine Tikla
    And Krediler Kismina Tikla
    And Tuketici Kredisi Kismina Tikla
    And Hesaplama Araci Butonuna Tikla
    And Sayfayi Asagi Kaydir
    And Krediyi Sec "<Kredi>"
    And Sayfayi Asagi Kaydir
    And Tutari Yaz "<Tutar>"
    And Vadeyi Yaz "<Vade>"
    Then Hesapla Butonuna Tikla

    Examples:
      | Kredi | Tutar | Vade | Cerez |
      | Tüketici Kredisi | 20000 | 7 | True |
      | Konut Kredisi | 40000 | 12 | False |
      | Taşıt Kredisi | 12000 | 2 | False |