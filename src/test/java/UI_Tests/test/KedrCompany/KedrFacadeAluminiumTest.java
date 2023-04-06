package UI_Tests.test.KedrCompany;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.CatalogFactories.KedrCompany.straightFacade.KedrAluminiumColor;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class KedrFacadeAluminiumTest extends ConfigurationForTest{

    @Test(testName = "Тест - Кедр - заказ Фасады алюминиевый профиль - цветной", priority = 1)
    public void kedrPlasticTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        KedrAluminiumColor kedrAluminiumColor = new KedrAluminiumColor();
        kedrAluminiumColor.kedrAluminium();
    }

}