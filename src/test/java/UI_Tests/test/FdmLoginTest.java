package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class FdmLoginTest extends ConfigurationForTest {

    @Test(testName = "Тест - авторизация пользователя", priority = 1)
    public void logInTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

    }
}
