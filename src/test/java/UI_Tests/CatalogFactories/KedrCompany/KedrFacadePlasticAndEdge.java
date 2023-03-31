package UI_Tests.CatalogFactories.KedrCompany;

import FrameWork.Utils.RandomUtils;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrFacadePlasticAndEdge {
    private static final String BASE_URL = "https://dev.allfdm.ru/";
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("//a[contains(@class, \"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("//a[contains(@href, \"/select-facade/plastik/\")]");
    private final SelenideElement facadeWithEdge = $x("//a[contains(@href, \"/catalog/decors/edge\")]");
    private final ElementsCollection decorCollection = $$x("//a[contains(@class, \"card d-block m-0 decor-item-button\")]");
    private final SelenideElement continue1 = $x("//button[contains(@class, \"btn btn-primary\")]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final SelenideElement scroll3 = $x("//button[contains(@class, \"btn btn-success mb-4 disabled\")]");
    private final ElementsCollection edgeCollection = $$x("//div[contains(@class, \"d-flex mb-2 align-items-center edge-decor-item-parent\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement scroll1 = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement scroll2 = $x("//a[contains(@data-type, \"go-to-checkout\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js \")]");
    private final SelenideElement goToBasket = $x("//a[contains(@class, \"in-basket mb-4\")]");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");
    private final SelenideElement qrCode = $x("//span[contains(@class, \"custom-control-label d-block\")]");
    private final SelenideElement deliveryCity = $x("//label[contains(@class, \"delivery-city-label\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");

    public void kedrPlasticWithEdge() {
        Selenide.open(BASE_URL);
        /*Каталог*/
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фабрика Кедр*/
        kedr.click();
        /*Фасады из пластика*/
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фасады с кромкой*/
        facadeWithEdge.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
        SelenideElement element = RandomUtils.getRandomElementFromList(decorCollection
                .shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
        /*Продолжить*/
        continue1.click();
        /*Высота*/
        heightArea.sendKeys(BASE_HEIGHT);
        /*Ширина*/
        widthArea.sendKeys(BASE_WIDTH);
        /*Скролл страницы*/
        scroll3.scrollTo();
        /*Этап выбора декора кромки*/
        SelenideElement element1 = RandomUtils.getRandomElementFromList(edgeCollection
                .shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
        /*Рассчитать стоимость заказа*/
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Скролл страницы*/
        scroll1.scrollTo();
        /*Добавить в корзину*/
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Перейти в корзину*/
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Скроллим до - перейти к оформлению*/
        scroll2.scrollTo();
        /*Перейти к оформлению*/
        goToCheckOut.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Выбрать оплату по QR*/
        qrCode.click();
        /*Подтвердить город доставки*/
        deliveryCity.click();
        /*Кнопка Оплатить - активна*/
        paymentBtn.shouldBe(Condition.enabled);
    }
}
