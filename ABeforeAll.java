import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    static String message;

    @BeforeAll
    public static void setUp() {
        message = "Hello, World!";
    }

    @Test
    public void testHelloWorld() {
        String expected = "Hello, World!";
        assertEquals(expected, message);
    }
}