package StepDefinitions;

import Pages.AmazonPages;
import Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;

public class AmazonStepDefinitions {

    WebDriver driver= Driver.getDriver();
    AmazonPages amazonPages=new AmazonPages(driver);

    @Given("Amazon sitesine git")
    public void amazonSitesineGit() {
        AmazonPages.HomePage();
    }
    public void cookiesKabulEt(){
        AmazonPages.acceptCookie();
    }
    @When("arama kutucuğuna tıkla")
    public void aramaKutucugunaTikla() {
        AmazonPages.clickSearch();
    }

    @When("Bilgisayar yaz ve ara")
    public void bilgisayarYazVeAra() {
        AmazonPages.writeProduct();
    }

    @Then("Bilgisayar araması yapıldığını kontrol et")
    public void bilgisayarAramasiYapildiginiKontrolEt() {
        AmazonPages.searchButton();
    }

    @When("Arama sonuçlarında {int}.sayfayı aç")
    public void aramaSonuclarindaSayfayiAc(int arg0) {
        AmazonPages.clickProduct();
    }

    @Then("{int}. sayfanın açıldığını kontrol et")
    public void sayfaninAcildiginiKontrolEt(int arg0) {
        AmazonPages.confirmPages();
    }

    @When("sonuca göre sergilenen ürünlerden rastgele bir ürün seç")
    public void sonucaGoreSergilenenUrunlerdenRastgeleBirUrunSeç() {
        AmazonPages.selectrandomProduct();
    }

    @Then("seçilen ürünün ürün bilgisi ve tutarı txt dosyasına yaz")
    public void secilenUrununUrunBilgisiVeTutariTxtDosyasinaYaz() {
        AmazonPages.writeProductInformation();
    }

    @When("seçilen ürünü sepete ekle")
    public void secilenUrunuSepeteEkle() {
        AmazonPages.addSelectedProduct();
    }

    @Then("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştır.")
    public void urunSayfasindakiFiyatIleSepetteYerAlanUrunFiyatininDogruluguKarsilastir() {
        AmazonPages.equalsProductPrice();
    }

    @Then("Adet arttırılarak ürün adedinin {int} olduğu doğrula")
    public void adetArttirilarakUrunAdedininOlduguDogrula(int arg0) {
        AmazonPages.addPieceConfirmProduct();
    }

    @When("Ürün sepetini boşalt")
    public void urunSepetiniBosalt() {
        AmazonPages.emptyProductCart();
    }

    @Then("Ürün sepetinin boş olduğunu kontrol et")
    public void urunSepetininBosOldugunuKontrolEt() {
        AmazonPages.confirmEmptyProductCart();
    }
}
