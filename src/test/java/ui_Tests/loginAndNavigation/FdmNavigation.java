package ui_Tests.loginAndNavigation;

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
    private final SelenideElement itemPrices = $x("//div[(@class=\"item prices\")]");
    private final SelenideElement swiperNext = $x("//div[(@class =\"swiper-navigation swiper-button-next\")]");
    private final SelenideElement sendBtn = $x("//button[(@class =\"send-btn\")]");


    /*Каталог*/
    public void clickCatalog() {
        catalog.shouldBe(Condition.enabled).click();
    }

    /*Доставка*/
    public void clickDelivery() {
        delivery.shouldBe(Condition.enabled).click();
    }

    /*Оплата*/
    public void clickPayment() {
        payment.shouldBe(Condition.enabled).click();
    }

    /*Возврат*/
    public void clickBackorder() {
        backOrder.click();
    }

    /*Главная*/
    public void backToMain1() {
        backToMain.click();
    }

    /*Баннер 1 - основной*/
    public void clickBanner1() {
        banner1.shouldBe(Condition.visible).click();
    }

    /*Главная*/
    public void clickBackToMain2() {
        backToMain.click();
    }

    /*Баннер 2 - образцы в подарок*/
    public void clickBanner2() {
        banner2.shouldBe(Condition.visible).click();
    }

    /*Главная*/
    public void clickBackToMain3() {
        backToMain.shouldBe(Condition.enabled).click();
    }

    /*Скролл*/
    public void scroll1() {
        itemPrices.shouldBe(Condition.visible).scrollTo();
    }

    /*Скролл*/
    public void scroll2() {
        swiperNext.shouldBe(Condition.enabled).scrollTo();
    }

    /*Скролл*/
    public void scroll3() {
        sendBtn.shouldBe(Condition.enabled).scrollTo();
    }

}
