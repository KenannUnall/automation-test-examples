package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import static utilities.Driver.driver;


public class MainPage {

    public static MobileElement categoriesBtn= driver.findElementById("com.solidict.ebebek:id/navCategories");

    public static MobileElement myCartBtn=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.solidict.ebebek:id/navigation_bar_item_icon_view\").instance(2)"));

}
