package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrPlasticSelect;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrPlasticSelectsTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - работа выпадающих селектов в фасадах из пластика", priority = 1)
    public void kerdSelectTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrPlasticSelect kedrPlasticSelect = new KedrPlasticSelect();
        kedrPlasticSelect.kedrSelect();
    }
}
