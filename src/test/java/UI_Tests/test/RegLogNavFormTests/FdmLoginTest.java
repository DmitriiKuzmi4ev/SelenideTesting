package UI_Tests.test.RegLogNavFormTests;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class FdmLoginTest extends ConfigurationForTest {

    @Test(testName = "Тест - Проверка авторизации пользователя", priority = 1)
    public void logInTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        fdmLoginPage.ordersClick();
        fdmLoginPage.basketClick();
        fdmLoginPage.scrollToClearDo();

    }
    @Test(testName = "Тест - Проверка наличия бланков в корзине", priority = 2)
    public void checkedBasket() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.ordersClick();
        fdmLoginPage.basketClick();
        fdmLoginPage.scrollToClearDo();
    }


}
