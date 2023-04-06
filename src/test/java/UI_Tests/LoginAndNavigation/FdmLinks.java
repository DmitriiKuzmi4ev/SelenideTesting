package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FdmLinks {

    private final SelenideElement linkPayments = $x("//a[(@href =\"/kontakty\")]");
    private final SelenideElement linkAbout = $x("//a[(@href =\"/o-nas\")]");
    private final SelenideElement personalDataPolitics = $x("//a[(@href =\"/docs/personal.pdf?v3\")]");
    private final SelenideElement confPolitics = $x("//a[(@href =\"/docs/privacy.pdf?v3\")]");
    private final SelenideElement publicOfertUr = $x("//a[(@href =\"/docs/offer_legal_entity.pdf\")]");
    private final SelenideElement publicOferPhis = $x("//a[(@href =\"/offer.pdf\")]");

    /*Скролл*/
    public void scrollToLinks() {
        linkPayments.shouldBe(Condition.visible).scrollTo();
        if (!linkPayments.isEnabled()) {
            System.out.println("Ссылка- Реквизиты не работает");
        }
    }
    /*Реквизиты*/
    public void checkedPaymentsLink() {
        linkPayments.shouldHave(attribute("href"));
    }
    /*О нас*/
    public void checkedAboutLink() {
        if (!linkAbout.isEnabled()) {
            System.out.println("Ссылка - О нас не работает");
        }
        linkAbout.shouldHave(attribute("href"));
    }
    /*Политика обработки персональных данных*/
    public void checkedPersonalDataLink() {
        if (!personalDataPolitics.isEnabled()) {
            System.out.println("Ссылка - Политика обработки персональных данных не работает");
        }
        personalDataPolitics.shouldHave(attribute("href"));
    }
    /*Политика конфедециальности*/
    public void checkedConfPolitLink() {
        if (!confPolitics.isEnabled()) {
            System.out.println("Ссылка - Политика конфиденциальности не работает");
        }
        confPolitics.shouldHave(attribute("href"));
    }
    /*Публичная оферта для юр лиц*/
    public void checkedPublicOfertUrLink() {
        if (!publicOfertUr.isEnabled()) {
            System.out.println("Ссылка - Публичная оферта для юр. лиц не работает");
        }
        publicOfertUr.shouldHave(attribute("href"));
    }
    /*Публичная оферта для физ лиц*/
    public void checkedPublicOfertPhLink() {
        if (!publicOferPhis.isEnabled()) {
            System.out.println("Ссылка - Публичная оферта для физ. лиц не работает");
        }
        publicOferPhis.shouldHave(attribute("href"));
    }
}
