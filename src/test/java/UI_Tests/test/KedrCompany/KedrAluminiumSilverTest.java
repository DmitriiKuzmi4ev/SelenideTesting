package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumSilver;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumSlim;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrAluminiumSilverTest extends ConfigurationForTest {

    @Test(testName = "Тест - Кедр - заказ Фасады алюминиевый профиль - silver", priority = 1)
    public void kedrPlasticTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrAluminiumSilver kedrAluminiumSilver = new KedrAluminiumSilver();
        kedrAluminiumSilver.kedrSilver();
    }
}
