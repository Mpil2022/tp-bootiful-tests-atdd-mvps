package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Test;
import serenity.pages.AdderPage;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;

public class EndUserSteps {

    AdderPage adderPage;

    @Step
    public void is_the_home_page() {
        adderPage.open();
    }

    @Step
    public void enters(String number) {
        adderPage.typed(number);
    }

    @Step
    public void adds() {
        adderPage.clicked();
    }

    @Test
    public void should_see_number(String number) {
        adds();
        assertEquals(adderPage.getResult(), number);
    }
}