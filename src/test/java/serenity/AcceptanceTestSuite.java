package serenity;

import net.serenitybdd.jbehave.SerenityStories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTestSuite extends SerenityStories {

    private RedisBackedCache underTest;

    @Before
    public void setUp() {
        // Assume that we have Redis running locally?
        underTest = new RedisBackedCache("localhost", 6379);
    }

    @Test
    public void testSimplePutAndGet() {
        underTest.put("test", "example");

        String retrieved = underTest.get("test");
        assertEquals("example", retrieved);
    }
}
