Feature: Proje Ödevi Amazon

  Scenario: Amazon web sitesine git ve arama yap
    Given Amazon sitesine git
    When arama kutucuğuna tıkla
    When Bilgisayar yaz ve ara
    When Bilgisayar araması yapıldığını kontrol et
    When Arama sonuçlarında 2.sayfayı aç
    When 2. sayfanın açıldığını kontrol et
    When sonuca göre sergilenen ürünlerden rastgele bir ürün seç
    When seçilen ürünün ürün bilgisi ve tutarı txt dosyasına yaz
    When seçilen ürünü sepete ekle
    When Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştır.
    When Adet arttırılarak ürün adedinin 2 olduğu doğrula
    When Ürün sepetini boşalt
    Then Ürün sepetinin boş olduğunu kontrol et
