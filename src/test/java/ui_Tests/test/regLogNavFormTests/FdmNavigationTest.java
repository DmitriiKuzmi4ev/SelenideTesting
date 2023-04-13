package ui_Tests.test.regLogNavFormTests;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.loginAndNavigation.FdmLoginPage;
import ui_Tests.loginAndNavigation.FdmNavigation;
import org.testng.annotations.Test;

public class FdmNavigationTest extends ConfigurationForTest {
    @Test(testName = "Тест - Проверка навигации на сайте", priority = 3)
    public void fdmNavigationTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        FdmNavigation fdmNavigation = new FdmNavigation();
        fdmNavigation.clickCatalog();
        fdmNavigation.clickDelivery();
        fdmNavigation.clickPayment();
        fdmNavigation.clickBackorder();
        fdmNavigation.backToMain1();
        fdmNavigation.clickBanner1();
        fdmNavigation.clickBackToMain2();
        fdmNavigation.clickBanner2();
        fdmNavigation.clickBackToMain3();
        fdmNavigation.scroll1();
        fdmNavigation.scroll2();
        fdmNavigation.scroll3();

    }
}
