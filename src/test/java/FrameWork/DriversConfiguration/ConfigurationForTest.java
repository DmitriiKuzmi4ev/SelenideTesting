package FrameWork.DriversConfiguration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;


public class ConfigurationForTest {
    public void startWork() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Red1\\chromedriver.exe"); //Work ARM
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe"); //Home ARM
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 40000;
        Configuration.pollingInterval = 500;
        Configuration.fastSetValue = true;
        Configuration.screenshots = false;
    }

    @BeforeClass
    public void init() {
        startWork();
    }

    @AfterClass
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
