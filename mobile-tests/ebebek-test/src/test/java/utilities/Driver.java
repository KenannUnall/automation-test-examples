package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AppiumDriver<MobileElement> driver;

    @Before
    public void beforeTest() {
        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "PIXEL");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "9.0");
            cap.setCapability("automationName","UiAutomator2");
            cap.setCapability("app","C:\\Users\\KENAN\\Desktop\\KENAN\\ime\\appium_works\\appium-test\\e_bebek_app_test\\App\\ebebek_5.3.6.0_apkcombo.com.apk");
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        } catch (MalformedURLException mx) {
            System.out.println("Hatalı oluşturulmuş URL istisnası!");
        }
    }
    public static AppiumDriver<MobileElement> getDriver(){
        return driver;
    }


}
