package ui_Tests.catalogFactories.KedrCompany.straightFacade;

import frameWork.utils.RandomUtils;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrFacadePlasticAndEdge {
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
    private final ElementsCollection edgeCollection = $$x("//div[contains(@class, \"d-flex mb-2 align-items-center edge-decor-item-parent\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js \")]");
    private final SelenideElement goToBasket = $x("//div[(@class=\"card-body\")]//ancestor::a[(@href=\"/main/basket/\")]");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");
    private final SelenideElement qrCode = $x("//input[(@value=\"raiff\")]//ancestor::label");
    private final SelenideElement qrCodeRadio = $x("//input[(@value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//label[contains(@class, \"delivery-city-label\")]");
    private final SelenideElement deliveryCityCheckbox = $x("//input[(@id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");

    private final SelenideElement scroll1 = $x("//button[contains(@class, \"btn btn-success mb-4 disabled\")]");
    private final SelenideElement scroll2 = $x("//a[(@data-href=\"/order/add-to-basket/\")]");
    private final SelenideElement scroll3 = $x("//a[(@data-type=\"go-to-checkout\")]");


    /*Каталог*/
    public void catalogClick() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Фабрика Кедр*/
    public void kedrClick() {
        kedr.shouldBe(Condition.enabled).click();
    }
    /*Фасады из пластика*/
    public void plasticClick() {
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Фасады с кромкой*/
    public void facadeWithEdgeClick() {
        facadeWithEdge.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
    public void randomDecorClick() {
        SelenideElement element = RandomUtils.getRandomElementFromList(decorCollection
                .shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
    }
    /*Продолжить*/
    public void continue1Click() {
        continue1.shouldBe(Condition.enabled).click();
    }
    /*Высота*/
    public void insertHeight() {
        heightArea.shouldBe(Condition.enabled).sendKeys(BASE_HEIGHT);
    }
    /*Ширина*/
    public void insertWidth() {
        widthArea.shouldBe(Condition.enabled).sendKeys(BASE_WIDTH);
    }
    /*Скролл страницы*/
    public void scroll1Do() {
        scroll1.scrollTo();
    }
    /*Этап выбора декора кромки*/
    public void randomEdgeClick() {
        SelenideElement element1 = RandomUtils.getRandomElementFromList(edgeCollection
                .shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
    }
    /*Рассчитать стоимость заказа*/
    public void calculateClick() {
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Скролл страницы*/
    public void scroll2Do () {
        scroll2.scrollTo();
    }
    /*Добавить в корзину*/
    public void addToBasketClick() {
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Перейти в корзину*/
    public void goToBasket() {
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Скроллим до - перейти к оформлению*/
    public void scroll3Do() {
        scroll3.scrollTo();
    }
    /*Перейти к оформлению*/
    public void goToCheckOutClick() {
        goToCheckOut.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Выбрать оплату по QR*/
    public void qrCodeClick() {
        qrCode.click();
        if (!qrCodeRadio.isSelected()) {
            System.out.println("Ошибка - кнопка оплатить по QR коду не рабтает");
        }
    }

    /*Подтвердить город доставки*/
    public void deliveryCityClick() {
        deliveryCity.click();
        if (!deliveryCityCheckbox.isSelected()) {
            System.out.println("Ошибка - чекбокс - подтвердить город доставки не работает");
        }
    }

    /*Кнопка Оплатить - активна*/
    public void checkedPaymentBtn() {
        if (!paymentBtn.isEnabled()) {
            System.out.println("Ошибка - кнопка оплатить не активна");
        }
    }
}
