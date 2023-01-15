import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    String message;

    @BeforeEach
    public void setUp() {
        message = "Hello, World!";
    }

    @Test
    public void testHelloWorld() {
        String expected = "Hello, World!";
        assertEquals(expected, message);
    }
}