package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrFacadePlastic;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrFacadePlasticTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ фасада из пластика без окромления", priority = 1)
    public void kedrPlasticTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.fdmLogIn();
        KedrFacadePlastic kedrFacadePlastic = new KedrFacadePlastic();
        kedrFacadePlastic.kedrPlastic();
    }
}
