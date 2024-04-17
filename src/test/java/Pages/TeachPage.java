package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class TeachPage {
    public static final SelenideElement listOfTrainingsTitle = $(".page-header h1");
    public static final String listOfTrainingsTitleText = "Список тренингов";

    public void checkListOfTrainingsTitleShown() {
        listOfTrainingsTitle.shouldHave(text(listOfTrainingsTitleText), ofSeconds(10));
    }
}
