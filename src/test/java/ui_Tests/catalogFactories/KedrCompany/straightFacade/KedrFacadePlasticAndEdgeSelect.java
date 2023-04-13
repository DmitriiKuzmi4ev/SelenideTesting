package ui_Tests.catalogFactories.KedrCompany.straightFacade;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class KedrFacadePlasticAndEdgeSelect {



    private final SelenideElement catalog = $x("//a[(@href=\"/main/factory/select-factory/\")]//ancestor::li");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("//a[contains(@href, \"/select-facade/plastik/\")]");
    private final SelenideElement facadeWithEdge = $x("//a[contains(@href, \"/catalog/decors/edge\")]");
    private final SelenideElement select1 = $x("//button[contains(@aria-owns,\"bs-select-1\")]");
    private final SelenideElement select2 = $x("//button[contains(@aria-owns,\"bs-select-2\")]");
    private final SelenideElement select3 = $x("//button[contains(@aria-owns,\"bs-select-3\")]");


    /*Каталог*/
    public void catalogClick() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Кедр*/
    public void kedrClick() {
        kedr.shouldBe(Condition.enabled).click();
    }
    /*Фасады из пластика*/
    public void plasticClick() {
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Фасады без окромления*/
    public void facadeWithEdgeClick() {
        facadeWithEdge.shouldBe(Condition.enabled).click();
    }
    /*Выбрать категорию*/
    public void categorySelectClick() {
        select1.shouldBe(Condition.enabled).click();
    }
    /*Выбрать тип*/
    public void typeSelectClick() {
        select2.shouldBe(Condition.enabled).click();
    }
    /*Выбрать цвет*/
    public void colorSelectClick() {
        select3.shouldBe(Condition.enabled).click();
    }
}
