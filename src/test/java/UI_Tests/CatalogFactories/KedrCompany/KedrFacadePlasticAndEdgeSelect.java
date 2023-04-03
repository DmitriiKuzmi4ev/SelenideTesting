package UI_Tests.CatalogFactories.KedrCompany;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class KedrFacadePlasticAndEdgeSelect {

    private static final String BASE_URL = "https://dev.allfdm.ru/";

    private final SelenideElement catalog = $x("//a[contains(@href, \"/main/factory/select-factory/\")]");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("//a[contains(@href, \"/select-facade/plastik/\")]");
    private final SelenideElement facadeWithEdge = $x("//a[contains(@href, \"/catalog/decors/edge\")]");
    private final SelenideElement select1 = $x("//button[contains(@aria-owns,\"bs-select-1\")]");
    private final SelenideElement category1 = $x("//a[contains(@id, \"bs-select-1-1\")]");
    private final SelenideElement select2 = $x("//button[contains(@aria-owns,\"bs-select-2\")]");
    private final SelenideElement gloss = $x("//a[contains(@id, \"bs-select-2-1\")]");
    private final SelenideElement select3 = $x("//button[contains(@aria-owns,\"bs-select-3\")]");
    private final SelenideElement color1 = $x("//a[contains(@id, \"bs-select-3-1\")]");

    public void kedrSelect1() {
        Selenide.open(BASE_URL);
        /*Каталог*/
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Кедр*/
        kedr.shouldBe(Condition.enabled).click();
        /*Фасады из пластика*/
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        /*Фасады без окромления*/
        facadeWithEdge.shouldBe(Condition.enabled).click();
        /*Выбрать категорию*/
        select1.shouldBe(Condition.enabled).click();
        /*Проверка - первый элемент содержит значение Категория 1*/
        category1.shouldHave(Condition.text("Категория 1"));
        /*Выбрать тип*/
        select2.shouldBe(Condition.enabled).click();
        /*Проверка - первый элемент содержит значение Глянец*/
        gloss.shouldHave(Condition.text("Глянец"));
        /*Выбрать цвет*/
        select3.shouldBe(Condition.enabled).click();
        /*Проверка - элементы активны*/
        color1.shouldHave(Condition.enabled);
    }
}
