package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Need to check that Google Doodles 'about' page exists")
    void test() {

        step("Open https://www.google.com/", () -> {
            // todo
        });

        step("Press on \"I'm feeling lucky\" button", () -> {
            // todo
        });

        step("Go to \"About\" page", () -> {
            // todo
        });

        step("Find in the description \"Doodles are the fun, surprising, and sometimes spontaneous changes\"", () -> {
            // todo
        });

    }
}