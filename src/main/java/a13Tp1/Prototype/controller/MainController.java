package a13Tp1.Prototype.controller;

import a13Tp1.Prototype.model.ButtonPrototype;
import a13Tp1.Prototype.model.PrototypeRegistry;
import javafx.animation.ScaleTransition;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class MainController {
    private PrototypeRegistry registry;

    public MainController() {
        registry = new PrototypeRegistry();
        addDefaultPrototypes();
    }

    private void addDefaultPrototypes() {
        registry.addPrototype("defaultButton", new ButtonPrototype("Default Button", Color.LIGHTGRAY, Color.BLACK, 14, 50, 100, "normal", 150, new DropShadow(10, Color.GRAY)));
        registry.addPrototype("submitButton", new ButtonPrototype("Submit", Color.GREEN, Color.WHITE, 16, 300, 100, "bold", 150, new DropShadow(10, Color.DARKGREEN)));
        registry.addPrototype("cancelButton", new ButtonPrototype("Cancel", Color.RED, Color.WHITE, 16, 550, 100, "bold", 150, new DropShadow(10, Color.DARKRED)));
    }

    public Button getDefaultButton() {
        try {
            return createButton((ButtonPrototype) registry.getPrototype("defaultButton"));
        } catch (Exception e) {
            showError("Error creating Default Button: " + e.getMessage());
            return null;
        }
    }

    public Button getSubmitButton() {
        try {
            return createButton((ButtonPrototype) registry.getPrototype("submitButton"));
        } catch (Exception e) {
            showError("Error creating Submit Button: " + e.getMessage());
            return null;
        }
    }

    public Button getCancelButton() {
        try {
            return createButton((ButtonPrototype) registry.getPrototype("cancelButton"));
        } catch (Exception e) {
            showError("Error creating Cancel Button: " + e.getMessage());
            return null;
        }
    }

    public Button createButton(ButtonPrototype prototype) {
        try {
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

            addAnimation(button, prototype.getAnimationDuration());

            return button;
        } catch (Exception e) {
            showError("Error creating button: " + e.getMessage());
            return null;
        }
    }

    private void addAnimation(Button button, double duration) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(duration), button);
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
    }

    private void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}