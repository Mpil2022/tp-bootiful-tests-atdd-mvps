package serenity;

import net.serenitybdd.jbehave.SerenityStories;
import org.junit.Rule;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;


public class AcceptanceTestSuite extends SerenityStories {

    public GenericContainer front;
    public GenericContainer back;

    public void testContainer(){
        front = new GenericContainer(DockerImageName.parse("tp-bootiful-tests-as-ui-docker-mvps"))
                .withExposedPorts(4200);
        back = new GenericContainer(DockerImageName.parse("tp-bootiful-tests-api-mvps"))
                .withExposedPorts(8080);
        front.start();
        back.start();
    }
}
