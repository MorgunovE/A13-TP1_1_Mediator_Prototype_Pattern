package a13Tp1.Prototype.acceptance;

import a13Tp1.Prototype.controller.MainController;
import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Acceptance tests for the MainController class.
 * This class tests the compliance of buttons created by the MainController.
 * It extends ApplicationTest to initialize the JavaFX toolkit.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
class MainControllerAcceptanceTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    /**
     * Tests the compliance of the default button created by the MainController.
     * Ensures the button is not null and has the expected properties.
     */
    @Test
    void testDefaultButtonCompliance() {
        MainController controller = new MainController();
        Button button = controller.getDefaultButton();
        assertNotNull(button);
        assertEquals("Default Button", button.getText());
        assertEquals(200, button.getPrefWidth());
        assertEquals(50, button.getPrefHeight());
    }

    /**
     * Tests the compliance of the submit button created by the MainController.
     * Ensures the button is not null and has the expected properties.
     */
    @Test
    void testSubmitButtonCompliance() {
        MainController controller = new MainController();
        Button button = controller.getSubmitButton();
        assertNotNull(button);
        assertEquals("Submit", button.getText());
        assertEquals(200, button.getPrefWidth());
        assertEquals(50, button.getPrefHeight());
    }

    /**
     * Tests the compliance of the cancel button created by the MainController.
     * Ensures the button is not null and has the expected properties.
     */
    @Test
    void testCancelButtonCompliance() {
        MainController controller = new MainController();
        Button button = controller.getCancelButton();
        assertNotNull(button);
        assertEquals("Cancel", button.getText());
        assertEquals(200, button.getPrefWidth());
        assertEquals(50, button.getPrefHeight());
    }
}