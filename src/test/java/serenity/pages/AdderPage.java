package serenity.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:4200")
public class AdderPage extends PageObject{

    @FindBy(name="inputadder")
    private WebElementFacade inputadder;

    @FindBy(name="buttonadder")
    private WebElementFacade buttonadder;

    public void typed(String keyword) {
        inputadder.type(keyword);
    }

    public void clicked() {
        buttonadder.click();
    }

    public String getResult() {
        WebElementFacade res = find(By.tagName("p"));
        return res.getText();
    }

}