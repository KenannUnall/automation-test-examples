package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KrediHesaplama extends Action {
    WebDriver driver;

    public KrediHesaplama(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//div[@class='header-right']//a[text()='Bireysel'])[1]")
    private WebElement bireysel;
    public void click_bireysel() throws InterruptedException {
        Actions act=new Actions(driver);
        act.moveToElement(bireysel).perform();
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//div[@class='credit-menu']//a")
    private WebElement kredi_tur;
    public void choose_kredi_tur(String arg0) throws InterruptedException {
        clickFunction(kredi_tur);
        String xpath = String.format("//div[@class='list active']//span[text()='%s']", arg0);
        clickFunction(driver.findElement(By.xpath(xpath)));
    }

    @FindBy(xpath = "//ul[@class='link-col-1 clearfix']//a[text()='Tüketici Kredisi']")
    private WebElement tuketici_kredisi;
    public void click_tuketici_kredisi() throws InterruptedException {
        clickFunction(tuketici_kredisi);
    }

    @FindBy(xpath = "(//a[text()='Krediler'])[4]")
    private WebElement krediler;
    public void click_krediler() throws InterruptedException {
        clickFunction(krediler);
    }

    @FindBy(xpath = "(//a[text()='HESAPLAMA ARACI'])[1]")
    private WebElement hesaplama_araci;
    public void click_hesaplama_araci() throws InterruptedException {
        clickFunction(hesaplama_araci);
    }

    @FindBy(xpath = "//a[@class='selected']")
    private WebElement dropdown;
    public void scroll_dropdown() throws InterruptedException {
        scrollPageToElement(dropdown);
    }

    @FindBy(xpath = "//a[@class='icon-close']")
    private WebElement cerez;
    public void click_cerez() throws InterruptedException {
        clickFunction(cerez);
    }

    @FindBy(xpath = "//input[@type='tel' and @maxlength='10']")
    private WebElement tutar_input;
    public void type_tutar(String tutar) throws InterruptedException {
        sendKeysFunction(tutar_input,tutar);
    }

    @FindBy(xpath = "//a[text()='HESAPLA']")
    private WebElement hesapla;
    public void click_hesapla() throws InterruptedException {
        clickFunction(hesapla);
    }

    @FindBy(xpath = "//input[@type='tel' and @maxlength='3']")
    private WebElement vade_input;
    public void type_vade(String vade) throws InterruptedException {
        sendKeysFunction(vade_input,vade);
    }




}
