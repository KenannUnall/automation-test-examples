package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class Action {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    JavascriptExecutor js =(JavascriptExecutor) driver;

    public void clickFunction(WebElement clickElement) throws InterruptedException {


        clickElement.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.clear();
        sendKeysElement.sendKeys(value);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectOptionFromDropdown(WebElement clickElement, String option) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        Select select = new Select(clickElement);
        select.selectByVisibleText(option);
    }

    public void scrollPageToElement(WebElement Element) throws InterruptedException  {
        wait.until(ExpectedConditions.elementToBeClickable(Element));
        js.executeScript("arguments[0].scrollIntoView();",Element);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hoverOverElement(WebElement element) throws InterruptedException  {
        // Bir elementin üzerine gelmek için hoverover metod
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
