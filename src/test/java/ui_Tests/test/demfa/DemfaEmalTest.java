package ui_Tests.test.demfa;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.catalogFactories.demfaCompany.DemfaEmal;
import ui_Tests.loginAndNavigation.FdmLoginPage;
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

        fdmLoginPage.ordersClick();
        fdmLoginPage.basketClick();
        fdmLoginPage.scrollToClearDo();

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
        demfaEmal.deliveryCityClick();
        demfaEmal.checkedPaymentBtn();

    }
}
