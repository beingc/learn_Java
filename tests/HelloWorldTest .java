import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("Hello World", new HelloWorld().getMessage());
    }
}

class HelloWorld {
    public String getMessage() {
        return "Hello World";
    }
}
