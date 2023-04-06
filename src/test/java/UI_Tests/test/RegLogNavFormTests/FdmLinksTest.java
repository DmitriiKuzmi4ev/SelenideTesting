package UI_Tests.test.RegLogNavFormTests;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmLinks;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import UI_Tests.LoginAndNavigation.FdmNavigation;
import org.testng.annotations.Test;

public class FdmLinksTest extends ConfigurationForTest {

    @Test(testName = "Тест - проверка ссылок на главной странице", priority = 1)
    public void logInTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        FdmLinks fdmLinks = new FdmLinks();
        fdmLinks.scrollToLinks();
        fdmLinks.checkedPaymentsLink();
        fdmLinks.checkedAboutLink();
        fdmLinks.checkedPersonalDataLink();
        fdmLinks.checkedConfPolitLink();
        fdmLinks.checkedPublicOfertUrLink();
        fdmLinks.checkedPublicOfertPhLink();

    }
}
