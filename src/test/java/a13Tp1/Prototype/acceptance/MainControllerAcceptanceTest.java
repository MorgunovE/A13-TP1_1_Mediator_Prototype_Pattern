package a13Tp1.Prototype.acceptance;

import a13Tp1.Prototype.controller.MainController;
import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerAcceptanceTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    @Test
    void testDefaultButtonCompliance() {
        MainController controller = new MainController();
        Button button = controller.getDefaultButton();
        assertNotNull(button);
        assertEquals("Default Button", button.getText());
        assertEquals(200, button.getPrefWidth());
        assertEquals(50, button.getPrefHeight());
    }

    @Test
    void testSubmitButtonCompliance() {
        MainController controller = new MainController();
        Button button = controller.getSubmitButton();
        assertNotNull(button);
        assertEquals("Submit", button.getText());
        assertEquals(200, button.getPrefWidth());
        assertEquals(50, button.getPrefHeight());
    }

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