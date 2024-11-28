package a13Tp1.Prototype.view;

import a13Tp1.Prototype.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainController controller = new MainController();

        // Method to clone the prototype
        Label header = new Label("Prototype Pattern with JavaFX");
        header.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        header.setLayoutX(200);
        header.setLayoutY(20);

        // Create the main pane and add buttons
        Pane root = new Pane(header, controller.getDefaultButton(), controller.getSubmitButton(), controller.getCancelButton());
        Scene scene = new Scene(root, 800, 300);

        primaryStage.setTitle("Prototype Pattern with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}