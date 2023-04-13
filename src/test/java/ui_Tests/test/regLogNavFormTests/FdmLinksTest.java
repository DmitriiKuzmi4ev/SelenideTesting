package ui_Tests.test.regLogNavFormTests;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.loginAndNavigation.FdmLinks;
import ui_Tests.loginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class FdmLinksTest extends ConfigurationForTest {

    @Test(testName = "Тест - Проверка ссылок на главной странице", priority = 4)
    public void fdmLinksTest() {
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
