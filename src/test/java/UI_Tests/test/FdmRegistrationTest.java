package UI_Tests.test;

import FrameWork.DriversConfiguration.ConfigurationForTest;
import UI_Tests.registration.FdmRegistration;
import org.testng.annotations.Test;

public class FdmRegistrationTest extends ConfigurationForTest {

    @Test(testName = "Тест - регистрация пользователя", priority = 1)
    public void logInTest() {
        FdmRegistration fdmRegistration = new FdmRegistration();
        fdmRegistration.fdmRegistration();
    }

}
