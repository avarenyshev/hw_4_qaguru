import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class DragNDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void dragNDroptest() {
        //открываем https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перетаскиваем А на Б
        SelenideElement selenideElement = $(element("#column-a")).dragAndDropTo("#column-b");
        //Проверяем результат
        $("#column-a").shouldHave(exactText("B"));
        $("#column-b").shouldHave(exactText("A"));

    }

}
