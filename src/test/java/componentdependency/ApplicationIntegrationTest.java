package componentdependency;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationIntegrationTest {
    private Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = DaggerApplicationComponent.create().controller();
    }

    @Test
    public void shouldGreetVisitor() throws Exception {
        String response = controller.handleRequest("World");
        assertThat(response).isEqualTo("Hello World");
    }
}
