package a13Tp1.Prototype;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("defaultButton", new ButtonPrototype("Click Me"));
        registry.addPrototype("submitButton", new ButtonPrototype("Submit"));
        registry.addPrototype("cancelButton", new ButtonPrototype("Cancel"));

        Button defaultButton = new Button();
        defaultButton.setText(((ButtonPrototype) registry.getPrototype("defaultButton")).getLabel());

        Button submitButton = new Button();
        submitButton.setText(((ButtonPrototype) registry.getPrototype("submitButton")).getLabel());

        Button cancelButton = new Button();
        cancelButton.setText(((ButtonPrototype) registry.getPrototype("cancelButton")).getLabel());

        VBox root = new VBox(defaultButton, submitButton, cancelButton);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Prototype Pattern with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}