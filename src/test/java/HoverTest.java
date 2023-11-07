import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class HoverTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void testHoverGithub(){
    //Открыть GitGub
    open("https://github.com/");
    $("#d-lg-flex list-style-none").$(byText("solutions")).hover();
    }


}
