import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchResultsPage {

    private String searchResultClass = ".g";

    public ElementsCollection getResults() {
        return $$(searchResultClass);
    }

    public SelenideElement getFirstResult() {
        return getResults().first();
    }

    public void shouldHaveFirstResultWithCite(String citeValue) {
        getFirstResult().$("cite").shouldHave(matchText(citeValue));
    }

}
