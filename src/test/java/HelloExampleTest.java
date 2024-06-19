import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloExampleTest {
    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        HelloExample main = new HelloExample();
        Assertions.assertNotNull(main);
    }

}
