package a13Tp1.Mediator.view;
import a13Tp1.Mediator.controller.Mediator;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AuthenticationDialog {
    private String title;
    private boolean loginOrRegister;
    private TextField usernameField, passwordField, emailField;
    private Button okButton, cancelButton;
    private CheckBox rememberMe;
    private VBox root;
    private Mediator mediator;

    public AuthenticationDialog(String title, boolean loginOrRegister, Mediator mediator) {
        this.title = title;
        this.loginOrRegister = loginOrRegister;
        this.mediator = mediator;

        // Create UI elements
        usernameField = new TextField();
        passwordField = new PasswordField();
        emailField = new TextField();
        okButton = new Button("OK");
        cancelButton = new Button("Cancel");
        rememberMe = new CheckBox("Remember me");

        // Set up the layout
        root = new VBox(10); // Adjust spacing as needed
        root.getChildren().addAll(usernameField, passwordField, emailField, rememberMe, okButton, cancelButton);

        // Set up event handlers
        okButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String email = emailField.getText();
           // mediator.notify(this, "login", username, password, email);
        });

        cancelButton.setOnAction(event -> {
            // Close the dialog
            Stage stage = (Stage) root.getScene().getWindow();
            stage.close();
        });
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}