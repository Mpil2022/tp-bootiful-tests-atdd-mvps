package serenity.pages;

@RunWith(SpringIntegrationSerenityRunner.class)
@ContextConfiguration(locations = "classpath:adder-beans.xml")
public class AdderStepsIntegrationTest {
    @Steps private AdderSteps adderSteps;

    @Value("#{props['adder']}") private int adder;

    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenNumber();
        adderSteps.whenAdd(adder);
        adderSteps.thenSummedUp();
    }
}