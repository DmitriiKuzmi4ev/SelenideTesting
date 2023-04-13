package ui_Tests.test.kedrCompany;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.catalogFactories.KedrCompany.straightFacade.KedrPlasticSelect;
import ui_Tests.loginAndNavigation.FdmLoginPage;
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
        kedrPlasticSelect.catalogClick();
        kedrPlasticSelect.kedrClick();
        kedrPlasticSelect.plasticClick();
        kedrPlasticSelect.facadeWithoutEdgeClick();
        kedrPlasticSelect.categorySelectClick();
        kedrPlasticSelect.typeSelectClick();
        kedrPlasticSelect.colorSelectClick();
    }
}
