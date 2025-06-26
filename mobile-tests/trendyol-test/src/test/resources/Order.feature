Feature:
  Scenario Outline:
    Given Trendyol Adresine Git
    And Kategorilere tıklanır
    And "<Kategori>" kategorisi secilir
    And "<Alt Kategori> secilir
    And "<Sırala>" sıralama secenegi secilir
    And İlk 2 ürün sepete eklenir
    And Sepetim sayfasına gidilir
    When İkinci ürün sepetten silinir
    And Sepet başarıyla güncellendi yazısı kontrol edilir
    And Kargo Bedava! yazısı kontrol edilir
    And Ürün fiyatı ile Toplam deger kontrol edilir
    When Sepeti Onayla butonuna tıkla
    Then Trendyol hesabınız yok mu? metni üzerinden kontrol edilir

    Examples:
    |      Kategori      |        Alt Kategori       |            Sırala           |
    |     Elektronik     |           Laptop          |       En Yüksek Fiyat       |