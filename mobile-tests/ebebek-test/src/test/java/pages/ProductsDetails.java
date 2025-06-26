package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import static utilities.Driver.driver;

public class ProductsDetails {
    public static MobileElement addToCartBtn =(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/textView_ButtonAddToCart\")"));

}
