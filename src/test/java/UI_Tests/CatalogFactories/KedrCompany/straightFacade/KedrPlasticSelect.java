package UI_Tests.CatalogFactories.KedrCompany.straightFacade;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class KedrPlasticSelect {

    private final SelenideElement catalog = $x("/html/body/header/div/nav/ul/li[1]/a");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("/html/body/div[5]/div/div[2]/div/div/nav/a[1]");
    private final SelenideElement facadeWithOutEdge = $x("/html/body/div[5]/div/div[2]/div[2]/div/div[1]/div/div[1]/a/span");
    private final SelenideElement select1 = $x("//button[contains(@aria-owns,\"bs-select-1\")]");
    private final SelenideElement select2 = $x("//button[contains(@aria-owns,\"bs-select-2\")]");
    private final SelenideElement select3 = $x("//button[contains(@aria-owns,\"bs-select-3\")]");

    /*Каталог*/
    public void catalogClick() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Кедр*/
    public void kedrClick() {
        kedr.click();
    }
    /*Фасады из пластика*/
    public void plasticClick() {
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Фасады без окромления*/
    public void facadeWithoutEdgeClick() {
        facadeWithOutEdge.shouldBe(Condition.enabled).click();
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
