package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.driver;

public class SubCategoriesPage {

    public static MobileElement selectedCategory= driver.findElementByXPath("(//android.widget.LinearLayout[@resource-id=\"com.solidict.ebebek:id/linearLayout_ExpandItem\"])[3]/android.widget.RelativeLayout");



}
