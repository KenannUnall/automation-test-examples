package stepDefinition;

import PageObjectModel.Main_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Add_to_card {
    private WebDriver driver;

    private Main_Page mainPage= new Main_Page();

    @Given("go to e-bebek website")
    public void go_to_e_bebek_website() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.e-bebek.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("close the span")
    public void close_the_span() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.click_close_span();
    }
    @Given("type Biberon")
    public void type_biberon() {
        // Write code here that turns the phrase above into concrete actions

        mainPage.typeInput();

    }
    @Given("press to enter")
    public void press_to_enter() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.enter_input_textbox();
    }
    @Given("add to cart the first Biberon")
    public void add_to_cart_the_first_Biberon() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.click_add_to_cart();
    }

    @When("click to Sepeti Gor")
    public void click_to_sepeti_gor() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.click_view_cart();
    }
    @Then("verify the success message.")
    public void verify_the_success_message() {
        System.out.println("Başarı ile tamamlandı");
    }


}
