package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    static AppiumDriver<MobileElement> driver;

    @Before
    public void beforeTest() {
        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            cap.setCapability("platformName", ConfigReader.getProperty("platformName"));
            cap.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            cap.setCapability("automationName",ConfigReader.getProperty("automationName"));
            cap.setCapability("app",ConfigReader.getProperty("app"));
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void closeDriver(){
        if (driver!=null) { // driver'a deger atanmissa
            driver.close();
            driver=null;
        }
    }
}
