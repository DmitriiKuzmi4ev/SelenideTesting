package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmLinks;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import UI_Tests.LoginAndNavigation.FdmNavigation;
import org.testng.annotations.Test;

public class FdmLinksTest extends ConfigurationForTest {

    @Test(testName = "Тест - навигация на сайте", priority = 1)
    public void logInTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        FdmLinks fdmLinks = new FdmLinks();


    }
}
