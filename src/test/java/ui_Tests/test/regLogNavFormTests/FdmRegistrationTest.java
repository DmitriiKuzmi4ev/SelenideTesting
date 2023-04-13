package ui_Tests.test.regLogNavFormTests;

import frameWork.driversConfiguration.ConfigurationForTest;
import ui_Tests.registration.FdmRegistration;
import org.testng.annotations.Test;

public class FdmRegistrationTest extends ConfigurationForTest {

    @Test(testName = "Тест - Проверка формы регистрации пользователя", priority = 1)
    public void fdmRegistrationTest() {
        FdmRegistration fdmRegistration = new FdmRegistration();
        fdmRegistration.applyCity();
        fdmRegistration.registrationClick();
        fdmRegistration.insertLastName();
        fdmRegistration.insertName();
        fdmRegistration.insertPatronymic();
        fdmRegistration.insertUserPhone();
        fdmRegistration.insertEmal();
        fdmRegistration.checkedCitySelect();
        fdmRegistration.checkedPromocode();
        fdmRegistration.checkedRegistrtionBtn();
        fdmRegistration.checkedAgreements();
    }

}
