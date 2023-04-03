package UI_Tests.registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FdmRegistration {
    private static final String LAST_NAME = "Тестировщик";
    private static final String VALID_NAME = "Тестировщик";
    private static final String PATRONYMIC_VAL = "Тестировщик";
    private static final String TEST_NUM = "9950378814";
    private static final String TEST_EMAIL = "aaaaa@gmail.com";
    private static final String BASE_URL = "https://dev.allfdm.ru/";

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement registration = $x("//a[contains(@href, \"/personal/registration\")]");
    private final SelenideElement lastname = $x("//input[contains(@id, \"user_profile_lastname\")]");
    private final SelenideElement name = $x("//input[contains(@id, \"user_profile_name\")]");
    private final SelenideElement patronymic = $x("//input[contains(@id, \"user_profile_patronymic\")]");
    private final SelenideElement userphone = $x("//input[contains(@id, \"user_profile_phone\")]");
    private final SelenideElement email = $x("//input[contains(@id, \"user_profile_email\")]");
    private final SelenideElement city = $x("//span[contains(@id, \"select2-user_profile_\")]");
    private final SelenideElement promocode = $x("//input[contains(@id, \"user_profile_promoCode\")]");
    private final SelenideElement agreements1 = $x("//input[contains(@id, \"user_profile_agreeTerms\")]");
    private final SelenideElement registrarionBtn = $x("//button[contains(@class, \"btn g-btn g-btn--orange\")]");

    public void fdmRegistration() {
        Selenide.open(BASE_URL);
        /*Подтверждение города*/
        applyCity.shouldBe(Condition.enabled).click();
        /*Регистрация*/
        registration.shouldBe(Condition.enabled).click();
        /*Фамилия*/
        lastname.shouldBe(Condition.visible).val(LAST_NAME);
        /*Имя*/
        name.shouldBe(Condition.visible).val(VALID_NAME);
        /*Отчетсов*/
        patronymic.shouldBe(Condition.visible).val(PATRONYMIC_VAL);
        /*Номер телефона*/
        userphone.shouldBe(Condition.visible).val(TEST_NUM);
        /*Почта*/
        email.shouldBe(Condition.visible).val(TEST_EMAIL);
        /*Селект выбора города*/
        city.shouldBe(Condition.enabled);
        /*Промокод*/
        promocode.shouldBe(Condition.enabled);
        /*Кнопка регистрации*/
        registrarionBtn.shouldBe(Condition.enabled);
        /*Чек боксы*/
        agreements1.shouldBe(Condition.enabled).click();

    }


}
