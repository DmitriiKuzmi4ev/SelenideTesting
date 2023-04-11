package UI_Tests.test.Demfa;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.DemfaCompany.DemfaEmal;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class DemfaEmalTest extends ConfigurationForTest {

    @Test(testName = "Тест - DEMFA - заказ фасада - эмаль", priority = 1)
    public void standartFacadePvhTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        DemfaEmal demfaEmal = new DemfaEmal();
        demfaEmal.catalogClick();
        demfaEmal.demfaClick();
        demfaEmal.facadeEmal();
        demfaEmal.facadeSemiMattClick();
        demfaEmal.randomDecorClick();
        demfaEmal.continue1CLick();
        demfaEmal.randomMillingClick();
        demfaEmal.continue2CLick();
        demfaEmal.heightAreaInsert();
        demfaEmal.widthAreaInsert();
        demfaEmal.scroll1Do();
        demfaEmal.calculateClick();
        demfaEmal.scroll2Do();
        demfaEmal.addToBasketClick();
        demfaEmal.goToBasketClick();
        demfaEmal.scroll3Do();
        demfaEmal.goToCheckOutClick();
        demfaEmal.qrCodeClick();
        demfaEmal.deliveryCityClick();
        demfaEmal.checkedPaymentBtn();

    }
}
