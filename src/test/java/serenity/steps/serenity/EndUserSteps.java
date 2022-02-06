package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.AdderPage;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class EndUserSteps {

    AdderPage adderPage;

    @Step
    public void enters(String number) {
        adderPage.changed(number);
    }

    @Step
    public void changed(String number) {
        adderPage.changed(number);
    }

    @Step
    public void add() {
        adderPage.clicked();
    }

    @Step
    public void should_see_number(String number) {
        assertThat(adderPage.getResult(), hasItem(containsString(number)));
    }

    @Step
    public void is_the_home_page() {
        adderPage.open();
    }
}