package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import pages.*;

import java.util.concurrent.TimeUnit;


import static utilities.Driver.driver;

@RunWith(Cucumber.class)
public class MyStepdefs {


    @Given("kategorilere tiklar")
    public void kategorilere_tiklar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MainPage.categoriesBtn.click();
    }
    @And("herhangi bir kategori secer")
    public void herhangi_bir_kategori_secer() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CategoriesPage.selectedCategory.click();
    }
    @And("herhangi bir alt kategori secer")
    public void herhangi_bir_alt_kategori_secer() {
        SubCategoriesPage.selectedCategory.click();
    }
    @When("filtreleye tiklar")
    public void filtreleye_tiklar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ProductsPage.filterBtn.click();
    }
    @And("fiyat Araligi secer")
    public void fiyat_araligi_secer() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        FilterPage.priceRangeBtn.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PriceRangePage.priceRangeChoosed.click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PriceRangePage.applyBtn.click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        FilterPage.productsSeeBtn.click();

    }
    @And("siralaya tiklar")
    public void siralaya_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ProductsPage.sortBtn.click();
    }
    @When("cok degerlendirilenler secenegini secer")
    public void cok_degerlendirilenler_secenegini_secer() throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ProductsPage.sortChoosed.click();
    }
    @And("ilk urunu sepete ekler")
    public void ilk_urunu_sepete_ekler() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ProductsPage.firstProduct.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ProductsDetails.addToCartBtn.click();

    }
    @When("sepete tiklar")
    public void sepete_tiklar() {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MainPage.myCartBtn.click();
    }
    @And("urunun arttirip fiyat kontrolu yapar")
    public void urunun_arttirip_fiyat_kontrolu_yapar() {
        try {
            for (int i=0; i<3;i++){
                CartPage.productIncrease.click();

            }
        }catch (Exception e){
            System.out.println("Stokta yeterli ürün bulunmamaktadır.");
        }

    }
    @Then("alisverisi tamamla butonuna tiklar")
    public void alisverisi_tamamla_butonuna_tiklar() {
        CartPage.shoppingComplete.click();
    }

}
