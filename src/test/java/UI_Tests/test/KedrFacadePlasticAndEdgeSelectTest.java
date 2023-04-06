package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrFacadePlasticAndEdgeSelect;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrFacadePlasticAndEdgeSelectTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - работа выпадающих селектов в фасадах из пластика с кромкой", priority = 1)
    public void kerdSelectTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrFacadePlasticAndEdgeSelect kedrFacadePlasticWithEdgeSelect = new KedrFacadePlasticAndEdgeSelect();
        kedrFacadePlasticWithEdgeSelect.kedrSelect1();
    }
}
