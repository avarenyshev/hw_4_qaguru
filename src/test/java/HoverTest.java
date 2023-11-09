import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class HoverTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void testHoverGithub(){
    //Открыть GitGub
    open("https://github.com/");
    $(byText("Solutions")).hover();
    $("[href='/enterprise']").click();
    $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
            "developer platform"));
    }


}
