package step_defination;

import PageObjectModel.Action;
import PageObjectModel.KrediHesaplama;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.time.Duration;
import java.util.Objects;

public class MyStepdefs{

    private WebDriver driver;

    private KrediHesaplama krediHesaplama= new KrediHesaplama();

    @And("Tuketici Kredisi Kismina Tikla")
    public void tuketiciKredisiKisminaTikla() throws InterruptedException {
        krediHesaplama.click_tuketici_kredisi();
    }

    @Given("Ziraat Web Sitesine Git")
    public void ziraatWebSitesineGit() throws InterruptedException  {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ziraatbank.com.tr/tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @And("Menudeki Bireysel Secenegine Tikla")
    public void menudekiBireyselSecenegineTikla()  throws InterruptedException {
        krediHesaplama.click_bireysel();

    }

    @And("Hesaplama Araci Butonuna Tikla")
    public void hesaplamaAraciButonunaTikla() throws InterruptedException  {
        krediHesaplama.click_hesaplama_araci();
    }

    @And("Sayfayi Asagi Kaydir")
    public void sayfayiAsagiKaydir() throws InterruptedException  {
        krediHesaplama.scroll_dropdown();
    }

    @And("Krediyi Sec {string}")
    public void krediyiSec(String arg0) throws InterruptedException {
        krediHesaplama.choose_kredi_tur(arg0);
    }

    @And("Tutari Yaz {string}")
    public void tutariYaz(String arg0) throws InterruptedException {
        krediHesaplama.type_tutar(arg0);
    }

    @And("Vadeyi Yaz {string}")
    public void vadeyiYaz(String arg0) throws InterruptedException {
        krediHesaplama.type_vade(arg0);
    }

    @Then("Hesapla Butonuna Tikla")
    public void hesaplaButonunaTikla() throws InterruptedException {
        krediHesaplama.click_hesapla();
    }

    @And("Krediler Kismina Tikla")
    public void kredilerKisminaTikla() throws InterruptedException {
        krediHesaplama.click_krediler();
    }

    @And("Cerezi Kapa {string}")
    public void cereziKapa(String arg0) throws InterruptedException {
        System.out.println(arg0);
        if (Objects.equals(arg0, "True")){
            krediHesaplama.click_cerez();
        }
    }
}
