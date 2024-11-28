package a13Tp1.Prototype.integration;

import a13Tp1.Prototype.controller.MainController;
import a13Tp1.Prototype.model.ButtonPrototype;
import a13Tp1.Prototype.model.PrototypeRegistry;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for the MainController class.
 * This class tests the integration of MainController with the PrototypeRegistry and ButtonPrototype.
 * It extends ApplicationTest to initialize the JavaFX toolkit.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
class MainControllerIntegrationTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    /**
     * Tests the creation of a button using a prototype from the registry.
     * Ensures the button is not null and has the expected properties.
     */
    @Test
    void testButtonCreation() {
        MainController controller = new MainController();
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("testButton",
                new ButtonPrototype("Test", Color.BLUE,
                        Color.WHITE, 14, 100, 100,
                        "normal", 150,
                        new DropShadow(10, Color.GRAY)));

        ButtonPrototype prototype = (ButtonPrototype) registry
                .getPrototype("testButton");
        Button button = controller.createButton(prototype);

        assertNotNull(button);
        assertEquals("Test", button.getText());
    }
}