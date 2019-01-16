import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {

    @Test
    public void firstTest() {
        GoogleSearchPage searchPage = new GoogleSearchPage();

        searchPage.searchForByClickingButton("Nortal");

        $$(".g").shouldHaveSize(12);
        $$(".g").first()
                .$("cite").shouldHave(matchText("https://nortal.com/.*"));
    }

    @Test
    public void secondTest() {
        GoogleSearchPage searchPage = new GoogleSearchPage();

        GoogleSearchResultsPage resultsPage = searchPage.searchForByPressingEnter("Nortal");

        resultsPage.getResults().shouldHaveSize(12);
        resultsPage.shouldHaveFirstResultWithCite("https://nortal.com/.*");
    }

}
