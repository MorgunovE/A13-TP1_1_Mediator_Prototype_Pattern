package a13Tp1.Prototype.view;

import a13Tp1.Prototype.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainController controller = new MainController();

        Label header = new Label("Prototype Pattern with JavaFX");
        header.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        header.setLayoutX(200);
        header.setLayoutY(20);

        Pane root = new Pane(header);
        addButtonToPane(root, controller.getDefaultButton());
        addButtonToPane(root, controller.getSubmitButton());
        addButtonToPane(root, controller.getCancelButton());

        Scene scene = new Scene(root, 800, 300);

        primaryStage.setTitle("Prototype Pattern with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addButtonToPane(Pane pane, Button button) {
        if (button != null) {
            pane.getChildren().add(button);
        } else {
            System.err.println("Button is null and cannot be added to the pane.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}