package ui_Tests.test.kedrCompany;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.catalogFactories.KedrCompany.straightFacade.KedrFacadePlastic;
import ui_Tests.loginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrFacadePlasticTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ фасада из пластика без окромления", priority = 1)
    public void kedrPlasticTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrFacadePlastic kedrFacadePlastic = new KedrFacadePlastic();
        kedrFacadePlastic.catalogClick();
        kedrFacadePlastic.kedrClick();
        kedrFacadePlastic.plasticClick();
        kedrFacadePlastic.facadeWithOutEdgeClick();
        kedrFacadePlastic.randomDecorClick();
        kedrFacadePlastic.continue1CLick();
        kedrFacadePlastic.heightAreaInsert();
        kedrFacadePlastic.widthAreaInsert();
        kedrFacadePlastic.calculateClick();
        kedrFacadePlastic.scroll1Do();
        kedrFacadePlastic.addToBasketClick();
        kedrFacadePlastic.goToBasketClick();
        kedrFacadePlastic.scroll2Do();
        kedrFacadePlastic.goToCheckOutClick();
        kedrFacadePlastic.deliveryCityClick();
        kedrFacadePlastic.checkedPaymentBtn();
    }
}
