package ui_Tests.loginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmLoginPage {

    private static final String AUTH_CODE = "1111";

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement catalog = $x("//a[(@class=\"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement enterBase = $x("//a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement inputNumber = $x("//*[@id=\"phoneInput\"]");
    private final SelenideElement entering = $x("//*[@id=\"loginForm\"]/div[2]/button");
    private final SelenideElement codeInput = $x("//*[@id=\"codeInput\"]");
    private final SelenideElement mainEnter = $x("//*[@id=\"auth-modal\"]/div/div/div/form[1]/div[2]/button");

    private final SelenideElement orders = $x("//a[(@href=\"/orders\")]");
    private final SelenideElement basket = $x("//ul[(@class=\"personal-block-nav\")]//ancestor::a[(@href=\"/main/basket/\")]");
    private final SelenideElement scrollToClear = $x("//a[(@data-href=\"/main/basket/1075/clear\")]");
    private final SelenideElement backToMain = $x("//a[(@href=\"/\")]");


    /*Город выбран верно*/
    public void applyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Каталог*/
    public void catalogClick() {
        Selenide.refresh();
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        Selenide.back();
    }
    /*Кнопка - Вход (на главной)*/
    public void clickEnter() {
        enterBase.shouldBe(Condition.enabled, Duration.ofSeconds(30)).hover().click();
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

    /*Кнопка - Заказы*/
    public void ordersClick() {
        orders.shouldBe(Condition.enabled).click();
    }
    /*Кнопка - Корзина*/
    public void basketClick() {
        basket.shouldBe(Condition.enabled).click();
    }
    /*Скролл к очистке*/
    public void scrollToClearDo() {
        if (scrollToClear.isDisplayed()) {
            System.out.println("Необходимо очистить корзину");
            scrollToClear.scrollTo();
            scrollToClear.shouldBe(Condition.enabled).click();
        } else {
            System.out.println("Корзина пуста.");
            backToMain.shouldBe(Condition.enabled).click();
        }

    }
}









