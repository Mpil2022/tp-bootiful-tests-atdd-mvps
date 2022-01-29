package serenity.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://localhost:8080")
@ContextConfiguration(classes = AdderService.class)
public class AdderServiceSteps {

    @Autowired
    private AdderService adderService;

    private int givenNumber;
    private int base;
    private int sum;

    public void givenBaseAndAdder(int base, int adder) {
        this.base = base;
        adderService.baseNum(base);
        this.givenNumber = adder;
    }

    public void whenAdd() {
        sum = adderService.add(givenNumber);
    }

    public void summedUp() {
        assertEquals(base + givenNumber, sum);
    }

    public void sumWrong() {
        assertNotEquals(base + givenNumber, sum);
    }

    public void whenAccumulate() {
        sum = adderService.accumulate(givenNumber);
    }
}