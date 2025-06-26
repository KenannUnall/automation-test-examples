package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import static utilities.Driver.driver;

public class PriceRangePage {
    public static MobileElement priceRangeChoosed = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.solidict.ebebek:id/rvFilter\"]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup");
    public static MobileElement applyBtn = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/btApplyFilter\")"));

}
