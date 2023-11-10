import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class DragNDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;}

@Test
    void dragNDroptest(){
        //открываем https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
    SelenideElement selenideElement = $(element("#column-a")).dragAndDropTo("#column-b");
    $("#column-a").shouldHave(Condition.value("<header>B</header>"));
}

}
