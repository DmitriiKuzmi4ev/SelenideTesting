package UI_Tests.CatalogFactories.DemfaCompany;

import FrameWork.Utils.RandomUtils;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DemfaEmal {

    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("//a[(@class=\"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement demfa = $x("//a[(@href=\"/main/factory/select-factory/demfa/\")]");
    private final SelenideElement facadeEmal = $x("//a[(@href=\"/select-facade/emal-demfa/\")]");
    private final SelenideElement facadeSemiMatt = $x("//a[(@href=\"/catalog/decors/semi-matt-enamel\")]");
    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//div[(@class=\"modal-content\")]//ancestor::button[(@class=\"btn btn-primary\")]");
    private final ElementsCollection millingCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue2 = $x("//div[(@class=\"modal-content\")]//ancestor::button[(@class=\"btn btn-primary\")]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final SelenideElement calculate = $x("//div[(@id=\"calculateButtonBlock\")]//ancestor::button[(@id=\"submitButton\")]");
    private final SelenideElement addToBasket = $x("//div[(@class=\"card-body\")]//ancestor::a[(@data-href=\"/order/add-to-basket/\")]");
    private final SelenideElement goToBasket = $x("//div[(@class=\"card-body\")]//ancestor::a[(@href=\"/main/basket/\")]");
    private final SelenideElement goToCheckOut = $x("//a[(@data-type=\"go-to-checkout\")]");
    private final SelenideElement qrCode = $x("//input[(@value=\"raiff\")]//ancestor::label");
    private final SelenideElement qrCodeRadio = $x("//input[(@value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//label[(@for=\"deliveryCityCheckbox\")]");
    private final SelenideElement deliveryCityCheckbox = $x("//input[(@id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");

    private final SelenideElement scroll1 = $x("//div[(@class=\"text-center mb-4\")]//ancestor::button[(@id=\"submitButton\")]");
    private final SelenideElement scroll2 = $x("//a[(@data-href=\"/order/add-to-basket/\")]");
    private final SelenideElement scroll3 = $x("//a[(@data-type=\"go-to-checkout\")]");

    /*Каталог*/
    public void catalogClick() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Фабрика Стандарт*/
    public void demfaClick() {
        demfa.shouldBe(Condition.enabled).click();
    }

    /*Фасады ПВХ*/
    public void facadeEmal() {
        facadeEmal.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Фасады прямые*/
    public void facadeSemiMattClick() {
        facadeSemiMatt.click();
    }

    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
    public void randomDecorClick() {
        SelenideElement element = RandomUtils.getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
    }
    /*Продолжить*/
    public void continue1CLick() {
        continue1.shouldBe(Condition.exist).click();
    }

    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомную фрезеровку*/
    public void randomMillingClick() {
        SelenideElement element1 = RandomUtils.getRandomElementFromList(millingCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
    }
    /*Продолжить*/
    public void continue2CLick() {
        continue2.shouldBe(Condition.exist).click();
    }

    /*Высота*/
    public void heightAreaInsert() {
        heightArea.shouldBe(Condition.editable).sendKeys(BASE_HEIGHT);
    }

    /*Ширина*/
    public void widthAreaInsert() {
        widthArea.shouldBe(Condition.editable).sendKeys(BASE_WIDTH);
    }

    /*Скролл*/
    public void scroll1Do() {
        scroll1.shouldBe(Condition.visible);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true)", scroll1);
    }

    /*Рассчитать стоимость заказа*/
    public void calculateClick() {
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Скроллим до - добавить в корзину*/
    public void scroll2Do() {
        scroll2.shouldBe(Condition.visible);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true)", scroll2);
    }

    /*Добавить в корзину*/
    public void addToBasketClick() {
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Перейти в корзину*/
    public void goToBasketClick() {
        Selenide.refresh();
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Скроллим до - перейти к оформлению*/
    public void scroll3Do() {
        scroll3.shouldBe(Condition.visible);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true)", scroll3);
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
