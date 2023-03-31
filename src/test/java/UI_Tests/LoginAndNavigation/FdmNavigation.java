package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FdmNavigation {

    private final SelenideElement catalog = $x("/html/body/header/div/nav/ul/li[1]/a");
    private final SelenideElement delivery = $x("/html/body/header/div/nav/ul/li[2]/a");
    private final SelenideElement payment = $x("/html/body/header/div/nav/ul/li[3]/a");
    private final SelenideElement backOrder = $x("/html/body/header/div/nav/ul/li[4]/a");
    private final SelenideElement backToMain = $x("/html/body/header/div/a/img");
    private final SelenideElement banner1 = $x("/html/body/div[5]/div/div[1]/div/a");
    private final SelenideElement banner2 = $x("/html/body/div[5]/div/div[1]/div/div/a");
    private final SelenideElement gate2 = $x("/html/body/div[5]/div/div[4]/div/div/a");

    private final SelenideElement scroll1 = $x("/html/body/div[5]/div/div[5]/div/div[1]");
    private final SelenideElement scroll2 = $x("/html/body/div[5]/div/div[6]/div/form/div[5]/button");

    public void fdmNavigation() {

        /*Каталог*/
        catalog.click();
        $x("/html/body/div[5]/div/div[1]/div/h1").shouldHave(Condition.exactText("Каталог производителей"));
        /*Доставка*/
        delivery.click();
        $x("/html/body/div[5]/div/div[1]/div/h1").shouldHave(Condition.exactText("Доставка"));
        /*Оплата*/
        payment.click();
        $x("/html/body/div[5]/div/div[1]/div/h1").shouldHave(Condition.exactText("Оплата"));
        /*Возврат*/
        backOrder.click();
        $x("/html/body/div[5]/div/div[1]/div/h1").shouldHave(Condition.exactText("Возврат"));
        /*Главная*/
        backToMain.click();
        /*Баннер 1 - основной*/
        banner1.shouldBe(Condition.enabled).click();
        /*Главная*/
        backToMain.click();
        /*Баннер 2 - образцы в подарок*/
        banner2.shouldBe(Condition.enabled).click();
        /*Главная*/
        backToMain.click();
        /*Скролл страницы*/
        scroll1.scrollTo();
        /*Кнопка перехода в каталог фабрик 2*/
        gate2.shouldBe(Condition.enabled);
        /*Скролл страницы*/
        scroll2.scrollTo();
    }
}
