package FrameWork.DriversConfiguration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;


public class ConfigurationForTest {

    private static final String BASE_URL = "https://dev.allfdm.ru/";

    public void startWork() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Red1\\chromedriver.exe"); //Work ARM
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe"); //Home ARM
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 40000;
        Configuration.pollingInterval = 500;
        Configuration.fastSetValue = true;
        Configuration.screenshots = false;
        Selenide.open(BASE_URL);
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
