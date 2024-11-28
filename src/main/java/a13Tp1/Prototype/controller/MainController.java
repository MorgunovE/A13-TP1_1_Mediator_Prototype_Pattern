package a13Tp1.Prototype.controller;

import a13Tp1.Prototype.model.ButtonPrototype;
import a13Tp1.Prototype.model.PrototypeRegistry;
import javafx.animation.ScaleTransition;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class MainController {
    private PrototypeRegistry registry;

    /**
     * Controller for managing button prototypes and their creation.
     */
    public MainController() {
        registry = new PrototypeRegistry();
        // Add default button prototypes to the registry
        registry.addPrototype("defaultButton", new ButtonPrototype("Default Button", Color.LIGHTGRAY, Color.BLACK, 14, 50, 100, "normal", 150, new DropShadow(10, Color.GRAY)));
        registry.addPrototype("submitButton", new ButtonPrototype("Submit", Color.GREEN, Color.WHITE, 16, 300, 100, "bold", 150, new DropShadow(10, Color.DARKGREEN)));
        registry.addPrototype("cancelButton", new ButtonPrototype("Cancel", Color.RED, Color.WHITE, 16, 550, 100, "bold", 150, new DropShadow(10, Color.DARKRED)));
    }

    // Add default button prototypes to the registry
    public Button getDefaultButton() {
        return createButton((ButtonPrototype) registry.getPrototype("defaultButton"));
    }

    // Create and return a submit button
    public Button getSubmitButton() {
        return createButton((ButtonPrototype) registry.getPrototype("submitButton"));
    }

    // Create and return a cancel button
    public Button getCancelButton() {
        return createButton((ButtonPrototype) registry.getPrototype("cancelButton"));
    }

    // Create a button based on the given prototype
    private Button createButton(ButtonPrototype prototype) {
        Button button = new Button();
        button.setText(prototype.getLabel());
        button.setPrefSize(200, 50);
        button.setLayoutX(prototype.getX());
        button.setLayoutY(prototype.getY());
        button.setStyle(String.format("-fx-background-color: #%02x%02x%02x; -fx-text-fill: #%02x%02x%02x; -fx-font-size: %.1fpx; -fx-font-weight: %s; -fx-background-radius: 12px;",
                (int) (prototype.getBackgroundColor().getRed() * 255),
                (int) (prototype.getBackgroundColor().getGreen() * 255),
                (int) (prototype.getBackgroundColor().getBlue() * 255),
                (int) (prototype.getTextColor().getRed() * 255),
                (int) (prototype.getTextColor().getGreen() * 255),
                (int) (prototype.getTextColor().getBlue() * 255),
                prototype.getFontSize(),
                prototype.getFontWeight()));
        button.setEffect(prototype.getShadowEffect());

        // Add animation for button press
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(prototype.getAnimationDuration()), button);
        button.setOnMousePressed(event -> {
            scaleTransition.setToX(0.95);
            scaleTransition.setToY(0.95);
            scaleTransition.playFromStart();
        });
        button.setOnMouseReleased(event -> {
            scaleTransition.setToX(1.0);
            scaleTransition.setToY(1.0);
            scaleTransition.playFromStart();
        });

        return button;
    }
}