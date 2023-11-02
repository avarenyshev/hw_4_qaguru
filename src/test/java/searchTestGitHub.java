import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class searchTestGitHub {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
//Открыть GitGub
        open("https://github.com/");
// Выполнить поиск по 'Selenide'
        $("[placeholder='Search or jump to...']").setValue("selenide").pressEnter();
// Открыть страницу 'Selenide'
//Перейдите в раздел Wiki проекта
//Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
// Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }
}
