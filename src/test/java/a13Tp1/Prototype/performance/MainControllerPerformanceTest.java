package a13Tp1.Prototype.performance;

import a13Tp1.Prototype.controller.MainController;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMillis;

/**
 * Performance tests for the MainController class.
 * This class tests the performance of button creation methods in the MainController.
 * It extends ApplicationTest to initialize the JavaFX toolkit.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
class MainControllerPerformanceTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    /**
     * Tests the performance of button creation methods.
     * Ensures that the creation of default, submit, and cancel buttons completes within the specified time limit.
     */
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