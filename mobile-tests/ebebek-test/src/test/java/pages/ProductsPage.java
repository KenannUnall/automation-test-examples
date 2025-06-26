package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.driver;

public class ProductsPage {

    public static MobileElement filterBtn= (MobileElement) driver.findElementById("com.solidict.ebebek:id/linearLayout_ProductFilter");

    public static MobileElement sortBtn= (MobileElement) driver.findElementById("com.solidict.ebebek:id/linearLayout_ProductSorting");

    public static MobileElement sortChoosed= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(12)"));

    public static MobileElement firstProduct = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/btAddToCart_\").instance(0)"));



}
