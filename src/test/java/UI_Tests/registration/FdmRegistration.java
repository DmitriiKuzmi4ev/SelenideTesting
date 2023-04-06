package UI_Tests.registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FdmRegistration {
    private static final String LAST_NAME = "Тестировщик";
    private static final String VALID_NAME = "Тестировщик";
    private static final String PATRONYMIC_VAL = "Тестировщик";
    private static final String TEST_NUM = "9950378814";
    private static final String TEST_EMAIL = "aaaaa@gmail.com";

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

    /*Подтверждение города*/
    public void applyCity() {
        applyCity.shouldBe(Condition.enabled).click();
    }
    /*Регистрация*/
    public void registrationClick() {
        registration.shouldBe(Condition.enabled).click();
    }
    /*Фамилия*/
    public void insertLastName() {
        lastname.shouldBe(Condition.visible).val(LAST_NAME);
    }
    /*Имя*/
    public void insertName() {
        name.shouldBe(Condition.visible).val(VALID_NAME);
    }
    /*Отчество*/
    public void insertPatronymic() {
        patronymic.shouldBe(Condition.visible).val(PATRONYMIC_VAL);
    }
    /*Номер телефона*/
    public void insertUserPhone() {
        userphone.shouldBe(Condition.visible).val(TEST_NUM);
    }
    /*Почта*/
    public void insertEmal() {
        email.shouldBe(Condition.visible).val(TEST_EMAIL);
    }
    /*Селект выбора города*/
    public void checkedCitySelect() {
        city.shouldBe(Condition.enabled);
    }
    /*Промокод*/
    public void checkedPromocode() {
        promocode.shouldBe(Condition.enabled);
    }
    /*Кнопка регистрации*/
    public void checkedRegistrtionBtn() {
        registrarionBtn.shouldBe(Condition.enabled);
    }
    /*Чек боксы*/
    public void checkedAgreements() {
        agreements1.shouldBe(Condition.enabled).click();
    }


}
