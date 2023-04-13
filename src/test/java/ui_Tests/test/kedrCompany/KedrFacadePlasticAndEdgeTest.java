package ui_Tests.test.kedrCompany;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.catalogFactories.KedrCompany.straightFacade.KedrFacadePlasticAndEdge;
import ui_Tests.loginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrFacadePlasticAndEdgeTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ фасада из пластика с кромкой", priority = 1)
    public void kedrPlasticAndEdgeTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrFacadePlasticAndEdge kedrFacadePlasticAndEdge = new KedrFacadePlasticAndEdge();
        kedrFacadePlasticAndEdge.catalogClick();
        kedrFacadePlasticAndEdge.kedrClick();
        kedrFacadePlasticAndEdge.plasticClick();
        kedrFacadePlasticAndEdge.facadeWithEdgeClick();
        kedrFacadePlasticAndEdge.randomDecorClick();
        kedrFacadePlasticAndEdge.continue1Click();
        kedrFacadePlasticAndEdge.insertHeight();
        kedrFacadePlasticAndEdge.insertWidth();
        kedrFacadePlasticAndEdge.scroll1Do();
        kedrFacadePlasticAndEdge.randomEdgeClick();
        kedrFacadePlasticAndEdge.calculateClick();
        kedrFacadePlasticAndEdge.scroll2Do();
        kedrFacadePlasticAndEdge.addToBasketClick();
        kedrFacadePlasticAndEdge.goToBasket();
        kedrFacadePlasticAndEdge.scroll3Do();
        kedrFacadePlasticAndEdge.goToCheckOutClick();
        kedrFacadePlasticAndEdge.qrCodeClick();
        kedrFacadePlasticAndEdge.deliveryCityClick();
        kedrFacadePlasticAndEdge.checkedPaymentBtn();
    }
}
