package UI_Tests.test;

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
        kedrFacadePlasticAndEdge.kedrPlasticWithEdge();
    }
}
