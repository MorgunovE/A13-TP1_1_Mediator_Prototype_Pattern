package a13Tp1.Prototype.controller;

import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MainController class.
 * This class tests the creation and properties of buttons created by the MainController.
 * It extends ApplicationTest to initialize the JavaFX toolkit.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
class MainControllerTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    /**
     * Tests the creation and properties of the default button.
     * Ensures the button is not null and has the expected text.
     */
    @Test
    void testGetDefaultButton() {
        MainController controller = new MainController();
        Button button = controller.getDefaultButton();
        assertNotNull(button);
        assertEquals("Default Button", button.getText());
    }

    /**
     * Tests the creation and properties of the submit button.
     * Ensures the button is not null and has the expected text.
     */
    @Test
    void testGetSubmitButton() {
        MainController controller = new MainController();
        Button button = controller.getSubmitButton();
        assertNotNull(button);
        assertEquals("Submit", button.getText());
    }

    /**
     * Tests the creation and properties of the cancel button.
     * Ensures the button is not null and has the expected text.
     */
    @Test
    void testGetCancelButton() {
        MainController controller = new MainController();
        Button button = controller.getCancelButton();
        assertNotNull(button);
        assertEquals("Cancel", button.getText());
    }
}