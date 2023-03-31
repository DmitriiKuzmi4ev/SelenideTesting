package UI_Tests.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FdmFeedBackForm {

    private static final String TEST_NAME = "Тестировщик";
    private static final String TEST_NUMBER = "9950378814";
    private static final String TEST_TEXT = "Произвольный текст - тестирование формы";

    private final SelenideElement inputName = $x("/html/body/div[5]/div/div[6]/div/form/div[2]/input[1]");
    private final SelenideElement inputNumber = $x("/html/body/div[5]/div/div[6]/div/form/div[2]/input[2]");
    private final SelenideElement inputText = $x("/html/body/div[5]/div/div[6]/div/form/div[3]/textarea");
    private final SelenideElement submitBtn = $x("/html/body/div[5]/div/div[6]/div/form/div[4]/button");


    public void fdmFeedBackForm() {

        inputName.sendKeys(TEST_NAME);
        inputNumber.sendKeys(TEST_NUMBER);
        inputText.sendKeys(TEST_TEXT);
        submitBtn.click();

        $x("/html/body/div[5]/div/div[6]/div/form/div[5]/div[1]")
                .shouldHave(Condition.exactText("Сообщение отправлено!"));

    }
}
