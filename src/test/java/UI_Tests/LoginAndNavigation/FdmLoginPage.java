package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.*;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.Selenide.*;

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


    public void fdmLogIn() {
        Selenide.open(BASE_URL);
        /*Город выбран верно*/
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Кнопка - Вход (на главной)*/
        enterBase.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Ввод номер телефона (зарегестрированного)*/
        inputNumber.shouldBe(Condition.enabled).setValue("9950378814");
        /*Кнопка - Войти*/
        entering.shouldBe(Condition.enabled).hover().click();
        /*Ввод 4х значного кода*/
        codeInput.shouldBe(Condition.enabled).sendKeys(AUTH_CODE);
        /*Кнопка - Войти*/
        mainEnter.shouldBe(Condition.enabled).hover().click();

    }






}


