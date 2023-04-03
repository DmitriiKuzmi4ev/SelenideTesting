package UI_Tests.CatalogFactories.KedrCompany.straightFacade;

import FrameWork.Utils.RandomUtils;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrAluminiumColor {

    private static final String BASE_URL = "https://dev.allfdm.ru/";
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("/html/body/header/div/nav/ul/li[1]/a");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("/html/body/div[5]/div/div[2]/div/div/nav/a[1]");
    private final SelenideElement aluminiumColor = $x("/html/body/div[5]/div/div[2]/div[2]/div/div[1]/div/div[3]/a");
    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//*[@id=\"exampleModal\"]/div/form/div/div[3]/button[2]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final ElementsCollection edgeCollection = $$x("//div[contains(@class, \"d-flex mb-2 align-items-center edge-decor-item-parent\")]");
    private final SelenideElement scroll3 = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement scroll1 = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement scroll2 = $x("//a[contains(@data-type, \"go-to-checkout\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js\")]");
    private final SelenideElement goToBasket = $x("//a[contains(@class,  \"in-basket mb-4\")]");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");
    private final SelenideElement qrCode = $x("//span[contains(@class, \"custom-control-label d-block\")]");
    private final SelenideElement deliveryCity = $x("//label[contains(@class, \"delivery-city-label\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");

    public void kedrAluminium() {
        Selenide.open(BASE_URL);
        /*Каталог*/
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фабрика Кедр*/
        kedr.click();
        /*Фасады из пластика*/
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фасады ал. профиль цветной*/
        aluminiumColor.shouldBe(Condition.enabled).click();
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
        scroll3.scrollTo();
        /*Рассчитать стоимость заказа*/
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
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
        qrCode.shouldBe(Condition.enabled).click();
        /*Подтвердить город доставки*/
        deliveryCity.shouldBe(Condition.enabled).click();
        /*Кнопка Оплатить - активна*/
        paymentBtn.shouldBe(Condition.enabled);
    }
}
