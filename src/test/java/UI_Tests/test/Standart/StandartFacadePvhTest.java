package UI_Tests.test.Standart;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.StandartCompany.StandartFacadePvh;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class StandartFacadePvhTest extends ConfigurationForTest {

    @Test(testName = "Тест - Стандарт - заказ фасада из пластика без окромления", priority = 1)
    public void standartFacadePvhTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        StandartFacadePvh standartFacadePvh = new StandartFacadePvh();
        standartFacadePvh.catalogClick();
        standartFacadePvh.standartClick();
        standartFacadePvh.facadePvhClick();
        standartFacadePvh.facadeStraightClick();
        standartFacadePvh.randomDecorClick();
        standartFacadePvh.continue1CLick();
        standartFacadePvh.randomMillingClick();
        standartFacadePvh.continue2CLick();
        standartFacadePvh.heightAreaInsert();
        standartFacadePvh.widthAreaInsert();
        standartFacadePvh.scroll1Do();
        standartFacadePvh.calculateClick();
        standartFacadePvh.scroll2Do();
        standartFacadePvh.addToBasketClick();
        standartFacadePvh.goToBasketClick();
        standartFacadePvh.scroll3Do();
        standartFacadePvh.goToCheckOutClick();
        standartFacadePvh.qrCodeClick();
        standartFacadePvh.deliveryCityClick();
        standartFacadePvh.checkedPaymentBtn();
    }
}
