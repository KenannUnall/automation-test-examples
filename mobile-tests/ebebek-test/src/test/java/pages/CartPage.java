package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.driver;

public class CartPage {

    public static MobileElement productIncrease = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/lytPlusQuantity\")"));
    public static MobileElement shoppingComplete = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("text(\"Alışverişi Tamamla\")"));

}
