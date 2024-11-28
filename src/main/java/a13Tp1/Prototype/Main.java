package a13Tp1.Prototype;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("defaultButton", new ButtonPrototype("Default Button", Color.LIGHTGRAY, Color.BLACK, 14, 50, 100, "normal", 150, new DropShadow(10, Color.GRAY)));
        registry.addPrototype("submitButton", new ButtonPrototype("Submit", Color.GREEN, Color.WHITE, 16, 300, 100, "bold", 150, new DropShadow(10, Color.DARKGREEN)));
        registry.addPrototype("cancelButton", new ButtonPrototype("Cancel", Color.RED, Color.WHITE, 16, 550, 100, "bold", 150, new DropShadow(10, Color.DARKRED)));

        Button defaultButton = createButton((ButtonPrototype) registry.getPrototype("defaultButton"));
        Button submitButton = createButton((ButtonPrototype) registry.getPrototype("submitButton"));
        Button cancelButton = createButton((ButtonPrototype) registry.getPrototype("cancelButton"));

        Label header = new Label("Prototype Pattern with JavaFX");
        header.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        header.setLayoutX(200);
        header.setLayoutY(20);

        Pane root = new Pane(header, defaultButton, submitButton, cancelButton);
        Scene scene = new Scene(root, 800, 300);

        primaryStage.setTitle("Prototype Pattern with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

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

    public static void main(String[] args) {
        launch(args);
    }
}