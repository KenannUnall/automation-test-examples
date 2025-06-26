package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utilities.Driver.driver;

public class ReusableMethods {

    public void clickFunction(MobileElement clickElement){

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            clickElement.click();
        }catch (TimeoutException e){
            System.out.println("Elementin tıklanabilir olmasını beklerken zaman aşımı oldu.");
            e.printStackTrace();
        }

    }
    public void enterFunction(MobileElement enterElement){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        enterElement.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void sendKeysFunction(MobileElement sendKeysElement, String value){

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            sendKeysElement.sendKeys(value);
        }catch (TimeoutException e){
            System.out.println("Elementin yazılabilir olmasını beklerken zaman aşımı oldu.");
            e.printStackTrace();
        }
    }

}
