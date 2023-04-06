package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class FdmFeedBackForm {

    private static final String TEST_NAME = "Тестировщик";
    private static final String TEST_NUMBER = "9950378814";
    private static final String TEST_TEXT = "Произвольный текст - тестирование формы";

    private final SelenideElement scroll = $x("//button[(@class =\"send-btn\")]");
    private final SelenideElement inputName = $x("//input[(@name=\"name\")]");
    private final SelenideElement inputNumber = $x("//input[(@name=\"tel\")]");
    private final SelenideElement inputText = $x("//textarea[(@name=\"message\")]");
    private final SelenideElement submitBtn = $x("//button[(@class=\"send-btn\")]");
    private final SelenideElement expected = $x("//div[(@class=\"success-message\")]");
    private final SelenideElement actual = $x("//div[(@class=\"success-message\")]");


    /*Скролл к форме*/
    public void scrollToForm() {
        scroll.shouldBe(Condition.enabled).scrollTo();
    }

    /*Ввод имени*/
    public void insertName() {
        inputName.shouldBe(Condition.enabled).sendKeys(TEST_NAME);
    }

    /*Ввод номера*/
    public void insertNumberForm() {
        inputNumber.shouldBe(Condition.enabled).sendKeys(TEST_NUMBER);
    }

    /*Ввод текста*/
    public void insertText() {
        inputText.shouldBe(Condition.enabled).sendKeys(TEST_TEXT);
    }

    /*Клик по кнопке - отправить сообщение*/
    public void clickSubmitBtn() {
        submitBtn.shouldBe(Condition.enabled).click();
    }

    /*Проверка отправки сообщения*/
    public void checkedMessage() {
        actual.shouldHave(Condition.text("Сообщение отправлено!"));
    }

}
