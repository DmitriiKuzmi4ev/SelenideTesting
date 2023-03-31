package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class FdmLinks {

    private final SelenideElement linkPayments = $("body > footer > div > div.footer__politic > p:nth-child(3) > a");
    private final SelenideElement linkAbout = $("body > footer > div > div.footer__politic > p:nth-child(6) > a");
    private final SelenideElement personalDataPolitics = $("body > footer > div > div.footer__politic > p:nth-child(1) > a");
    private final SelenideElement confPolitics = $("body > footer > div > div.footer__politic > p:nth-child(4) > a");
    private final SelenideElement publicOfertUr = $("body > footer > div > div.footer__politic > p:nth-child(2) > a");
    private final SelenideElement publicOferPhis = $("body > footer > div > div.footer__politic > p:nth-child(5) > a");

    public void fdmLinksCorrect() {

        /*Реквизиты*/
        linkPayments.shouldHave(attribute("href"));
        /*О нас*/
        linkAbout.shouldHave(attribute("href"));
        /*Политика обработки персональных данных*/
        personalDataPolitics.shouldHave(attribute("href"));
        /*Политика конфедециальности*/
        confPolitics.shouldHave(attribute("href"));
        /*Публичная оферта для юр лиц*/
        publicOfertUr.shouldHave(attribute("href"));
        /*Публичная оферта для физ лиц*/
        publicOferPhis.shouldHave(attribute("href"));

    }
}
