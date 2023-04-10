package UI_Tests.CatalogFactories.KedrCompany.straightFacade;

import FrameWork.Utils.RandomUtils;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrFacadePlastic {
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("//a[(@class=\"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("//a[contains(@href, \"/select-facade/plastik/\")]");
    private final SelenideElement facadeWithOutEdge = $x("/html/body/div[5]/div/div[2]/div[2]/div/div[1]/div/div[1]/a/span");
    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//*[@id=\"exampleModal\"]/div/form/div/div[3]/button[2]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement scroll1 = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement scroll2 = $x("//a[contains(@data-type, \"go-to-checkout\")]");
    private final SelenideElement addToBasket = $x("//a[(@data-href=\"/order/add-to-basket/\")]");
    private final SelenideElement goToBasket = $x("//div[(@class=\"card-body\")]//ancestor::a[(@href=\"/main/basket/\")]");
    private final SelenideElement goToCheckOut = $x("//a[(@class=\"btn btn-lg btn-success w-100 mb-4 cart-payment\")]");
    private final SelenideElement qrCode = $x("//input[(@value=\"raiff\")]//ancestor::label");
    private final SelenideElement qrCodeRadio = $x("//input[(@value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//label[(@for=\"deliveryCityCheckbox\")]");
    private final SelenideElement deliveryCityCheckbox = $x("//input[(@id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");


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

    /*Фасады без окромления*/
    public void facadeWithOutEdgeClick() {
        facadeWithOutEdge.click();
    }

    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
    public void randomDecorClick() {
        SelenideElement element = RandomUtils.getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
    }

    /*Продолжить*/
    public void continue1CLick() {
        continue1.shouldBe(Condition.enabled).click();
    }

    /*Высота*/
    public void heightAreaInsert() {
        heightArea.shouldBe(Condition.enabled).sendKeys(BASE_HEIGHT);
    }

    /*Ширина*/
    public void widthAreaInsert() {
        widthArea.shouldBe(Condition.enabled).sendKeys(BASE_WIDTH);
    }

    /*Рассчитать стоимость заказа*/
    public void calculateClick() {
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Скролл*/
    public void scroll1Do() {
        scroll1.scrollTo();
    }

    /*Добавить в корзину*/
    public void addToBasketClick() {
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }

    /*Перейти в корзину*/
    public void goToBasketClick() {
        goToBasket.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
    }

    /*Скроллим до - перейти к оформлению*/
    public void scroll2Do() {
        scroll2.scrollTo();
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
