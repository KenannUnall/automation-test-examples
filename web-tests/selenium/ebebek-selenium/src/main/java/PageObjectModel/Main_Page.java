package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Main_Page extends AbstractClass{
    WebDriver driver;

    public Main_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='ins-close-button']")
    private WebElement close_span;
    public void click_close_span(){
        clickFunction(close_span);
    }

    @FindBy(xpath = "//input[@id='txtSearchBox']")
    private WebElement input_textbox;

    public void enter_input_textbox(){
        enterFunction(input_textbox);
    }
    public void typeInput(){
        sendKeysFunction(input_textbox,"Biberon");
    }
    @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']/button[1]")
    private WebElement add_to_cart;
    public void click_add_to_cart(){
        clickFunction(add_to_cart);
    }
    @FindBy(xpath = "//a[@class='btn add']")
    private WebElement view_cart;
    public void click_view_cart(){
        clickFunction(view_cart);
    }

}
