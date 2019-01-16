import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPage {

    private By searchTextField = By.name("q");
    private String submitBtn = "[name=btnK]";

    public GoogleSearchResultsPage searchForByClickingButton(String text) {
        open("https://google.com");

        $(searchTextField).setValue(text);
        $(submitBtn).click();

        return new GoogleSearchResultsPage();
    }

    public GoogleSearchResultsPage searchForByPressingEnter(String text) {
        open("https://google.com");

        $(searchTextField).setValue(text);
        $(searchTextField).pressEnter();

        return new GoogleSearchResultsPage();
    }

}
