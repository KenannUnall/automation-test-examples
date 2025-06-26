package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


import static utilities.Driver.driver;

public class FilterPage {
    public static MobileElement priceRangeBtn = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@resource-id=\"com.solidict.ebebek:id/imgArrow\"])[3]");
    public static MobileElement productsSeeBtn = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/btApplyFilter\")"));

}
