package UI_Tests.CatalogFactories.KedrCompany.straightFacade;

import FrameWork.Utils.RandomUtils;
import com.codeborne.selenide.*;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrAluminiumSilver {

    private static final String BASE_URL = "https://dev.allfdm.ru/";
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("//a[(@class=\"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("/html/body/div[5]/div/div[2]/div/div/nav/a[1]");
    private final SelenideElement aluminiumSlim = $x("//a[@data-slug=\"plast-Al-color-slim\"]");
    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//*[@id=\"exampleModal\"]/div/form/div/div[3]/button[2]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final ElementsCollection edgeCollection = $$x("//div[contains(@class, \"d-flex mb-2 align-items-center edge-decor-item-parent\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js\")]");
    private final SelenideElement goToBasket = $x("//a[(@class=\"btn btn-lg btn-success w-100 in-basket mb-4\")]");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");
    private final SelenideElement qrCode = $x("//input[(@type=\"radio\" and @value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//input[(@type=\"checkbox\" and @id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");


    private final SelenideElement scroll1 = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement scroll2 = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement scroll2_2 = $x("//div[(@class=\"card-body text-center\")]");
    private final SelenideElement scroll3 = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");

    public void kedrSilver() {
        Selenide.open(BASE_URL);
        /*Каталог*/
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фабрика Кедр*/
        kedr.shouldBe(Condition.enabled).click();
        /*Фасады из пластика*/
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фасады ал. профиль цветной*/
        aluminiumSlim.shouldBe(Condition.enabled).click();
        /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
        SelenideElement element = RandomUtils
                .getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
        /*Продолжить*/
        continue1.shouldBe(Condition.enabled).click();
        /*Высота*/
        heightArea.shouldBe(Condition.enabled).sendKeys(BASE_HEIGHT);
        /*Ширина*/
        widthArea.shouldBe(Condition.enabled).sendKeys(BASE_WIDTH);
        /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор кромки*/
        SelenideElement element1 = RandomUtils
                .getRandomElementFromList(edgeCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
        /*Скролл к кнопке - рассчитать*/
        scroll1.scrollTo();
        /*Рассчитать стоимость заказа*/
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        scroll2.scrollTo();
        /*Добавить в корзину*/
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        scroll2_2.scrollTo();
        /*Перейти в корзину*/
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Скроллим до - перейти к оформлению*/
        scroll3.scrollTo();
        /*Перейти к оформлению*/
        goToCheckOut.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Выбрать оплату по QR*/
        qrCode.click(ClickOptions.usingJavaScript());
        qrCode.shouldBe(Condition.selected);
        /*Подтвердить город доставки*/
        deliveryCity.click(ClickOptions.usingJavaScript());
        deliveryCity.shouldBe(Condition.selected);
        /*Кнопка Оплатить - активна*/
        paymentBtn.shouldBe(Condition.enabled);
    }
}
