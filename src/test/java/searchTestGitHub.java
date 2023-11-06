import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Href;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class searchTestGitHub {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
//Открыть GitGub
        open("https://github.com/");
// Выполнить поиск по 'Selenide'
        $(byText("Search or jump to...")).click();
        $(byName("query-builder-test")).setValue("selenide").pressEnter();
        // Открыть страницу 'Selenide'
        $(byXpath("//a[@href='/selenide/selenide']")).click();
//Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
//Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        // Откройте страницу SoftAssertions
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
//проверьте что внутри есть пример кода для JUnit5
        $("#user-content-3-using-junit5-extend-test-class").sibling(0).shouldHave(exactText("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));

    }

}
