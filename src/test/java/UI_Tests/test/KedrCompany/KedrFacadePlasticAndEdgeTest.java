package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrFacadePlasticAndEdge;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
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
        kedrFacadePlasticAndEdge.scroll3Do();
        kedrFacadePlasticAndEdge.randomEdgeClick();
        kedrFacadePlasticAndEdge.calculateClick();
        kedrFacadePlasticAndEdge.scroll1Do();
        kedrFacadePlasticAndEdge.addToBasketClick();
        kedrFacadePlasticAndEdge.goToBasket();
        kedrFacadePlasticAndEdge.scroll2Do();
        kedrFacadePlasticAndEdge.goToCheckOutClick();
        kedrFacadePlasticAndEdge.qrCodeClick();
        kedrFacadePlasticAndEdge.deliveryCityClick();
        kedrFacadePlasticAndEdge.checkedPaymentBtn();
    }
}
