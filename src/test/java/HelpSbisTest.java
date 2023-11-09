import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class HelpSbisTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }
@Test
    void searchHelpTest(){
        open("https://sbis.ru/help/");
    $(byName("ws-input_2023-11-08")).click();
}
}
