package ui_Tests.test.regLogNavFormTests;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.loginAndNavigation.FdmFeedBackForm;
import ui_Tests.loginAndNavigation.FdmLoginPage;
import org.testng.annotations.Test;

public class FdmFeedBackFormTest extends ConfigurationForTest {


    @Test(testName = "Тест - Проверка формы обратной связи", priority = 5)
    public void fdmFeedBackFormTest() {
        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.catalogClick();
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
