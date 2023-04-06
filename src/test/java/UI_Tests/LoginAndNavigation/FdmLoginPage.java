package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmLoginPage {

    private static final String BASE_URL = "https://dev.allfdm.ru/";
    private static final String AUTH_CODE = "1111";

    private final SelenideElement title = $x("/html/head/title");
    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enterBase = $x("//a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement inputNumber = $x("//*[@id=\"phoneInput\"]");
    private final SelenideElement entering = $x("//*[@id=\"loginForm\"]/div[2]/button");
    private final SelenideElement codeInput = $x("//*[@id=\"codeInput\"]");
    private final SelenideElement mainEnter = $x("//*[@id=\"auth-modal\"]/div/div/div/form[1]/div[2]/button");
    private final SelenideElement orders = $x("//a[(@href=\"/orders\")]");

    /*Город выбран верно*/
    public void applyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Кнопка - Вход (на главной)*/
    public void clickEnter() {
        enterBase.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Ввод номер телефона (зарегестрированного)*/
    public void insertNumber() {
        inputNumber.shouldBe(Condition.enabled).setValue("9950378814");
    }

    /*Кнопка - Войти*/
    public void clickEntering() {
        entering.shouldBe(Condition.enabled).hover().click();
    }

    /*Ввод 4х значного кода*/
    public void insertCode() {
        codeInput.shouldBe(Condition.enabled).sendKeys(AUTH_CODE);
    }

    /*Кнопка - Войти*/
    public void clickMainEnter() {
        mainEnter.shouldBe(Condition.enabled).hover().click();
    }

}









