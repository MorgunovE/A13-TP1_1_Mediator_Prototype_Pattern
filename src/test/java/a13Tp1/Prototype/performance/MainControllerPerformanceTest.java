package a13Tp1.Prototype.performance;

import a13Tp1.Prototype.controller.MainController;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMillis;

class MainControllerPerformanceTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    @Test
    void testButtonCreationPerformance() {
        MainController controller = new MainController();
        assertTimeout(ofMillis(100), () -> {
            controller.getDefaultButton();
            controller.getSubmitButton();
            controller.getCancelButton();
        });
    }
}