import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static Pages.LoginPage.LOGIN_PAGE_URL;

public class BaseTest {
    @BeforeEach
    void setUp() {
        Configuration.pageLoadStrategy = "eager";
        open(LOGIN_PAGE_URL);
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWindow();
    }
}
