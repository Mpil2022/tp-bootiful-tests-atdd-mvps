package serenity;

import net.serenitybdd.jbehave.SerenityStories;
import org.junit.Rule;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;


public class AcceptanceTestSuite extends SerenityStories {

    // rule {
    @Rule
    public GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine"))
            .withExposedPorts(8081);
    // }
}
