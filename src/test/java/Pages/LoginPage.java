package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final String LOGIN_PAGE_URL = "https://school.qa.guru/";

    public static final SelenideElement activeFrame = $(".active-state");
    public static final SelenideElement emailInput = activeFrame.$x(".//input[@name='email']");
    public static final SelenideElement passwordInput = activeFrame.$x(".//input[@name='password']");
    public static final SelenideElement loginButton = activeFrame.$x(".//button[contains(text(),'Войти')]");
    public static final ElementsCollection loginErrorButtons = activeFrame.$$(".btn-error");

    public void login(String email, String password) {
        emailInput.setValue(email);
        passwordInput.setValue(password);
        loginButton.click();
    }
    public void checkLoginError() {
        loginErrorButtons.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
