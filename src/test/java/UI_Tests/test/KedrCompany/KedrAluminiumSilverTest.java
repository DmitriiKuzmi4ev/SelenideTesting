package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumSilver;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumSlim;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrAluminiumSilverTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ Фасады алюминиевый профиль - silver", priority = 1)
    public void kedrAluminiumSilverTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrAluminiumSilver kedrAluminiumSilver = new KedrAluminiumSilver();
        kedrAluminiumSilver.catalogClick();
        kedrAluminiumSilver.kedrClick();
        kedrAluminiumSilver.plasticClick();
        kedrAluminiumSilver.aluminiumSilverClick();
        kedrAluminiumSilver.randomDecorClick();
        kedrAluminiumSilver.continue1Click();
        kedrAluminiumSilver.insertHeight();
        kedrAluminiumSilver.insertWidth();
        kedrAluminiumSilver.randomEdgeClick();
        kedrAluminiumSilver.scroll1Do();
        kedrAluminiumSilver.calculateClick();
        kedrAluminiumSilver.addToBasketClick();
        kedrAluminiumSilver.goToBasketClick();
        kedrAluminiumSilver.scroll3Do();
        kedrAluminiumSilver.goToCheckoutClick();
        kedrAluminiumSilver.qrCodeClick();
        kedrAluminiumSilver.deliveryCityClick();
        kedrAluminiumSilver.checkedPaymentBtn();
    }
}
