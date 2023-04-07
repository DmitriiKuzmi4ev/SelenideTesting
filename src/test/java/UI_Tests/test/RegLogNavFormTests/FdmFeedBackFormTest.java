package UI_Tests.test.RegLogNavFormTests;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.LoginAndNavigation.FdmFeedBackForm;
import UI_Tests.LoginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class FdmFeedBackFormTest extends ConfigurationForTest {


    @Test(testName = "Тест - Проверка формы обратной связи", priority = 1)
    public void fdmFeedBackFormTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();

        FdmFeedBackForm fdmFeedBackForm = new FdmFeedBackForm();
        fdmFeedBackForm.scrollToForm();
        fdmFeedBackForm.insertName();
        fdmFeedBackForm.insertNumberForm();
        fdmFeedBackForm.insertText();
        fdmFeedBackForm.clickSubmitBtn();
        fdmFeedBackForm.checkedMessage();
    }
}
