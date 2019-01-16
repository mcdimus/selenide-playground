import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestClass {

    @Test
    public void test() {
        System.setProperty("selenide.browser", "firefox");
        Selenide.open("https://google.com");

        $(By.name("q")).val("Nortal");
        $(By.name("q")).setValue("Nortal");

        $(".gLFyf").click();
        $("[title=Search]");
        $(".loading_progress").should(disappear);
        $("#username").shouldHave(text("Hello, Johny!"));


        $(".class").


    }

}
