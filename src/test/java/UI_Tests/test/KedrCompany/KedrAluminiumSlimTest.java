package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumSlim;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrAluminiumSlimTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ Фасады алюминиевый профиль - slim", priority = 1)
    public void kedrAluminiumSlimTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrAluminiumSlim kedrAluminiumSlim = new KedrAluminiumSlim();
        kedrAluminiumSlim.kedrCatalogClick();
        kedrAluminiumSlim.kedrClick();
        kedrAluminiumSlim.plasticClick();
        kedrAluminiumSlim.aluminiumSlimClick();
        kedrAluminiumSlim.randomDecorClick();
        kedrAluminiumSlim.continue1Click();
        kedrAluminiumSlim.insertHeight();
        kedrAluminiumSlim.insertWidth();
        kedrAluminiumSlim.randomEdgeClick();
        kedrAluminiumSlim.scroll1Do();
        kedrAluminiumSlim.calculateClick();
        kedrAluminiumSlim.addToBasketClick();
        kedrAluminiumSlim.goToBasketClick();
        kedrAluminiumSlim.scroll3Do();
        kedrAluminiumSlim.goToCheckOutClick();
        kedrAluminiumSlim.qrCodeClick();
        kedrAluminiumSlim.deliveryCityClick();
        kedrAluminiumSlim.checkedPaymentBtn();
    }
}
