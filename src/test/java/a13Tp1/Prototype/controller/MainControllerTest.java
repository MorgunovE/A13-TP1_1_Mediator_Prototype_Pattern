package a13Tp1.Prototype.controller;

import a13Tp1.Prototype.controller.MainController;
import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    @Test
    void testGetDefaultButton() {
        MainController controller = new MainController();
        Button button = controller.getDefaultButton();
        assertNotNull(button);
        assertEquals("Default Button", button.getText());
    }

    @Test
    void testGetSubmitButton() {
        MainController controller = new MainController();
        Button button = controller.getSubmitButton();
        assertNotNull(button);
        assertEquals("Submit", button.getText());
    }

    @Test
    void testGetCancelButton() {
        MainController controller = new MainController();
        Button button = controller.getCancelButton();
        assertNotNull(button);
        assertEquals("Cancel", button.getText());
    }
}