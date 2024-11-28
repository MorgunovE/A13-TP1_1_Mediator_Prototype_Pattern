package a13Tp1.Prototype.view;

import a13Tp1.Prototype.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main view for displaying the prototype pattern with JavaFX.
 * This class sets up the JavaFX application and displays buttons created using prototypes.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
public class MainView extends Application {
    private static final Logger logger = LoggerFactory.getLogger(MainView.class);

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

        // Trigger the error to verify logging
//        controller.triggerError();

        Scene scene = new Scene(root, 800, 300);

        primaryStage.setTitle("Prototype Pattern with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Adds a button to the given pane.
     *
     * @param pane the pane to add the button to
     * @param button the button to add
     */
    private void addButtonToPane(Pane pane, Button button) {
        if (button != null) {
            pane.getChildren().add(button);
        } else {
            logger.error("Button is null and cannot be added to the pane.");
            System.err.println("Button is null and cannot be added to the pane.");
        }
    }

    /**
     * The main method to launch the JavaFX application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}