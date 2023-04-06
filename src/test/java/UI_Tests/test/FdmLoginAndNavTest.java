package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmFeedBackForm;
import UI_Tests.LoginAndNavigation.FdmLinks;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import UI_Tests.LoginAndNavigation.FdmNavigation;
import org.testng.annotations.Test;


public class FdmLoginAndNavTest extends ConfigurationForTest {

    @Test(testName = "Тест - форма обратной связи", priority = 3)
    public void feedBackFornTest() {
        FdmFeedBackForm fdmFeedBackForm = new FdmFeedBackForm();
        fdmFeedBackForm.fdmFeedBackForm();
    }
    @Test(testName = "Тест - проверка ссылок на главной странице", priority = 4)
    public void fdmLinksTest() {
        FdmLinks fdmLinks = new FdmLinks();
        fdmLinks.fdmLinksCorrect();
    }


}
