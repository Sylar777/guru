import Pages.LoginPage;
import Pages.TeachPage;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class LoginTests extends BaseTest {
    private final LoginPage loginPage;
    private final TeachPage teachPage;
    private final String correctEmail;
    private final String correctPassword;
    private final String invalidPassword;

    public LoginTests() {
        loginPage = new LoginPage();
        teachPage = new TeachPage();
        correctEmail = System.getenv("EMAIL");
        correctPassword = System.getenv("PASSWORD");
        invalidPassword = UUID.randomUUID().toString();
    }
    @Test
    void loginWithInvalidPasswordTest() {
        loginPage.login(correctEmail, invalidPassword);
        loginPage.checkLoginError();
    }
    @Test
    void successfulLoginTest() {
        loginPage.login(correctEmail, correctPassword);
        teachPage.checkListOfTrainingsTitleShown();
    }
}
