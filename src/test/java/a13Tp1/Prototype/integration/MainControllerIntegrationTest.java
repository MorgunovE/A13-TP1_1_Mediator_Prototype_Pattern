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

class MainControllerIntegrationTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        // This method is required to initialize the JavaFX toolkit
    }

    @Test
    void testButtonCreation() {
        MainController controller = new MainController();
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("testButton", new ButtonPrototype("Test", Color.BLUE, Color.WHITE, 14, 100, 100, "normal", 150, new DropShadow(10, Color.GRAY)));

        ButtonPrototype prototype = (ButtonPrototype) registry.getPrototype("testButton");
        Button button = controller.createButton(prototype);

        assertNotNull(button);
        assertEquals("Test", button.getText());
    }
}